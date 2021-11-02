public class Demo{
    public static void main(String[] args){
        // 定义类Student
        class Student{  // 通过class关键字类定义类
            // 类包含的变量
            String name;
            int age;
            float score;
            short extra;
            long income;
            // 类包含的函数
            void say(){
                System.out.println( name + "的年龄是 " + age + "，成绩是 " + score );
            }
        }
        // 通过类来定义变量，即创建对象
        Student stu1 = new Student();  // 必须使用new关键字
        // 操作类的成员
        stu1.name = "小明";
        stu1.age = 15;
        stu1.score = 92.5f;
        stu1.extra = 0xff;
        stu1.income = 1000000000;
        stu1.say();

        int x = 1;
        var y = 1 - 0.2;
        double z = 2 * y;
        System.out.println("z is: " + z + "5 左移 20 位: " + ((long) 5 << 20));

        // i 的作用域是 for 的 body 感觉也是块儿级作用域
        for (int i = 1; i <= 9; i += 1) {
            for (int j = 1; j <= 9; j += 1){
                if (j < i){
                    //打印八个空格，去掉空格就是左上三角形
                    System.out.print("        ");
                } else {
                    System.out.printf("%d*%d=%2d  ", i, j, i * j);
                }
            }
            System.out.print("\n");
        }
    }
}
