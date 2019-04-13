package event;

/**
 * Created by ssh on 2016/7/20.
 *
 * 事件监听器
 * 观察者模式里的Observer
 *
 */
public interface EventListener {
    void update(EventObject eventObject);
}
