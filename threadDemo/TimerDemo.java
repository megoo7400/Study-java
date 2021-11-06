import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo {
    public static void main(String[] args) {
        // 定时器的使用  --- Timer
        Timer timer = new Timer(); // 定时器本身就是一个单线程..多个任务的化有延迟.
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
               System.out.println("执行一次"); 
            }
        }, 3000, 2000);
    }
}
