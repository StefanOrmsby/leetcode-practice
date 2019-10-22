package Chap2;

public class FindIn2DArray_4 {
	/**
	 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
	 * 
	 * @param target
	 * @param array
	 * @return
	 */
	public boolean Find(int target, int[][] array) {

		// 行
		int col = array.length;

		// 列
		int row = array[0].length;
		int i = 0;
		int j = row - 1;
		while (i <= col - 1 && j >= 0) {
			if (target > array[i][j]) {
				i++;
			} else if (target < array[i][j]) {
				j--;
			} else {
				return true;
			}
		}
		return false;
	}
}
