import static java.lang.System.*;

public class AbstractClassDemo {
    public static void main(String[] args) {
        TeacherIII t = new TeacherIII();
        t.setName("王明");
        t.work();

        Driver d = new Driver();
        d.setName("小陈");
        d.work();
    }
}

// 定义一个抽象类
abstract class PeopleIII {
    private String name;  // 实例变量

    // 共有的 setter 和 getter 方法
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    // 抽象方法
    public abstract void work();
}

class TeacherIII extends PeopleIII {
    // 必须实现该方法
    public void work(){
        out.println("我的名字叫" + this.getName() + "，我正在讲课，请大家不要东张西望...");
    }
}

class Driver extends PeopleIII {
    // 必须实现该方法
    public void work(){
        out.println("我的名字叫" + this.getName() + "，我正在开车，不能接听电话...");
    }
}
