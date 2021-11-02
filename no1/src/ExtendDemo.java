public class ExtendDemo{
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.name = "小布";
        t.age = 70;
        t.school = "清华大学";
        t.subject = "Java";
        t.seniority = 12;
        t.say();
        t.lecturing();
    }
}

class People{
    String name;
    int age;
    int height;

    void say(){
        System.out.println("我的名字是 " + name + "，年龄是 " + age + "，身高是 " + height);
    }
}

class Teacher extends People{
    String school;  // 所在学校
    String subject;  // 学科
    int seniority;  // 教龄

    // 覆盖 People 类中的 say() 方法
    void say(){
        System.out.println("我叫" + name + "，在" + school + "教" + subject + "，有" + seniority + "年教龄");
    }

    void lecturing(){
        System.out.println("我已经" + age + "岁了，依然站在讲台上讲课");
    }
}