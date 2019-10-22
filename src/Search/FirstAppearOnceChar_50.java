package Search;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class FirstAppearOnceChar_50 {
	public static void main(String[] args) {
		HashMap map = new HashMap(); // ����Map����
		map.put("apple", "���ʵ�ƻ��"); // �򼯺�����Ӷ���
		map.put("computer", "���������ļ����");
		map.put("book", "�ѻ���ɽ��ͼ��");
		map.put("time", new Date());
		String key = "book";
		boolean contains = map.containsKey(key); // �ж��Ƿ����ָ���ļ�ֵ
		if (contains) { // �������Ϊ��
			System.out.println("��Map�����а�������" + key); // �����Ϣ
		} else {
			System.out.println("��Map�����в���������" + key);
		}

		boolean containsValues = map.containsValue("�ѻ���ɽ��34ͼ��");
		System.out.println(containsValues);

		System.out.println("----------------------------------------------------");
		FirstAppearOnceChar_50 fac = new FirstAppearOnceChar_50();
		System.out.println(fac.firstNotRepeatingChar("abacceff"));
	}

	public char firstNotRepeatingChar(String str) {
		if (str == null || str.length() == 0) {
			return '\0';
		}
		int[] count = new int[256];
		for (int i = 0; i < str.length(); i++) {
			count[str.charAt(i)]++;
		}
		for (int i = 0; i < str.length(); i++) {
			if (count[str.charAt(i)] == 1) {
				return str.charAt(i);
			}
		}
		return '\0';
	}

}
