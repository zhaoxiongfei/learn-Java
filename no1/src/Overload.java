public class Overload {
    // 一个普通的方法，不带参数
    void test(){
        System.out.println("No parameters");
    }
    // 重载上面的方法，并且带了一个整型参数
    void test(int a){
        System.out.println("a: " + a);
    }
    // 重载上面的方法，并且带了两个参数
    void test(int a,int b){
        System.out.println("a and b: " + a + " " + b);
    }
    // 重载上面的方法，并且带了一个双精度参数
    double test(double a){
        System.out.println("double a: " + a);
        return a*a;
    }

    public static void main(String args[]){
        Overload obj= new Overload();
        obj.test();
        obj.test(2);
        obj.test(2,3);
        obj.test(2.0);
        StringBuffer argStr = new StringBuffer();
        for (String x: args) {
            argStr.append(x);
        }
        System.out.printf("args: %s", argStr.toString());
    }
}
