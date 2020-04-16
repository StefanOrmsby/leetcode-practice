package demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class WeekFormatDemo {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(getFirstDayOfWeek(sdf.parse("2020-01-27"))));
		System.out.println(sdf.format(getLastDayOfWeek(sdf.parse("2020-01-27"))));
		System.out.println("--------------");
		System.out.println(sdf.format(getFirstDayOfWeek(2020, 52)));
		System.out.println(sdf.format(getLastDayOfWeek(2020, 52)));
		System.out.println("--------------");
		System.out.println(getStartDayOfWeekNo(2020, 53));
		System.out.println(getEndDayOfWeekNo(2020, 53));
		
	}

	/**
	 * 获取周粒度的第一天
	 * 
	 * @param date
	 * @return
	 */
	public static Date getFirstDayOfWeek(Date date) {
		Calendar cal = Calendar.getInstance();
		try {
			cal.setTime(date);
			cal.set(Calendar.DAY_OF_WEEK, 2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cal.getTime();
	}

	/**
	 * 获取周粒度的最后一天
	 * 
	 * @param date
	 * @return
	 */
	public static Date getLastDayOfWeek(Date date) {
		Calendar cal = Calendar.getInstance();
		try {
			cal.setTime(date);
			cal.set(Calendar.DAY_OF_WEEK, 2);
			cal.set(Calendar.DATE, cal.get(Calendar.DATE) + 6);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cal.getTime();
	}

	// 获取某年的第几周的开始日期
	public static Date getFirstDayOfWeek(int year, int week) {
		Calendar c = new GregorianCalendar();
		c.set(Calendar.YEAR, year);
		c.set(Calendar.MONTH, Calendar.JANUARY);
		c.set(Calendar.DATE, 1);

		Calendar cal = (GregorianCalendar) c.clone();
		cal.add(Calendar.DATE, week * 7);

		return getFirstDayOfWeek(cal.getTime());
	}

	// 获取某年的第几周的结束日期
	public static Date getLastDayOfWeek(int year, int week) {
		Calendar c = new GregorianCalendar();
		c.set(Calendar.YEAR, year);
		c.set(Calendar.MONTH, Calendar.JANUARY);
		c.set(Calendar.DATE, 1);

		Calendar cal = (GregorianCalendar) c.clone();
		cal.add(Calendar.DATE, week * 7);

		return getLastDayOfWeek(cal.getTime());
	}

	/**
	 * get start date of given week no of a year
	 * when in 2021,the method need to be changed
	 * 
	 * @param year
	 * @param weekNo
	 * @return
	 */
	public static String getStartDayOfWeekNo(int year, int weekNo) {
		Calendar cal = getCalendarFormYear(year);
		cal.set(Calendar.WEEK_OF_YEAR, weekNo);
		String month = "";
		String day = "";
		if (cal.get(Calendar.MONTH) + 1 < 10) {
			month = "0" + String.valueOf(cal.get(Calendar.MONTH) + 1);
		} else {
			month = String.valueOf(cal.get(Calendar.MONTH) + 1);
		}
		if (cal.get(Calendar.DAY_OF_MONTH) < 10) {
			day = "0" + String.valueOf(cal.get(Calendar.DAY_OF_MONTH));
		} else {
			day = String.valueOf(cal.get(Calendar.DAY_OF_MONTH));
		}
		return cal.get(Calendar.YEAR) + "-" + month + "-" + day;
	}

	/**
	 * get the end day of given week no of a year
	 * when in 2021,the method need to be changed
	 * 
	 * @param year
	 * @param weekNo
	 * @return
	 */
	public static String getEndDayOfWeekNo(int year, int weekNo) {
		Calendar cal = getCalendarFormYear(year);
		cal.set(Calendar.WEEK_OF_YEAR, weekNo);
		cal.add(Calendar.DAY_OF_WEEK, 6);
		String month = "";
		String day = "";
		if (cal.get(Calendar.MONTH) + 1 < 10) {
			month = "0" + String.valueOf(cal.get(Calendar.MONTH) + 1);
		} else {
			month = String.valueOf(cal.get(Calendar.MONTH) + 1);
		}
		if (cal.get(Calendar.DAY_OF_MONTH) < 10) {
			day = "0" + String.valueOf(cal.get(Calendar.DAY_OF_MONTH));
		} else {
			day = String.valueOf(cal.get(Calendar.DAY_OF_MONTH));
		}
		return cal.get(Calendar.YEAR) + "-" + month + "-" + day;
	}

	/**
	 * get Calendar of given year
	 * 
	 * @param year
	 * @return
	 */
	private static Calendar getCalendarFormYear(int year) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		cal.set(Calendar.YEAR, year);
		return cal;
	}

}
