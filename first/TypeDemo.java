package first;

public class TypeDemo {
    public static void main(String[] args) {
        byte a = 20; 
        int b = a;
        
        int age = 23;
        double age_a = age;

        char ch = 'a';
        int code = ch;

        System.out.println(b);
        System.out.println(age_a);
        System.out.println(code);
        // a : 00001100
        // b : 0* 0* 0* 00001100



    }
}
