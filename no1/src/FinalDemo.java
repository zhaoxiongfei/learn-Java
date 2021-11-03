public final class FinalDemo {
    public static final int TOTAL_NUMBER = 5;
    public int id;

    public FinalDemo() {
        // 非法，对final变量TOTAL_NUMBER进行二次赋值了
        // 因为++TOTAL_NUMBER相当于 TOTAL_NUMBER=TOTAL_NUMBER+1
        // ++TOTAL_NUMBER
        id = TOTAL_NUMBER;
    }

    public static void main(String[] args) {
        final Demo t = new Demo();
        final int i = 10;
        final int j;
        j = 20;
        // j = 30;  非法，对final变量进行二次赋值
    }
}

