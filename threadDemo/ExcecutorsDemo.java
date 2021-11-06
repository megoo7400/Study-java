import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExcecutorsDemo {
    public static void main(String[] args) {
        // 使用Executors 
        // 创建固定线程池的方法
        ExecutorService pool = Executors.newFixedThreadPool(3);
        pool.execute(new MyRunableDemo());
        pool.execute(new MyRunableDemo());
        pool.execute(new MyRunableDemo());
        pool.execute(new MyRunableDemo()); // 不在服务,没有多余线程.....

    }
}
