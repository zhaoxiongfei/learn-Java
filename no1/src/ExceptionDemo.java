import java.util.Scanner;
import java.lang.Throwable.*;

public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("www.weixueyuan.net提示，输入1~3之间的整数进行选择：");
        Scanner input = new Scanner(System.in);
        try {
            int num = input.nextInt();
            switch (num) {
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                default:
                    throw new Exception("Type chars is errors: " + num);
            }
        } catch (Exception e) {
            System.out.printf("Has wrong happened\n");
            e.printStackTrace();
        }

        // StackOverflow.test(5);
    }
}

// 通过无限递归演示堆栈溢出错误
class StackOverflow {
    public static void test(int i) {
        if (i == 0) {
            return;
        } else {
            test(i++);
        }
    }
}
