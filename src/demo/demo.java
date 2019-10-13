package demo;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class demo {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.00");
		double abnormalPercent = 111.23456789;
		//abnormalPercent *= 100;
		//NumberFormat num = NumberFormat.getPercentInstance();
		String rates = df.format(abnormalPercent);
		System.out.println(rates);
	}

}
