package api;

public class IntegeDemo {
    public static void main(String[] args) {
        
        int[] a = {11,22,33,44,55};
        System.out.println(toString(a));;
    }

    // 定义方法,接受任意整型数组
    public static String toString(int[] arr){
        if(arr != null){
            StringBuilder sb = new StringBuilder("[");
            for (int i = 0; i < arr.length; i++) {
                sb.append(arr[i]).append(i == arr.length -1? "":" ,");
            }
            sb.append("]");
            return sb.toString();
        }else{
            return null;
        }
    }
}
