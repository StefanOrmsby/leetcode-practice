package Chap2;

import java.util.Arrays;

public class MergeTwoSortedArray_5 {
	/**
	 * ���������������A1��A2��A1ĩβ���㹻�ռ�����A2��ʵ��һ��������A2���������ֲ��뵽A1�У�������������������ġ�
	 * 
	 * @param a
	 * @param b
	 */
	public static void merge(Integer[] a, Integer[] b) {
		int i = 0;
		int k = 0;
		while (a[i] != null) {
			i++;
		}
		int pA = i - 1;
		int pB = b.length - 1;
		k = i + b.length - 1;
		while (k >= 0) {
			if (a[pA] < b[pB]) {
				a[k--] = b[pB--];
			} else if (a[pA] >= b[pB]) {
				a[k--] = a[pA--];
			} else if (pA < 0) {
				a[k--] = b[pB--];
			} else if (pB < 0) {
				a[k--] = a[pA--];
			}
		}

	}

	public static void main(String[] args) {
		Integer[] a = new Integer[10];
		Integer[] b = { 1, 3, 5, 7, 9 };
		// {2, 4, 6, 8, 10}
		for (int i = 0; i < 5; i++) {
			a[i] = 2 * i + 2;
		}

		merge(a, b);
		System.out.println(Arrays.toString(a));
	}
}
