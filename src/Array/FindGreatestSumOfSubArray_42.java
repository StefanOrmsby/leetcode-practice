package Array;

public class FindGreatestSumOfSubArray_42 {
	public int findGreatestSumOfSubArray(int[] array) {
		if (array == null || array.length <= 0) {
			return -1;
		}
		int currentSum = array[0];
		int maxSum = array[0];
		for (int i = 1; i < array.length; i++) {
			if (currentSum < 0) {
				currentSum = array[i];
			} else {
				currentSum += array[i];
			}
			if (currentSum > maxSum) {
				maxSum = currentSum;
			}
		}
		return maxSum;
	}

	public int findGreatestSumOfSubArray_practice(int[] array) {
		if (array == null || array.length <= 0) {
			return -1;
		}
		int maxSum = array[0];
		int curSum = array[0];
		for (int i = 1; i < array.length; i++) {
			if (curSum < 0) {
				curSum = array[i];
			} else {
				curSum += array[i];
			}
			maxSum = Math.max(maxSum, curSum);
		}
		return maxSum;
	}

}
