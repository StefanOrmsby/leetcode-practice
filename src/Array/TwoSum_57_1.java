package Array;

import java.util.ArrayList;

/**
 * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S；如果有多对数字的和等于S，输出两个数的乘积最小的。
 * 
 * @author Administrator
 *
 */

public class TwoSum_57_1 {
	/**
	 * 要使乘积最小，只需要这两个数在排序数组中隔得最远，联想周长相等的扁长的四边形和正方形哪个面积更大些
	 * 
	 * @param array
	 * @param sum
	 * @return
	 */
	public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
		ArrayList<Integer> list = new ArrayList<>();
		if (array == null || array.length <= 0)
			return list;
		int start = 0;
		int end = array.length - 1;
		while (start < end) {
			if (array[start] + array[end] == sum) {
				list.add(array[start]);
				list.add(array[end]);
				break;
			} else if (array[start] + array[end] > sum) {
				end--;
			} else {
				start++;
			}
		}
		return list;
	}

	public ArrayList<Integer> FindNumbersWithSum_practice(int[] array, int sum) {
		if (array == null || array.length <= 0) {
			return null;
		}
		int max = array.length - 1;
		int min = 0;
		ArrayList<Integer> list = new ArrayList<>();
		while (max > min) {
			if (array[max] + array[min] == sum) {
				list.add(array[max]);
				list.add(array[min]);
				return list;
			} else if (array[max] + array[min] > sum) {
				max--;
			} else {
				min++;
			}
		}
		return list;
	}

}
