import java.util.Random;

import static java.lang.System.*;
import static java.lang.Math.random;

public class StaticDemo {
    static int i;
    int j;

    // 块是由大括号包围的一段代码。静态初始器(Static Initializer)是一个存在于类中、方法外面的静态块。静态初始器仅仅在类装载的时候（第一次使用类的时候）执行一次，往往用来初始化静态变量。
    static {
        i = 2;
    }

    public static void main(String[] args) {
        StaticDemo obj1 = new StaticDemo();
        obj1.i = 10;
        obj1.j = 20;

        StaticDemo obj2 = new StaticDemo();

        out.println("StaticDemo.i = " + StaticDemo.i);
        out.println("obj1.i=" + obj1.i + ", obj1.j=" + obj1.j);
        StaticDemo.i = 100;
        out.println("obj2.i=" + obj2.i + ", obj2.j=" + obj2.j);
        obj2.i = 1000;
        out.println("II obj1.i=" + obj1.i + ", obj1.j=" + obj1.j);
        out.println("II StaticDemo.i = " + StaticDemo.i);

        out.printf("Static method Math.pow(20, 10) = %.0f\n", Math.pow(10, 8));
        out.printf("import static method random = %.16f\n", random());
    }
}

// 静态属性只有一个副本，通过类和其对应的实例都能读写之，写完会立即全部生效, 因为对应的是同一个内存空间
/**
 * 关于静态变量和静态方法的总结：
 * 一个类的静态方法只能访问静态变量；
 * 一个类的静态方法不能够直接调用非静态方法；
 * 如访问控制权限允许，静态变量和静态方法也可以通过对象来访问，但是不被推荐；
 * 静态方法中不存在当前对象，因而不能使用 this，当然也不能使用 super；
 * 静态方法不能被非静态方法覆盖；
 * 构造方法不允许声明为 static 的；
 * 局部变量不能使用static修饰。
 */

