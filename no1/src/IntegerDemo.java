import jdk.jshell.SourceCodeAnalysis;

import java.util.Scanner;

public class IntegerDemo {
    public static void main(String[] args) {
        int m = 500;
        Integer obj = new Integer(m);  // 手动装箱
        int n = obj.intValue();  // 手动拆箱
        System.out.println("n = " + n);

        Integer obj1 = 500;
        System.out.println("obj 等价于 obj1？" + obj.equals(obj1));
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入: ");
        String line = sc.nextLine();
        try {
            int num = Integer.parseInt(line, 10);
            System.out.printf("%s, parseInt: %d\n", line, num);
        } catch (Exception e) {
            System.out.printf("%s, 无法转换为整型数字: %s", line, e.getMessage());
        }
    }
}
