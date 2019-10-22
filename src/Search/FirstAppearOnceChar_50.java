package Search;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class FirstAppearOnceChar_50 {
	public static void main(String[] args) {
		HashMap map = new HashMap(); // 定义Map对象
		map.put("apple", "新鲜的苹果"); // 向集合中添加对象
		map.put("computer", "配置优良的计算机");
		map.put("book", "堆积成山的图书");
		map.put("time", new Date());
		String key = "book";
		boolean contains = map.containsKey(key); // 判断是否包含指定的键值
		if (contains) { // 如果条件为真
			System.out.println("在Map集合中包含键名" + key); // 输出信息
		} else {
			System.out.println("在Map集合中不包含键名" + key);
		}

		boolean containsValues = map.containsValue("堆积成山的34图书");
		System.out.println(containsValues);

		System.out.println("----------------------------------------------------");
		FirstAppearOnceChar_50 fac = new FirstAppearOnceChar_50();
		System.out.println(fac.firstNotRepeatingChar("abacceff"));
	}

	public char firstNotRepeatingChar(String str) {
		if (str == null || str.length() == 0) {
			return '\0';
		}
		int[] count = new int[256];
		for (int i = 0; i < str.length(); i++) {
			count[str.charAt(i)]++;
		}
		for (int i = 0; i < str.length(); i++) {
			if (count[str.charAt(i)] == 1) {
				return str.charAt(i);
			}
		}
		return '\0';
	}

}
