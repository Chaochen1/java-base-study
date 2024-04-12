package main.java.com.bs.designpattern.creational.singleton.lazy;

/**
 * @author cc
 */
public class LazySingleton {

    private static LazySingleton lazySingleton;

    private LazySingleton() {};

    /**
     * 该方法存在线程安全问题
     * @return LazySingleton类对象
     */
    public static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

    /**
     *
     * @return 对象hashcode
     */
    public long getRamAddress() {
        return this.hashCode();
    }

}
