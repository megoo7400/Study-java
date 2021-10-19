package api;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {
    public static void main(String[] args) {
        //日li对象--
        Calendar calendarDate = Calendar.getInstance();
        System.out.println(calendarDate);
        // get
        int year = calendarDate.get(Calendar.YEAR);
        System.out.println(year);
        int mm = calendarDate.get(Calendar.MONTH) + 1;
        System.out.println(mm);
        int days = calendarDate.get(Calendar.DAY_OF_YEAR);
        System.out.println(days);
        //set  64天之后的时间
        calendarDate.add(Calendar.DAY_OF_YEAR,64);
        Date fDate = calendarDate.getTime();//日历获取对象
        System.out.println(fDate);

    }
}
