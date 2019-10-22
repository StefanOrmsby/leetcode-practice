package practice;

public class FindMedianSortedArrays_004 {
	public double findMedianSortedArrays(int[] A, int[] B) {
		int m = A.length;
		int n = B.length;
		int len = m + n;
		int left = -1, right = -1;
		int aStart = 0, bStart = 0;
		for (int i = 0; i <= len / 2; i++) {
			left = right;
			if (aStart < m && (bStart >= n || A[aStart] < B[bStart])) {
				right = A[aStart++];
			} else {
				right = B[bStart++];
			}
		}
		if ((len & 1) == 0)
			return (left + right) / 2.0;
		else
			return right;
	}

	public static void main(String[] args) {
		FindMedianSortedArrays_004 fmsa = new FindMedianSortedArrays_004();
		double a = fmsa.findMedianSortedArrays(new int[] { 1, 2, 3 }, new int[] { 2 });
		System.out.println(a);

	}
}
