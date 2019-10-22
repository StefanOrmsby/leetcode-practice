package Array;

import java.util.ArrayList;

public class ContinuousSeq_57_2 {
	public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
		int left = 1;
		int right = 2;
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		while (left < right) {
			int curSum = (left + right) * (right - left + 1) / 2;
			if (curSum == sum) {
				ArrayList<Integer> list = new ArrayList<>();
				for (int i = left; i <= right; i++) {
					list.add(i);
				}
				result.add(list);
				right++;
			} else if (curSum < sum) {
				right++;
			} else {
				left++;
			}
		}
		return result;
	}

	public ArrayList<ArrayList<Integer>> FindContinuousSequence_practice(int sum) {
		int min = 1;
		int max = 2;
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		while (max > min) {
			int curSum = (max + min) * (max - min + 1) / 2;
			if (curSum == sum) {
				ArrayList<Integer> al = new ArrayList<>();
				for (int i = min; i <= max; i++) {
					al.add(i);
				}
				list.add(al);
				max++;
			} else if (curSum > sum) {
				min++;
			} else {
				max++;
			}
		}
		return list;
	}

}
