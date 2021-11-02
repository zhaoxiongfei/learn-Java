import java.util.*;

public class ScannerDemo {
    public static void main(String[] args) {
        int days = 0;
        // 获取用户输入
        Scanner sc = new Scanner(System.in);
        System.out.print("输入年份：");
        int year = sc.nextInt();
        System.out.print("输入月份：");
        int month = sc.nextInt();

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 2:
                // 判断闰年
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
                    days = 29;
                else
                    days = 28;
                break;
            default:
                System.out.println("月份输入错误！");
                System.exit(0);  // 强制结束程序
        }
        System.out.printf("天数：%d\n", days);
    }
}
