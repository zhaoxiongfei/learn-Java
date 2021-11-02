public class Overwrite {
    public static void main(String[] args) {
        DogIV myDog = new DogIV("花花");
        myDog.say();  // 子类的实例调用子类中的方法

        AnimalIII myAnimal= new AnimalIII("贝贝");
        myAnimal.say();  // 父类的实例调用父类中的方法
    }
}

class AnimalIII {
    String name;
    public AnimalIII(String name) {
        this.name = name;
    }

    public void say() {
        System.out.println("我是一只小动物，我的名字叫" + name + "，我会发出叫声");
    }
}

class DogIV extends AnimalIII {
    // 构造方法不能被继承，通过super()调用
    public DogIV(String name) {
        super(name);
    }

    // 覆盖say() 方法
    public void say() {
        System.out.println("我是一只小狗，我的名字叫" + name + "，我会发出汪汪的叫声");
    }
}