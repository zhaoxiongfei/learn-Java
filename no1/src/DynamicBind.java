public class DynamicBind {
    public static void main(String[] args){
        AnimalIV obj = new AnimalIV();
        obj.cry();
        obj = new Cat();
        obj.cry();
        // obj.walk(); 这行会编译出错，找不到符号 walk
        if (obj instanceof Cat) {
            // 这里先动态判断对象的类型，之后在做类型转换就可以正确调用 walk 方法了。
            // 不做 instanceof 也可以直接类型转换调用walk，但是可能会在运行时发现转换失败而报错，编译环节无法提前得知
            ((Cat) obj).walk();
        }
        obj = new DogIV();
        obj.cry();

        Cat cat = new Cat();
        cat.walk();
    }
}

class AnimalIV {
    // 动物的叫声
    public void cry(){
        System.out.println("不知道怎么叫");
    }
}

class Cat extends AnimalIV {
    // 猫的叫声
    public void cry(){
        System.out.println("喵喵~");
    }

    // 猫走路
    public void walk() {
        System.out.println("猫正在走路......");
    }
}

class DogIV extends AnimalIV {
    // 狗的叫声
    public void cry(){
        System.out.println("汪汪~");
    }
}
