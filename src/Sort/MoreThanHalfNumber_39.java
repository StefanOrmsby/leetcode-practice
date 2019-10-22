package Sort;

import java.util.HashMap;
import java.util.Map;

public class MoreThanHalfNumber_39 {
	public int moreThanHalfNum(int[] array) {
		if (array == null || array.length <= 0) {
			return 0;
		}
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < array.length; i++) {
			if (map.containsKey(array[i])) {
				int count = map.get(array[i]);
				map.put(array[i], ++count);
			} else {
				map.put(array[i], 1);
			}
		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() > array.length / 2) {
				return entry.getKey();
			}
		}
		return 0;

	}
}
