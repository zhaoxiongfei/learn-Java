public class InnerClassDemo {
    private int size;

    public class Inner {
        private int counter = 10;
        public void doStuff() {
            size++;
        }
    }

    public static void main(String args[]) {
        InnerClassDemo outer = new InnerClassDemo();
        Inner inner = outer.new Inner();
        inner.doStuff();
        System.out.println(outer.size);
        System.out.println(inner.counter);
        // System.out.println(counter); 编译错误，外部类不能访问内部类的变量
    }
}
