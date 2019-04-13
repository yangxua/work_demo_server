package event.annotation;

import com.fenqile.work.common.event.EventObject;

import java.lang.annotation.*;

/**
 * Created by ssh on 2016/7/20.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface Listener {
    boolean isBlock() default false;//是否阻塞运行

    Class<? extends EventObject>[] events();
}
