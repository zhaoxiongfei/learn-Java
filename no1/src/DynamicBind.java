public class DynamicBind {
    public static void main(String[] args){
        AnimalIV obj = new AnimalIV();
        obj.cry();
        obj = new Cat();
        obj.cry();
        obj = new DogIV();
        obj.cry();
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
}

class DogIV extends AnimalIV {
    // 狗的叫声
    public void cry(){
        System.out.println("汪汪~");
    }
}
