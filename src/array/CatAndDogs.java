package array;

import java.util.Vector;

/**
 * Created by dell on 2016/11/29.
 */
public class CatAndDogs {
    public static void main(String[] args){
        Vector cats  = new Vector();
        for (int i = 0; i < 7; i++) {
            cats.addElement(new Cat(i));
        }
        for (int i = 0; i < cats.size(); i++) {
            ((Cat)cats.elementAt(i)).print();
        }
        System.out.println("hello");
    }
}
class Cat{
    private int catNumber;
    Cat(int i ){
        catNumber = i;
    }
    void print(){
        System.out.println("Cat #"+catNumber);
    }
}
class Dog{
    private int dogNumber;
    Dog(int i ){
        dogNumber = i;
    }
    void print(){
        System.out.println("Dog #"+dogNumber);
    }
}
