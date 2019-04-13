package ssh.annotation;

import ssh.event.EventObject;

import java.lang.annotation.*;

/**
 * @Auther: allanyang
 * @Date: 2019/4/13 13:31
 * @Description:
 */
@Documented
@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Listener {

    boolean block() default false;
    Class<? extends EventObject>[] events();
}