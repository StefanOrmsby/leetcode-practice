package Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrintMinNumber_45 {

	public String printMinNumber(int[] numbers) {
		if (numbers == null || numbers.length <= 0) {
			return null;
		}
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < numbers.length; i++) {
			list.add(numbers[i]);
		}
		Collections.sort(list, new Comparator<Integer>() {
			public int compare(Integer i, Integer m) {
				String s1 = i + "" + m;
				String s2 = m + "" + i;
				return s1.compareTo(s2);
			}
		});
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < list.size(); i++) {
			sb.append(list.get(i).toString());
		}
		return sb.toString();
	}

}
