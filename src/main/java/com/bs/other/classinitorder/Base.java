package main.java.com.bs.other.classinitorder;

/**
 * @author cc
 */
public class Base {

    public static String baseStaticField = "父类静态变量";

    public String baseNoStaticField = "父类非静态变量";


    static {
        System.out.println(baseStaticField);
        System.out.println("父类静态代码块");
    }

    {
        System.out.println(baseNoStaticField);
        System.out.println("父类非静态代码块");
    }

    public Base() {
        System.out.println("父类构造方法");
    }

}
