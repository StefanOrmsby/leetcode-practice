package Array;

public class FindNumsAppearOnce_56 {
	// num1,num2�ֱ�Ϊ����Ϊ1�����顣��������
	// ��num1[0],num2[0]����Ϊ���ؽ��
	public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
		if (array == null || array.length < 2)
			return;
		int res = 0;
		// �ⲽ�õ�����ֻ����һ�ε��������ֵ
		for (int i = 0; i < array.length; i++) {
			res ^= array[i];
		}
		// res�϶���Ϊ0����ôres��Ȼ��ĳһλ��1���ҵ���һ��1������������Ϊn;
		// ��nλ�����ֵΪ1��Ҳ˵�������������ĵ�nλ����ͬ
		int indexOfFirstOne = firstBitOfOne(res);
		// �Ե�nλ�ǲ���1Ϊ��׼���������ֳ�����
		// ��ͬ����һ���ᱻ�ֵ�ͬһ�������飬��Ϊ��ͬ�����ֵ�nλҲ����ͬ�ģ�ֻ����һ�ε����������ֿ϶�����ֵ�һ�������У���Ϊ���ǵĵ�nλ���ֵΪ1��˵�����ǵ�nλ����ͬ
		for (int i = 0; i < array.length; i++) {
			if (isBitOfOne(array[i], indexOfFirstOne))
				num1[0] ^= array[i];
			else
				num2[0] ^= array[i];
		}
	}

	/**
	 * �ҵ������������ĵ�һ��1����������0110�ĵ�һ��1����Ϊ1
	 */
	private int firstBitOfOne(int val) {
		int index = 0;
		while (val != 0) {
			if ((val & 1) == 1)
				return index;
			val = val >> 1;
			index++;
		}
		return -1;
	}

	/**
	 * �жϴ����������ĵ�indexλ�ǲ���1
	 */
	private boolean isBitOfOne(int val, int index) {
		val = val >> index;
		return (val & 1) == 1;
	}
}
