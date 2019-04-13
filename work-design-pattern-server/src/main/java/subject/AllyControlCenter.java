package subject;

import observer.Observer;

import java.util.ArrayList;

/**
 * @Auther: allanyang
 * @Date: 2019/4/13 12:40
 * @Description:
 */
public abstract class AllyControlCenter {

    protected String allyName;
    protected ArrayList<Observer> players = new ArrayList<Observer>();

    public void setAllyName(String allyName) {
        this.allyName = allyName;
    }

    public String getAllyName() {
        return this.allyName;
    }

    public void join(Observer obs) {
        System.out.println(obs.getName() + "加入" + this.allyName +"战队！");
        players.add(obs);
    }

    public void quit(Observer obs) {
        System.out.println(obs.getName() + "退出" + this.allyName + "战队！");
    }

    public abstract void notifyObserver(String name);
}