package headfirst.subject;

import headfirst.observer.Observer;

/**
 * @Auther: allanyang
 * @Date: 2019/4/13 13:09
 * @Description:
 */
public interface Subject {

    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}