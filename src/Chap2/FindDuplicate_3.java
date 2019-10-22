package Chap2;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @author Administrator 在一个长度为n的数组里的所有数字都在0到n-1的范围内。 数组中某些数字是重复的，但不知道有几个数字是重复的。
 *         也不知道每个数字重复几次。请找出数组中任意一个重复的数字。 例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是第一个重复的数字2或者3。
 * 
 */
public class FindDuplicate_3 {
	public int findDuplicate(int[] array) {
		if (array == null || array.length == 0) {
			return -1;
		}
		for (int i = 0; i < array.length; i++) {
			while (array[i] != i) {
				if (array[i] == array[array[i]]) {
					return array[i];
				} else {
					int a = array[array[i]];
					array[array[i]] = array[i];
					array[i] = a;
				}
			}
		}
		return -1;
	}

	public int findDuplicate2(int[] array) {
		if (array == null || array.length <= 0) {
			return -1;
		}
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < array.length; i++) {
			if (!set.add(array[i])) {
				return array[i];
			}
		}
		return -1;
	}

	public int findDuplicate3(int[] array) {
		if (array == null || array.length <= 0) {
			return -1;
		}
		int[] hash = new int[array.length];
		for (int i = 0; i < hash.length; i++) {
			hash[i] = -1;
		}
		for (int i = 0; i < array.length; i++) {
			int a = array[i];
			if (hash[a] != a) {
				hash[a] = a;
			} else {
				return a;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		FindDuplicate_3 fd = new FindDuplicate_3();
		int[] array = { 1, 2, 0, 2 };
		int a = fd.findDuplicate(array);
		System.out.println(a);
	}
}
