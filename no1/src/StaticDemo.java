import java.sql.Statement;

public class StaticDemo {
    static int i;
    int j;
    public static void main(String[] args) {
        StaticDemo obj1 = new StaticDemo();
        obj1.i = 10;
        obj1.j = 20;

        StaticDemo obj2 = new StaticDemo();

        System.out.println("StaticDemo.i = " + StaticDemo.i);
        System.out.println("obj1.i=" + obj1.i + ", obj1.j=" + obj1.j);
        StaticDemo.i = 100;
        System.out.println("obj2.i=" + obj2.i + ", obj2.j=" + obj2.j);
        obj2.i = 1000;
        System.out.println("II obj1.i=" + obj1.i + ", obj1.j=" + obj1.j);
        System.out.println("II StaticDemo.i = " + StaticDemo.i);

        System.out.printf("Static method Math.pow(20, 10) = %.0f", Math.pow(10, 8));
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

