import java.io.FileInputStream;
import java.io.IOException;

public class ThrowsDemo {
    public void readFile() throws IOException {
        // 定义方法时声明异常
        FileInputStream file = new FileInputStream("www.weixueyuan.net.txt"); // 创建 FileInputStream 实例对象
        int f;
        while ((f = file.read()) != -1) {
            System.out.println((char) f);
            f = file.read();
        }
        file.close();
    }

    public static void main(String[] args) {
        ThrowsDemo t = new ThrowsDemo();
        try {
            t.readFile(); // 调用 readFHe()方法
        } catch (IOException e) {
            // 捕获异常
            System.out.println(e);
        }
    }
}
