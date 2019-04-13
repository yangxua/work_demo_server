package ssh.event;

import java.util.List;

/**
 * @Auther: allanyang
 * @Date: 2019/4/13 13:43
 * @Description:
 */
public class HelloEvent extends EventObject {
    private static final long serialVersionUID = 5081889033709812079L;

    List<Integer> numberList;

    public HelloEvent(Object source, String remark, List<Integer> numberList) {
        super(source, remark);
        this.numberList = numberList;
    }

    public List<Integer> getNumberList() {
        return numberList;
    }

    public void setNumberList(List<Integer> numberList) {
        this.numberList = numberList;
    }
}