package event;

import com.fenqile.work.common.event.annotation.Listener;

/**
 * Created by ssh on 2016/7/20.
 */
@Listener(events = { HelloEvent.class })
public class HelloListener implements EventListener {

    @Override
    public void update(EventObject eventObject) {
        System.out.println("Hello事件被触发, " + eventObject.getRemark());
    }
}
