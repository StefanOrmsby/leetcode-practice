package Chap2;

public class FindIn2DArray_4 {
	/**
	 * ��һ����ά�����У�ÿһ�ж����մ����ҵ�����˳������ÿһ�ж����մ��ϵ��µ�����˳���������һ������������������һ����ά�����һ���������ж��������Ƿ��и�������
	 * 
	 * @param target
	 * @param array
	 * @return
	 */
	public boolean Find(int target, int[][] array) {

		// ��
		int col = array.length;

		// ��
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
