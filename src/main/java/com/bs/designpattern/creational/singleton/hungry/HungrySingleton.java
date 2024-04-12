package main.java.com.bs.designpattern.creational.singleton.hungry;

/**
 * @author cc
 */
public class HungrySingleton {

    private static HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton(){};

    public static HungrySingleton getHungrySingleton() {
        return hungrySingleton;
    }

    /**
     *
     * @return 对象hashcode
     */
    public long getRamAddress() {
        return this.hashCode();
    }

}
