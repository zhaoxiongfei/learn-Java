import java.io.*;

public class FileReaderDemo {
    public static void main(String args[]) throws IOException {
        char a[] = new char[100]; //创建可容纳 1000 个字符的数组
        FileReader b = new FileReader("/etc/hosts");
        int num = b.read(a); //将数据读入到数组 a 中，并返回字符数
        String str = new String(a, 0, num); //将字符串数组转换成字符串
        System.out.println("读取的字符个数为：" + num + "，内容为：");
        System.out.println(str);

        String OneLine;
        int count = 0;

        try {
            FileReader a1 = new FileReader("/etc/hosts");
            BufferedReader b1 = new BufferedReader(a1);
            while ((OneLine = b1.readLine()) != null) {  //每次读取 1 行
                count += 1;  //计算读取的行数
                System.out.println(OneLine);
            }
            System.out.println("\n共读取了" + count + "行");
            b1.close();
        } catch (IOException io) {
            System.out.println("出错了!" + io);
        }

        try {
            FileWriter a2 = new FileWriter("chars.txt");
            for (int i = 32; i < 1655360; i += 1) {
                a2.write(i);
            }
            a2.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
