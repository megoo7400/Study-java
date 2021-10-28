package exception;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BianyiException {
    public static void main(String[] args) throws ParseException {
        String date = "2021-10-28";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
        Date d = sdf.parse(date);
        System.out.println(d);

        // throws ParseException  日期抛出错误
    }
}
