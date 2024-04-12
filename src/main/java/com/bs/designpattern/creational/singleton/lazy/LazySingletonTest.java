package main.java.com.bs.designpattern.creational.singleton.lazy;

/**
 * @author cc
 */
public class LazySingletonTest {

    public static void main(String[] args) {
        LazySingleton ls0 = LazySingleton.getInstance();
        LazySingleton ls1 = LazySingleton.getInstance();
        System.out.println(ls0.getRamAddress());
        System.out.println(ls1.getRamAddress());
    }

}
