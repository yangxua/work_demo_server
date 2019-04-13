package iterator;

/**
 * @Auther: allanyang
 * @Date: 2019/4/11 20:19
 * @Description:
 */

/**
 * 迭代器模式和适配器模式其实是一回事，只不过迭代器模式中是通过createIterator来创建适配器（迭代器）的
 */
public interface AbstractIterator {

    void next();
    boolean isLast();
    void previous();
    boolean isFirst();
    Object getNextItem();
    Object getPreviousItem();

}