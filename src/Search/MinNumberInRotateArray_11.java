package Search;

public class MinNumberInRotateArray_11 {
	public int minNumberInRotateArray(int[] array) {
		if (array == null || array.length <= 0) {
			return -1;
		}
		int low = 0;
		int high = array.length - 1;
		while (low < high) {
			int mid = low + (high - low) / 2;
			if (array[mid] > array[high]) {
				low = mid + 1;
			} else if (array[mid] == array[high]) {
				high--;
			} else {
				high = mid;
			}
		}
		return array[low];
	}

	public static void main(String[] args) {
		System.out.println(11 / 2);
	}
}
