import static java.lang.System.*;

public class InterfaceDemo {
    public static void main(String[] args) {
        SataHdd sh1 = new SeagateHdd(); //初始化希捷硬盘
        SataHdd sh2 = new SamsungHdd(); //初始化三星硬盘
        SataHdd sh3 = new Ai(); // 初始化AI硬盘

        out.printf("sh1.readData: %s\n", sh1.readData());
        out.printf("sh2.readData: %s\n", sh2.readData());
        out.printf("sh3.readData: %s\n", sh3.readData());
        sh1.writeData("hello");
        sh2.writeData("world");
        sh3.writeData("hahaha");
    }
}

//串行硬盘接口
interface SataHdd {
    //连接线的数量
    public static final int CONNECT_LINE=4;
    //写数据
    public void writeData(String data);
    //读数据
    public String readData();
}

// 维修硬盘接口
interface fixHdd {
    // 维修地址
    String address = "北京市海淀区";
    // 开始维修
    boolean doFix();
}

//希捷硬盘
class SeagateHdd implements SataHdd, fixHdd {
    //希捷硬盘读取数据
    public String readData() {
        return "from 希捷读取到的数据";
    }
    //希捷硬盘写入数据
    public void writeData(String data) {
        out.printf("希捷写入成功: %s\n", data);
    }
    // 维修希捷硬盘
    public boolean doFix() {
        return true;
    }
}

//三星硬盘
class SamsungHdd implements SataHdd {
    //三星硬盘读取数据
    public String readData() {
        return "from 三星读到的数据";
    }
    //三星硬盘写入数据
    public void writeData(String data) {
        out.printf("三星写入成功: %s\n", data);
    }
}

//某劣质硬盘，不能写数据
abstract class XXHdd implements SataHdd {
    //硬盘读取数据
    public String readData() {
        return "from 劣质硬盘读到数据";
    }
}

// Ai 硬盘
class Ai extends XXHdd {
    public void writeData(String data) {
        out.println("无法写入，写入出错");
    }
}