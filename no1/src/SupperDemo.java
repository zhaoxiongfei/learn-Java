public class SupperDemo{
    public static void main(String[] args) {
        DogII obj = new DogII();
        obj.move();
    }
}

class Animal{
    private String desc = "Animals are human's good friends";
    // 必须要声明一个 getter 方法
    public String getDesc() { return desc; }
    public void move(){
        System.out.println("Animals can move");
    }
}

class DogII extends Animal{
    public void move(){
        super.move();  // 调用父类的方法
        System.out.println("Dogs can walk and run");
        // 通过 getter 方法调用父类隐藏变量
        System.out.println("Please remember: " + super.getDesc());
    }
}
