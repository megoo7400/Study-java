public class ThreadDemo {
    public static void main(String[] args) {

        // new 一个新线程对象
        Thread t = new MyThread();
        // 调用start方法启动线程
        t.start();// main() 一个线程  是主线程 和一个run()线程

        for (int i = 10; i < 15; i++) {
            System.out.println("主线程执行输出:" + i);
        }
        
    }
}

/**
 * MyThread
 */
class MyThread  extends Thread{

    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程执行输出: " + i);
        }
    }
}
