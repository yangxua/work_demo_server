package headfirst.observer;

/**
 * @Auther: allanyang
 * @Date: 2019/4/13 13:10
 * @Description:
 */
public interface Observer {

    void update(float temp, float humidity, float pressure);
}