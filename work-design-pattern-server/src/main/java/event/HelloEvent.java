package event;

import java.util.List;

/**
 * Created by ssh on 2016/7/20.
 */
public class HelloEvent extends EventObject {
    private static final long serialVersionUID = 5081889033709812079L;

    private List<Integer> numberList;

    public HelloEvent(Object source, String remark, List<Integer> numberList)
    {
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
