public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i += 1) {
            arr[i] = i;
        }

        String[] arr2 = { "2", "3", "4", "5" };

        System.out.printf("Array arr[2] is: %d, arr2[1] is: %s\n", arr[2], arr2[1]);
    }
}
