package class_tst;

public class TestArrayUtil {
    public static void main(String[] args) {
        int[] list = {88,90,75,100,30};
        System.out.println(list);
        System.out.println(ArrayUtil.toString(list));
        System.out.println(ArrayUtil.getAverage(list));
        
    }
}
