package demo;

public class SomeTest {
    public static void main(String[] args) {
        int[] list_l = {3,4,5,1,2,0};
        for (int i = 0; i < list_l.length; i++) {
            System.out.print("[ " );
            System.out.print(list_l[i]);
            System.out.print(" ]");
            int[] list2 = sorted(list_l);
            System.out.println(list2[i]);
        }
    }

    public static int[] sorted(int[] a) {
        int temp;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if(a[i] < a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }
}
