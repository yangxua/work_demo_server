package ssh.listener;

import ssh.annotation.Listener;
import ssh.event.EventObject;
import ssh.event.HelloEvent;

/**
 * @Auther: allanyang
 * @Date: 2019/4/13 13:49
 * @Description:
 */
@Listener(events = { HelloEvent.class } )
public class HelloListener implements EventListener {

    @Override
    public void update(EventObject event) {
        System.out.println("Hello事件被触发, " + event.getRemark());
    }
}