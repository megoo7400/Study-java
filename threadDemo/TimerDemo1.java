import java.util.Date;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TimerDemo1 {
    public static void main(String[] args) {
        // 创建 ScheduleExecutorService()
        ScheduledExecutorService pool = Executors.newScheduledThreadPool(3);
        pool.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "执行输出: AAA ```" + new Date());
            }
        }, 0, 2, TimeUnit.SECONDS);

        // Thread.State;

        pool.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "执行输出: bbb ```" + new Date());
                System.out.println(10/0);
            }
        }, 0, 2, TimeUnit.SECONDS);

        pool.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "执行输出: ccc ```" + new Date());
            }
        }, 0, 2, TimeUnit.SECONDS);
    }
}
