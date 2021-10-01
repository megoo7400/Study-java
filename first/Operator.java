package first;

public class Operator {
    public static void main(String[] args) {
        int a = 10;
        a++;  // a = a + 1
        System.out.println(a);
        --a;
        System.out.println(a);

        System.out.println("------------------");
        int i = 10;
        int j = ++i;
        System.out.println(i);
        System.out.println(j);
        int l = 10;
        int k = l++;
        System.out.println(l);
        System.out.println(k);
        System.out.println("----------------------");
        int c = 10;
        int d = 5;
        int rs3 = c++ + ++c - --d + d--;
        // c 10 11 12
        // d 5 4 3 
        // rs3 10 + 12 - 4 + 4
        System.out.println(c);
        System.out.println(d); 
        System.out.println(rs3);
    }
}
