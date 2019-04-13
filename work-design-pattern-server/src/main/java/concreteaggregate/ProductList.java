package concreteaggregate;

import aggregate.AbstractObjectList;
import concreteiterator.ProductIterator;
import iterator.AbstractIterator;

import java.util.List;

/**
 * @Auther: allanyang
 * @Date: 2019/4/11 20:21
 * @Description:
 */
public class ProductList extends AbstractObjectList  {

    public ProductList(List objects) {
        super(objects);
    }

    @Override
    public AbstractIterator createIterator() {
        return new ProductIterator(this);
    }
}