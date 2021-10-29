package first;

public class WhileDemo {
    public static void main(String[] args) {
        int i = 0;
        while (i < 3) {
            System.out.println("hello");
            i++;
        }
        System.out.println("------------");
        //珠峰高度与纸张折叠几次的高度一致
        double peakHeight = 8848860;
        double paperThickness = 0.1;
        int count = 0;
        while (paperThickness < peakHeight) {
            paperThickness *= 2;
            count++;
        }
        System.out.println(count);
    }
}
