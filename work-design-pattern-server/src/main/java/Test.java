import concreteobserver.Player;
import concretesubject.ConcreteAllyControlCenter;
import observer.Observer;
import subject.AllyControlCenter;

/**
 * @Auther: allanyang
 * @Date: 2019/4/6 12:49
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        AllyControlCenter acc = new ConcreteAllyControlCenter("金庸群侠");
        Observer p1,p2,p3,p4;
        p1 = new Player("杨过");
        acc.join(p1);

        p2 = new Player("令狐冲");
        acc.join(p2);

        p3 = new Player("张无忌");
        acc.join(p3);

        p4 = new Player("段誉");
        acc.join(p4);

        //某成员遭受攻击
        p1.beAttacked(acc);

    }
}