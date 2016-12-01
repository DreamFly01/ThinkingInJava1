package array;

import java.util.Vector;

/**
 * Created by dell on 2016/12/1.
 */
public class WorksAnyway {
    public static void main(String[] args){
        Vector mice = new Vector();
        for (int i = 0; i < 3; i++) {
            mice.addElement(new Mouse(i));
        }
        for (int i = 0; i < mice.size(); i++) {
            System.out.println("Free mouse:"+mice.elementAt(i));
            MouseTrap.caughtYa(mice.elementAt(i));
        }
    }
}

class Mouse {
    private int mouseMumber;

    Mouse(int i) {
        mouseMumber = i;
    }

    public String toString() {
        return "This is Mouse #" + mouseMumber;
    }
    void print(String msg){
        if (msg != null) {
            System.out.println(msg);
        }
        System.out.println("Mouse number"+mouseMumber);
    }
}
class  MouseTrap{
    static void caughtYa(Object m){
        Mouse moust = (Mouse)m;
        moust.print("Caught one!");
    }
}