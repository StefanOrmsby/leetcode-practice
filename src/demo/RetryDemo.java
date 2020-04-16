package demo;

public class RetryDemo {
	public static void main(String[] args) {
		/**
		//retry: 
		for (int i = 0; i < 10; i++) {
			//retry:
			while (i == 5) {
				continue;
			}
			System.out.println(i + " ");
		}
		*/
		retry:
		for (int i = 0; i < 2; i++) {
			System.out.println("i=" + i);
			for (int j = 0; j < 10; j++) {
				System.out.println("j= " + j);
				continue retry;
			}
		}
	}
}
