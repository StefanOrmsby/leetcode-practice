package Array;

public class ReOrderArray_21 {
	public void reOrderArray(int[] a) {
		int[] temp = new int[a.length];
		int t = 0;
		for (int i = 0; i < a.length; i++) {
			if (isOdd(a[i])) {
				temp[t++] = a[i];
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (!isOdd(a[i])) {
				temp[t++] = a[i];
			}
		}
		for (int i = 0; i < a.length; i++) {
			a[i] = temp[i];
		}
	}

	/**
	 * ÊÇ·ñÊÇÆæÊý
	 * 
	 * @param i
	 * @return
	 */
	public boolean isOdd(int i) {
		return (i & 1) == 1;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void reOrderArray_practice(int[] a) {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
