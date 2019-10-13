package demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HashSimilar {
	public static void main(String[] args) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date date = null;
        Date date2 = null;
        Date date3 = null;
        try {
            date = format.parse("2019-08-24 15:01:36.508");
        } catch (ParseException e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        }
        
        try {
			date2 = format.parse("2019-08-26 14:43:33.508");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        try {
			date3 = format.parse("2019-08-26 16:29:00.508");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        long millis = date.getTime();
        long millis2 = date2.getTime();
        long millis3 = date3.getTime();
        long ab = 1513080352509L;
        System.out.println("8.24   = " + (millis-ab));
        System.out.println("8.26   = "+(millis2-ab));
        
        
        System.out.println("millis2   = " + (millis2));
        System.out.println("millis3   = " + (millis3));
		
	}

}
