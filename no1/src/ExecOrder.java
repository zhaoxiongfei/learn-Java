public class ExecOrder {
    private String name;
    private int age;

    public ExecOrder(){
        name = "微学苑";
        age = 3;
    }
    public static void main(String[] args){
        ExecOrder obj = new ExecOrder();
        System.out.println(obj.name + "的年龄是" + obj.age);
    }
}

/*
基本运行顺序是：
        先运行到第 9 行，这是程序的入口。
        然后运行到第 10 行，这里要 new 一个Demo，就要调用 Demo 的构造方法。
        就运行到第 5 行，注意：可能很多人觉得接下来就应该运行第 6 行了，错！初始化一个类，必须先初始化它的属性。
        因此运行到第 2 行，然后是第 3 行。
        属性初始化完过后，才回到构造方法，执行里面的代码，也就是第 6 行、第 7 行。
        然后是第8行，表示 new 一个Demo实例完成。
        然后回到 main 方法中执行第 11 行。
        然后是第 12 行，main方法执行完毕。
*/