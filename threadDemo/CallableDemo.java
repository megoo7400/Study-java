import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableDemo {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        //创建任务对象:
        Callable<String> cal = new MyCallable(100);
        // 把Callable任务对象 ,交给FutureTask进行封装
        // 在线程执行完后,用get方法得到线程执行的结果...
        FutureTask<String> ft = new FutureTask<>(cal);
        // Thread处理
        new Thread(ft).start();
        System.out.println(ft.get());
    }
}

// 定义任务类
/**
 * InnerCallableDemo
 */
class MyCallable implements Callable<String> {
   
    private int n;
    public MyCallable(int n){
        this.n = n;
    }

    @Override
    public String call()  throws Exception{
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return "子线程执行的结果是: " + sum;
    }
    
}
