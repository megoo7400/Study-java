package class_tst;

public class ArrayUtil {
    // 私有构造器
    private ArrayUtil(){

    }

    // 类工具方法
    public static String toString(int[] arr) {
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            result += (i == arr.length - 1 ? arr[i] : (arr[i] + ","));
        }
        result += "]";
        return result;
    }

    // 累工具方法
    public static double getAverage(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
            sum += arr[i];
        }
        double averge = (sum - max - min)*1.0 / (arr.length -2);
        return averge;
    }
}
