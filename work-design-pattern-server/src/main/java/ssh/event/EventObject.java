package ssh.event;

import java.io.Serializable;

/**
 * @Auther: allanyang
 * @Date: 2019/4/13 13:40
 * @Description:
 */
public class EventObject implements Serializable {

    private static final long serialVersionUID = 7002186636022312555L;

    //事件源，对应一个java类
    private Object source;

    //事键描述
    private String remark;

    public EventObject(Object source, String remark) {
        this.source = source;
        this.remark = remark;
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