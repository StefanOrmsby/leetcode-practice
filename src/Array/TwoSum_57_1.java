package Array;

import java.util.ArrayList;

/**
 * ����һ����������������һ������S���������в�����������ʹ�����ǵĺ�������S������ж�����ֵĺ͵���S������������ĳ˻���С�ġ�
 * 
 * @author Administrator
 *
 */

public class TwoSum_57_1 {
	/**
	 * Ҫʹ�˻���С��ֻ��Ҫ�������������������и�����Զ�������ܳ���ȵıⳤ���ı��κ��������ĸ��������Щ
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
