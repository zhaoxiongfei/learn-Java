public class InnerClassDemoII {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.doStuff();

        Outer.InnerII innerII = outer.new InnerII();
        innerII.log();

        Outer.InnerIII innerIII = new Outer.InnerIII();
        innerIII.log();
    }
}

class Outer {
    private int size;
    public static final int TOTAL_NUMBER = 5;
    private int id = 123;
    class Inner {
        public void doStuff() {
            System.out.println("Outer.Inner.doStuff be called.");
            size++;

            final int age = 15;
            String str = "https://www.weixueyuan.net";

            // 这种内部类，相当于局部类，仅改方法可见, 利用变量作用域的概率理解也可以
            class _Inner {
                public void innerTest() {
                    System.out.println(TOTAL_NUMBER);
                    System.out.println(id);
                    // System.out.println(str);不合法，只能访问本地方法的final变量
                    System.out.println(age);
                }
            }
            new _Inner().innerTest();
        }
    }

    class InnerII {
        private int size = 10000;
        public void log() {
            System.out.printf("Outer.InnerII.log be called, Out.size: %d, Out.InnerII.size: %d\n", Outer.this.size, this.size);
        }
    }

    static class InnerIII {
        private int size = 10000;
        public void log() {
            System.out.println("Outer.InnerIII.log be called.");
        }
    }
}
