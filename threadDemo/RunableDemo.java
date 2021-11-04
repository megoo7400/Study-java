public class RunableDemo {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        new Thread(mt).start();

        for (int i = 20; i < 25; i++) {
            System.out.println("主线程执行输出:" + i);
        }
    }
}

class MyThread1 implements Runnable{
    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程执行输出: " + i);
        }
    }
}
