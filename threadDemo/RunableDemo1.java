public class RunableDemo1 {
    public static void main(String[] args) {
        MyThread mt = new MyThread(){
            @Override
            public void run(){
                for (int i = 0; i < 5; i++) {
                    System.out.println("子线程执行输出: " + i);
                }
            }
        };
        new Thread(mt).start();

        //=========================================================
        /**   简化 一====  Runable -- 是一个函数式接口,,就可以使用lambda简化写法....
            new Thread(new MyThread(){
            @Override
            public void run(){
                for (int i = 0; i < 5; i++) {
                    System.out.println("子线程执行输出: " + i);
                }
            }).start();
         */
        //=========================================================
        /**   简化二 lambda
            new Thread(() -> {
                for (int i = 0; i < 5; i++) {
                    System.out.println("子线程执行输出: " + i);
                }
            }).start();
            
         */


        for (int i = 20; i < 25; i++) {
            System.out.println("主线程执行输出:" + i);
        }
    }
}

// class MyThread1 implements Runnable{
//     @Override
//     public void run(){
//         for (int i = 0; i < 5; i++) {
//             System.out.println("子线程执行输出: " + i);
//         }
//     }
// }
