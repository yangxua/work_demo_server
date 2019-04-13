package event;

import java.io.Serializable;

/**
 * Created by ssh on 2016/7/20.
 *
 * 事件监听容器包装类
 */
public class EventListenerContainer implements Serializable{
    private static final long serialVersionUID = -1842232495988284358L;

    private EventListener listener;

    private boolean isBock;

    public EventListener getListener() {
        return listener;
    }

    public void setListener(EventListener listener) {
        this.listener = listener;
    }

    public boolean isBock() {
        return isBock;
    }

    public void setBock(boolean isBock) {
        this.isBock = isBock;
    }
}
