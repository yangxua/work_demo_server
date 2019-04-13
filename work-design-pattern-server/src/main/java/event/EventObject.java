package event;

import java.io.Serializable;

/**
 * Created by ssh on 2016/7/20.
 *
 * 所有事件的基类
 */
public class EventObject implements Serializable {
    private static final long serialVersionUID = 7002186636022312555L;

    // 事件源，对应一个Java类
    private Object source;

    // 事件描述
    private String remark;

    public EventObject(Object source, String remark) {
        this.source = source;
        this.remark = remark;
    }

    public EventObject(Object source) {
        this.source = source;
    }

    public Object getSource() {
        return source;
    }

    public void setSource(Object source) {
        this.source = source;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
