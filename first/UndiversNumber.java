package first;

/**
 * UndiversNumber //寻找素数
 */
public class UndiversNumber {

    public static void main(String[] args) {
        for (int i = 101; i <+ 200; i++) {
            boolean flag = true; // 信号位
            for (int j = 2; j < i/2; j++){
                if(i % j == 0){
                    flag = false;  // 信号位思维
                    break;
                }
            }
            if(flag){
                System.out.print(i + "\t");
            }
        }    
    }


}