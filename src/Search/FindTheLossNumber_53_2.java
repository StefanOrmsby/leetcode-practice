package Search;

public class FindTheLossNumber_53_2 {
	public int findLoss(int[] arr) {
		if (arr == null || arr.length <= 0) {
			return -1;
		}
		int end = arr.length - 1;
		int start = 0;
		int len = arr.length;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] == mid) {
				start = mid + 1;
			} else {
				if (mid == 0 || arr[mid - 1] == mid - 1) {
					return mid;
				} else {
					end = mid - 1;
				}
			}
		}
		if (start == len)
			return len;
		return -1;
	}

	public static void main(String[] args) {
		FindTheLossNumber_53_2 ftn = new FindTheLossNumber_53_2();
		int[] arr = { 0, 1, 2, 3, 5, 6, 7, 8 };
		System.out.println(ftn.findLoss(arr));
	}
}
