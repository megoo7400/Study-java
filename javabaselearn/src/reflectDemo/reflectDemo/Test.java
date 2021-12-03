package reflectDemo;



public class Test {
    public static void main(String[] args) throws Exception {
       Class<?> c = Class.forName("reflectDemo.Students"); // 包名 + 类名
       System.out.println(c);
        // Students st = new Students();
        // Class<?> c2 = st.getClass();
        // System.out.println(c2);
    }
}
