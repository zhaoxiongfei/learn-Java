public class Dog{
    String name;
    int age;

    // 构造方法，没有返回值
    Dog(String name1, int age1) {
        name = name1;
        age = age1;
        System.out.println("感谢主人领养了我, 我是: " + this.name);

    }

    void bark() {  // 汪汪叫
        System.out.println("汪汪，不要过来");
    }

    void hungry() {  // 饥饿
        System.out.println("主人，我饿了");
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("长毛", 8);
        dog1.bark();
        dog1.hungry();
        System.out.println("我是一只小狗，我名字叫" + dog1.name + "，我" + dog1.age + "岁了");
    }
}
