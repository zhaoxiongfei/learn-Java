public class SupperDemoII{
    public static void main(String[] args) {
        DogIII obj = new DogIII("花花", 3);
        obj.say();
    }
}

class AnimalII {
    String name;
    public AnimalII(String name){
        this.name = name;
    }
}

class DogIII extends AnimalII {
    int age;
    public DogIII(String name, int age){
        super(name);
        this.age = age;
    }
    public void say(){
        System.out.println("我是一只可爱的小狗，我的名字叫" + name + "，我" + age + "岁了");
    }
}
