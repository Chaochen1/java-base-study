package main.java.com.bs.designpattern.creational.singleton.hungry;

/**
 * @author cc
 */
public class HungrySingletonTest {

    public static void main(String[] args) {
        HungrySingleton hs0 = HungrySingleton.getHungrySingleton();
        HungrySingleton hs1 = HungrySingleton.getHungrySingleton();
        System.out.println(hs0.getRamAddress());
        System.out.println(hs1.getRamAddress());
    }

}
