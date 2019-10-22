package Search;

public class NumOfK_53_1 {

	public int numOfK(int[] arr, int k) {
		if (arr == null || arr.length <= 0) {
			return 0;
		}
		int first = getFirstIndexOfK(arr, k, 0, arr.length - 1);
		int last = getLastIndexOfK(arr, k, 0, arr.length - 1);
		if (first == -1 && last == -1) {
			return 0;
		} else {
			return last - first + 1;
		}
	}

	private int getFirstIndexOfK(int[] arr, int k, int start, int end) {
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] == k) {
				if (mid > 0 && arr[mid - 1] == k) {
					end = mid - 1;
				} else {
					return mid;
				}
			} else if (arr[mid] > k) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}

	private int getLastIndexOfK(int[] arr, int k, int start, int end) {
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] > k) {
				end = mid - 1;
			} else if (arr[mid] < k) {
				start = mid + 1;
			} else {
				if (mid < arr.length - 1 && arr[mid + 1] == k) {
					start = mid + 1;
				} else {
					return mid;
				}

			}
		}
		return -1;
	}
}
