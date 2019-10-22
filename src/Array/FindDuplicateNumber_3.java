package Array;

import java.util.HashSet;

public class FindDuplicateNumber_3 {
	public int findDuplicateNumber(int[] arr) {
		if (arr == null || arr.length <= 0) {
			return -1;
		}

		for (int i = 0; i < arr.length; i++) {
			while (arr[i] != i) {
				if (arr[arr[i]] == arr[i]) {
					return arr[i];
				} else {
					/*
					 * int temp = arr[i]; arr[i] = arr[arr[i]]; arr[arr[i]] = temp;
					 */
					swap(arr, i, arr[i]);
				}

			}
		}

		return -1;
	}

	private void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public int findDup(int[] arr) {
		if (arr == null || arr.length <= 0) {
			return -1;
		}
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			if (!set.add(arr[i])) {
				return arr[i];
			}
		}
		return -1;

	}

	public static void main(String[] args) {
		int[] arr = { 0, 1, 2, 3, 4 };
		FindDuplicateNumber_3 fd = new FindDuplicateNumber_3();
		// System.out.println(fd.findDuplicateNumber(arr));
		// System.out.println(fd.findDup(arr));
		System.out.println(fd.findDuplicateNumber_practice(arr));
		// fd.swap2(arr, 0, 1);
		// System.out.println(Arrays.toString(arr));
	}

	public int findDuplicateNumber_practice(int[] arr) {
		if (arr == null || arr.length <= 0) {
			return -1;
		}
		for (int i = 0; i < arr.length; i++) {
			while (arr[i] != i) {
				if (arr[i] == arr[arr[i]]) {
					return arr[i];
				} else {
					int m = arr[i];
					int n = arr[arr[i]];
					arr[arr[i]] = m;
					arr[i] = n;
				}
			}
		}
		return -1;
	}

}
