package demo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class demo {

	public static void main(String[] args) throws Exception {
		List<String> lists = getBetweenTime("2017-01-01", "2019-01-01", "year");
		for (String list : lists) {
			System.out.println(list);
		}
//		2019-01-02
//		2019-01-03
//		2019-01-04
//		2019-01-05
//		2019-01-06
//		2019-01-07
//		2019-01-08
	}

	private static List<String> getBetweenTime(String starttime, String endtime, String type) {
		List<String> betweenTime = new ArrayList<String>();
		try {
			Date sdate = null;
			Date edate = null;

			SimpleDateFormat outformat = null;

			if ("day".equals(type)) {
				sdate = new SimpleDateFormat("yyyy-MM-dd").parse(starttime);
				edate = new SimpleDateFormat("yyyy-MM-dd").parse(endtime);
				outformat = new SimpleDateFormat("yyyy-MM-dd");
				Calendar sCalendar = Calendar.getInstance();
				sCalendar.setTime(sdate);
				int year = sCalendar.get(Calendar.YEAR);
				int month = sCalendar.get(Calendar.MONTH);
				int day = sCalendar.get(Calendar.DATE);
				sCalendar.set(year, month, day, 0, 0, 0);

				Calendar eCalendar = Calendar.getInstance();
				eCalendar.setTime(edate);
				year = eCalendar.get(Calendar.YEAR);
				month = eCalendar.get(Calendar.MONTH);
				day = eCalendar.get(Calendar.DATE);
				eCalendar.set(year, month, day, 0, 0, 0);

				while (sCalendar.before(eCalendar)) {
					betweenTime.add(outformat.format(sCalendar.getTime()));
					sCalendar.add(Calendar.DAY_OF_YEAR, 1);
				}
				betweenTime.add(outformat.format(eCalendar.getTime()));
			} else if ("year".equals(type)) {
				sdate = new SimpleDateFormat("yyyy").parse(starttime);
				edate = new SimpleDateFormat("yyyy").parse(endtime);
				outformat = new SimpleDateFormat("yyyy");
				Calendar sCalendar = Calendar.getInstance();
				sCalendar.setTime(sdate);
				int year = sCalendar.get(Calendar.YEAR);
				int month = sCalendar.get(Calendar.MONTH);
				int day = sCalendar.get(Calendar.DATE);
				sCalendar.set(year, month, day, 0, 0, 0);

				Calendar eCalendar = Calendar.getInstance();
				eCalendar.setTime(edate);
				year = eCalendar.get(Calendar.YEAR);
				month = eCalendar.get(Calendar.MONTH);
				day = eCalendar.get(Calendar.DATE);
				eCalendar.set(year, month, day, 0, 0, 0);

				while (sCalendar.before(eCalendar)) {
					betweenTime.add(outformat.format(sCalendar.getTime()));
					sCalendar.add(Calendar.YEAR, 1);
				}
				betweenTime.add(outformat.format(eCalendar.getTime()));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return betweenTime;
	}

}
