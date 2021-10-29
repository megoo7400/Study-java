package first;

public class MethodArr1 {
    public static void main(String[] args) {
        // 打印任意整型的内容
        int[] ages = {11,22,33,44};
        printArr(ages);
    }

    public static void printArr(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", "); 
            }
            // System.out.print(i == arr.length -1 ? arr[i] : arr[i] + ", ")
            
        }
        System.out.println("]");
    }
}
