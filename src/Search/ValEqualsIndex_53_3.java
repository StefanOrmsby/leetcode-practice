package Search;

public class ValEqualsIndex_53_3 {
	public int findValEqualsIndex(int[] arr) {
		if (arr == null || arr.length <= 0) {
			return -1;
		}
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] == mid) {
				return arr[mid];
			} else if (arr[mid] > mid) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		ValEqualsIndex_53_3 vei = new ValEqualsIndex_53_3();
		int[] arr = { -3, -1, 1, 3, 5 };
		System.out.println(vei.findValEqualsIndex(arr));
	}
}
