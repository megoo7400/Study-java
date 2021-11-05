import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolDemo {
    public static void main(String[] args) {
        /**
         * hreadPoolExecutor(corePoolSize,
         *                   maximumPoolSize, 
                            * keepAliveTime, 
                            * unit, 
                            * workQueue, 
                            * threadFactory, 
                            * handler)
         */

        ExecutorService pool = new ThreadPoolExecutor(3, 5, 6, TimeUnit.SECONDS, 
                                                      new ArrayBlockingQueue<>(5),
                                                      Executors.defaultThreadFactory(),
                                                      new ThreadPoolExecutor.AbortPolicy());
        
                                                      
        // 给任务线程池处理
        Runnable target = new MyRunableDemo();
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        // 加任务::
        pool.execute(target);
        pool.execute(target);
        // 5 个队列在忙  第六个任务....
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);

        // 创建临时线程::: 
        pool.execute(target);
        // pool.execute(target);

        // 超过所有线程任务, 报错..
        // pool.execute(target);

        pool.shutdownNow();
    }
}
