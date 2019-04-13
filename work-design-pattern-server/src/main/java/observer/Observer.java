package observer;

import subject.AllyControlCenter;

/**
 * @Auther: allanyang
 * @Date: 2019/4/13 11:53
 * @Description:
 */
public interface Observer {

    String getName();
    void setName(String name);
    void help();
    void beAttacked(AllyControlCenter acc);
}