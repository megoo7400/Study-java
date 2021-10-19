package api;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExDemo {
    public static void main(String[] args) throws ParseException {
        // 1/ 开始和结束时间
        String startTime = "2021-11-11 00:00:00";
        String  endTime = "2021-11-11 00:10:00";
        // 对象时间
        String  xiaoJa = "2021-11-11 00:03:47";
        String xiaoPi = "2021-11-11 00:10:11";
        // 格式化解析时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d1 = sdf.parse(startTime);
        Date d2 = sdf.parse(endTime);
        Date d3 = sdf.parse(xiaoJa);
        Date d4 = sdf.parse(xiaoPi);
        // 判断秒杀
        if(d3.after(d1)&& d3.before(d2)){
            System.out.println("小贾秒杀成功");
        }else{
            System.out.println("小贾失败");
        }

        if(d4.after(d1) && d4.before(d2)){
            System.out.println("小平秒杀成功");
        }else{
            System.out.println("小平失败");
        }
    }
}
