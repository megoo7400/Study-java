package api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * DateDemo
 */
public class DateDemo {

    public static void main(String[] args) throws ParseException{
        Date d = new Date();
        System.out.println(d);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        String rs = sdf.format(d);
        System.out.println(rs);
        // 创建时间对象和时间格式对象,然后在输出
        long time1 = System.currentTimeMillis();
        String ts1 = sdf.format(time1);
        System.out.println(ts1);

        // 解析时间

        // 解析时间对象
        // 2021年08月06日 11:11:11 
        // 2天 14 小时 49分06秒
        String dateStr = "2021年08月06日 11:11:11";
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        // 安原格式写
        Date d1 = sdf1.parse(dateStr);
        long time3 = d1.getTime() + (2L*24*60*60 + 14*60*60 + 49*60 + 6)*1000;
        System.out.println(sdf1.format(time3));
    }
}