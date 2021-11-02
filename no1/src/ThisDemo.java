public class ThisDemo{
    public String name;
    public int age;

    public ThisDemo(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void say(){
        System.out.println("网站的名字是" + name + "，已经成立了" + age + "年");
    }

    public static void main(String[] args) {
        ThisDemo obj = new ThisDemo("微学苑", 3);
        obj.say();
    }
}
