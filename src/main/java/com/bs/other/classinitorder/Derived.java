package main.java.com.bs.other.classinitorder;


/**
 * @author cc
 */
public class Derived extends Base{

    public static String derivedStaticField = "子类静态变量";

    public String derivedNoStaticField = "子类非静态变量";

    static {
        System.out.println(derivedStaticField);
        System.out.println("子类静态代码块");
    }

    {
        System.out.println(derivedNoStaticField);
        System.out.println("子类非静态代码块");
    }

    public Derived() {
        System.out.println("子类构造方法");
    }


    /**
     *
     *静态对象（只初始化一次）先于非静态对象（可以初始化多次）初始化
     *
     * 先父类后子类
     * 静态变量->静态代码块
     * 非静态变量->非静态代码块->构造方法
     *
     * 父类静态变量→父类静态代码块→子类静态变量→子类静态代码块→
     * ->父类非静态变量→父类非静态代码块→父类构造方法→子类非静态变量→子类非静态代码块→子类构造方法
     *
     * **/
    public static void main(String[] args) {
        new Derived();
    }
}
