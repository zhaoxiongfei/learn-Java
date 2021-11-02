public class StringDemo {
    public static void main(String[] args) {
        String str1 = "hello world";
        String values[] = str1.split(" ");

        for (String x: values) {
            System.out.println(x);
        }
    }
}
