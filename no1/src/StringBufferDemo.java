public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("abcdefg");
        str.deleteCharAt(3);
        System.out.println("str is: " + str + "\ndelete(1, 3)" + str.delete(1, 3));

        // String和StringBuffer的效率对比
        // 为了更加明显地看出它们的执行效率，下面的代码，将26个英文字母加了10000次。
        String fragment = "abcdefghijklmnopqrstuvwxyz";
        int times = 300000;

        // 通过String对象
        long timeStart1 = System.currentTimeMillis();
        String str1 = "";
        for (int i=0; i<times; i++) {
            str1 += fragment;
        }
        long timeEnd1 = System.currentTimeMillis();
        System.out.println("String: " + (timeEnd1 - timeStart1) + "ms");

        // 通过StringBuffer
        long timeStart2 = System.currentTimeMillis();
        StringBuffer str2 = new StringBuffer();
        for (int i=0; i<times; i++) {
            str2.append(fragment);
        }
        long timeEnd2 = System.currentTimeMillis();
        System.out.println("StringBuffer: " + (timeEnd2 - timeStart2) + "ms");
    }
}
