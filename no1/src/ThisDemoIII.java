public class ThisDemoIII {
    public static void main(String[] args){
        B b = new B(new A());
    }
}

class A{
    public A(){
        new B(this).print();  // 匿名对象
    }
    public void print(){
        System.out.println("Hello from A!");
    }
}

class B{
    A a;
    public B(A a){
        this.a = a;
    }
    public void print() {
        a.print();
        System.out.println("Hello from B!");
    }
}