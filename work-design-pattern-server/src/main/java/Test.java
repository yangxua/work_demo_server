import aggregate.AbstractObjectList;
import concreteaggregate.ProductList;
import iterator.AbstractIterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: allanyang
 * @Date: 2019/4/6 12:49
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        List products = new ArrayList();
        products.add("倚天剑");
        products.add("屠龙刀");
        products.add("断肠草");
        products.add("葵花宝典");
        products.add("四十二章经");

        AbstractObjectList list;
        AbstractIterator iterator;
        list = new ProductList(products);
        iterator = list.createIterator();

        System.out.println("正向便利");
        while(!iterator.isLast()) {
            System.out.print(iterator.getNextItem() + ",");
            iterator.next();
        }

        System.out.println();
        System.out.println("你想便利");
        while(!iterator.isFirst()) {
            System.out.print(iterator.getPreviousItem() + ",");
            iterator.previous();
        }
    }
}