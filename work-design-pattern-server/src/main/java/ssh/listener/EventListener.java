package ssh.listener;

import ssh.event.EventObject;

/**
 * @Auther: allanyang
 * @Date: 2019/4/13 13:41
 * @Description:
 */
public interface EventListener {

    void update(EventObject event);
}