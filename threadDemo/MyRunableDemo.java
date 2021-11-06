public class MyRunableDemo implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "输出了: ,hello ==> " + i);   
        }
        try {
            System.out.println(Thread.currentThread().getName() + "本任务进行了绑定,线程进入休眠了`````");
            Thread.sleep(10000);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
