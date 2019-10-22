package Search;

public class FindIn2DArray_4 {
	public boolean FindIn2DArray(int target, int[][] array) {
		int col = 0;
		int row = array.length - 1;
		while (row >= 0 && col < array[0].length) {
			if (array[col][row] == target) {
				return true;
			} else if (array[col][row] > target) {
				row--;
			} else {
				col++;
			}
		}
		return false;

	}
}
