package Sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class LeastKNums_40 {
	public ArrayList<Integer> leastKNums(int[] input, int k) {
		ArrayList<Integer> list = new ArrayList<>();
		if (input == null || input.length == 0 || k > input.length || k <= 0)
			return list;
		select(input, k - 1);
		for (int i = 0; i < k; i++) {
			list.add(input[i]);
		}
		return list;
	}

	/**
	 * 选择排名为k的元素,只是部分排序，时间复杂度为O(N)
	 */
	private int select(int[] array, int k) {
		int low = 0;
		int high = array.length - 1;
		// high==low时只有一个元素，不切分
		while (high > low) {
			int j = partition(array, low, high);
			if (j == k)
				return array[k];
			else if (j > k)
				high = j - 1;
			else if (j < k)
				low = j + 1;
		}

		return array[k];
	}

	/**
	 * 快速排序的切分方法
	 */
	private int partition(int[] array, int low, int high) {
		int i = low;
		int j = high + 1;
		int v = array[low];
		while (true) {
			while (array[++i] < v)
				if (i == high)
					break;
			while (array[--j] > v)
				if (j == low)
					break;
			if (i >= j)
				break;
			swap(array, i, j);
		}
		swap(array, low, j);
		return j;
	}

	private void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	public ArrayList<Integer> leastKNums_2(int[] input, int k) {
		ArrayList<Integer> list = new ArrayList<>();
		if (input == null || input.length == 0 || k > input.length || k <= 0)
			return list;
		PriorityQueue<Integer> minHeap = new PriorityQueue<>(Comparator.reverseOrder());
		for (int i = 0; i < input.length; i++) {
			minHeap.add(input[i]);
			if (minHeap.size() > k) {
				minHeap.poll();
			}
		}
		list.addAll(minHeap);
		return list;

	}
}
