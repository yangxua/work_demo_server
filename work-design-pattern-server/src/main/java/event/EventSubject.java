package event;

import com.fenqile.work.common.event.annotation.Listener;
import com.fenqile.work.common.scanner.AnnotationScanner;
import com.fenqile.work.common.utils.SpringHelpUtil;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.*;
import java.util.EventObject;

/**
 * Created by ssh on 2016/7/20.
 *
 * 事件目标对象
 * 观察者模式里的Subject角色: 它把所有观察者对象的引用保存到一个聚集里，每个主题都可以有任何数量的观察者
 *
 */
public class EventSubject {
    protected static final Map<Class<? extends EventObject>, LinkedHashSet<EventListenerContainer>> eventListenersMap = Collections
            .synchronizedMap(new HashMap<Class<? extends EventObject>, LinkedHashSet<EventListenerContainer>>());

    private static EventSubject instance = null;

    private static final Log logger = LogFactory.getLog(EventSubject.class);

    private EventSubject() {
        eventListenersMap.clear();
        AnnotationScanner scanner = SpringHelpUtil.getBean(AnnotationScanner.class);
        List<Class<?>> classList = scanner.getAnnotationMap().get(Listener.class.getName());
        for (Class<?> clz : classList)
        {
            Listener annotation = clz.getAnnotation(Listener.class);
            EventListener listener = null;
            try
            {
                listener = (EventListener) clz.newInstance();
            }
            catch (Exception e)
            {
                logger.error("初始化事件异常", e);
                //throw new SystemException(e);
            }
            addListener(annotation, listener);
        }
    }

    /*
    * 单例模式
     */
    public static EventSubject getInstance()
    {
        if (instance == null)
        {
            synchronized (EventSubject.class)
            {
                if (instance == null)
                {
                    instance = new EventSubject();
                }
            }
        }
        return instance;
    }

    /*
    * 增加观察者
     */
    public void addListener(Listener annotation, EventListener listener) {
        for (Class<? extends EventObject> type : annotation.events())
        {
            LinkedHashSet<EventListenerContainer> set = eventListenersMap.get(type);
            if (set == null)
            {
                set = new LinkedHashSet<EventListenerContainer>();
                eventListenersMap.put(type, set);
            }
            EventListenerContainer container = new EventListenerContainer();
            container.setListener(listener);
            container.setBock(annotation.isBlock());
            set.add(container);
        }
    }

    /*
    * 移除观察者
     */
    public void removeListener(Class<? extends EventObject> eventObject) {
        eventListenersMap.remove(eventObject);
    }

    /*
    * 向观察者(们)发出事件通知
     */
    public void notify(final EventObject eventObject)
    {
        LinkedHashSet<EventListenerContainer> set = eventListenersMap.get(eventObject.getClass());
        if (set != null)
        {
            for (final EventListenerContainer container : set)
            {
                try
                {
                    if (container.isBock())
                    {
                        container.getListener().update(eventObject);
                    }
                    else
                    {
                        new Thread(new Runnable()
                        {
                            @Override
                            public void run()
                            {
                                container.getListener().update(eventObject);
                            }
                        }).start();
                    }
                }
                catch (Exception ex)
                {
                    logger.error("事件监听器出现异常.{" + container.getListener().getClass().getName() + "}", ex);
                }
            }
        }
    }
}
