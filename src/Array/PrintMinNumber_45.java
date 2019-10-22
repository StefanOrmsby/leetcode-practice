package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrintMinNumber_45 {
	public String printMinNumber(int[] numbers) {
		if (numbers == null || numbers.length <= 0) {
			return "";
		}
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < numbers.length; i++) {
			list.add(numbers[i]);
		}
		// since 1.8
		list.sort(new Comparator<Integer>() {
			public int compare(Integer a, Integer b) {
				String m = a + "" + b;
				String p = b + "" + a;
				if (Integer.valueOf(m) > Integer.valueOf(p)) {
					return 1;
				} else {
					return -1;
				}
			}
		});
		/*Collections.sort(list, new Comparator<Integer>() {
			public int compare(Integer a, Integer b) {
				String m = a + "" + b;
				String p = b + "" + a;
				if (Integer.valueOf(m) > Integer.valueOf(p)) {
					return 1;
				} else {
					return -1;
				}
			}
		});*/
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < list.size(); i++) {
			sb.append(list.get(i));
		}
		return sb.toString();
	}
}
