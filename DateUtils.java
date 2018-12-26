package tony.nice.yuan;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class DateUtils {
    /**
     * @Author tonyYuan
     * Test
     * @param args
     */
    public static void main(String[] args){
        Date date = new Date();
        System.out.println(transDateToFormatStr(date,"yyyyMMdd HHmmss"));
        System.out.println(transDateToFormatStr(date,"yyyy年MM月dd日 HH时mm分ss秒"));
        System.out.print(transStrToDate("2018-11-12","YYYY-MM-DD"));
    }

    /**
     * @author tonyYuan
     * @param date       日期对象
     * @param pattern    日期格式(如:YYYYMMDD HHmmss)
     * @return
     */
    public static String transDateToFormatStr(Date date,String pattern){
        String result = "";
        if(null == date || null == pattern){
            System.out.println("Params  date or pattern is empty!");
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        result = simpleDateFormat.format(date);
        return result;
    }

    public static Date transStrToDate(String dateStr,String pattern){
        Date date = null;
        if(null == dateStr || dateStr.length() <= 0){
            System.out.println("入参为空");
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        try{
            date = simpleDateFormat.parse(dateStr);
        }catch(ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

}
