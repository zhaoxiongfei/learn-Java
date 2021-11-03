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
    }
}

// 静态属性只有一个副本，通过类和其对应的实例都能读写之，写完会立即全部生效, 因为对应的是同一个内存空间
