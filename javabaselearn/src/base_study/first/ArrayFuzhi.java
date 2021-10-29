package first;

public class ArrayFuzhi {
    public static void main(String[] args) {
        int[] arr1 = {11,22,33,44};
        int[] arr2 = new int[arr1.length];
        copy(arr1, arr2);
        printArray(arr1);
        
        printArray(arr2);
    }

    public static void printArray(int[] a) {
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            System.out.print(i == a.length - 1 ? a[i]:a[i] + ", ");
        }
        System.out.println("]");
    }

    public static void copy(int[] a, int[] b) {
        for (int i = 0; i < b.length; i++) {
            b[i] = a[i];
        }
    }
}
