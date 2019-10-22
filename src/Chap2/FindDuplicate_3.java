package Chap2;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @author Administrator ��һ������Ϊn����������������ֶ���0��n-1�ķ�Χ�ڡ� ������ĳЩ�������ظ��ģ�����֪���м����������ظ��ġ�
 *         Ҳ��֪��ÿ�������ظ����Ρ����ҳ�����������һ���ظ������֡� ���磬������볤��Ϊ7������{2,3,1,0,2,5,3}����ô��Ӧ������ǵ�һ���ظ�������2����3��
 * 
 */
public class FindDuplicate_3 {
	public int findDuplicate(int[] array) {
		if (array == null || array.length == 0) {
			return -1;
		}
		for (int i = 0; i < array.length; i++) {
			while (array[i] != i) {
				if (array[i] == array[array[i]]) {
					return array[i];
				} else {
					int a = array[array[i]];
					array[array[i]] = array[i];
					array[i] = a;
				}
			}
		}
		return -1;
	}

	public int findDuplicate2(int[] array) {
		if (array == null || array.length <= 0) {
			return -1;
		}
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < array.length; i++) {
			if (!set.add(array[i])) {
				return array[i];
			}
		}
		return -1;
	}

	public int findDuplicate3(int[] array) {
		if (array == null || array.length <= 0) {
			return -1;
		}
		int[] hash = new int[array.length];
		for (int i = 0; i < hash.length; i++) {
			hash[i] = -1;
		}
		for (int i = 0; i < array.length; i++) {
			int a = array[i];
			if (hash[a] != a) {
				hash[a] = a;
			} else {
				return a;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		FindDuplicate_3 fd = new FindDuplicate_3();
		int[] array = { 1, 2, 0, 2 };
		int a = fd.findDuplicate(array);
		System.out.println(a);
	}
}
