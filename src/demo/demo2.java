package demo;

public class demo2 {
	public static int aji(int[] arr, int i) {
		int i1 = i;// 默认原值
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] > i) {// 大于基本值
				if (i1 > arr[j] || i == i1) {// 第一次进来arr[j]>i1=i 所以把arr[j]赋值给i1，以后i<i1;第二次进来
												// 如果：i1>arr[j]>i，则：所以把arr[j]赋值给i1，否则不变
					i1 = arr[j];
				}
			}
		}
		return i1;
	}

	public static void main(String[] args) {
		// int[] arr = { 42, 45, 450, 5, 43, 43, 78, 1, 434 };
		// System.out.println(aji(arr, 43));
		for (int i = 199; i < 600; i++) {
			System.out.println(i + "-------" + _calcIsOK("/uqun/appcollector/open/log/report.ajax", i));
		}
	}

	public static int _calcIsOK(final String url, final int status) {
		int isOK = 0;
		// http状态码超过400就认为是一次访问异常
		if (status >= 400 && status != 403 && status != 404 && (status < 530 || status > 539)) {
			isOK = 1;
		}

		/**
		 * 各个业务线特殊的过滤规则
		 */

		if (url.trim().equals("/uqun/appcollector/open/log/report.ajax") && status == 408 || status == 400 || status == 499 || status == 502) {
			isOK = 0;
		}
		return isOK;
	}
}
