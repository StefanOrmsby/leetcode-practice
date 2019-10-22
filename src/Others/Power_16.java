package Others;

public class Power_16 {
	public Double power(double base, int exponent) {
		if (exponent == 0) {
			return (double) 1;
		} else if (exponent < 0) {
			int abs = Math.abs(exponent);
			double result = 1;
			for (int i = 0; i < abs; i++) {
				result *= base;
			}
			return (double) 1 / result;
		} else {
			double result = 1;
			for (int i = 0; i < exponent; i++) {
				result *= base;
			}
			return result;
		}
	}

	public double power_2(double base, int exponent) {
		if (base == 0) {
			return 0;
		}
		double result = 1.0;
		int positiveExponent = Math.abs(exponent);
		while (positiveExponent != 0) {
			// positiveExponent & 1这句是判断奇数的
			if ((positiveExponent & 1) == 1) {
				result *= base;
			}
			base *= base;
			// 右移1位等于除以2
			positiveExponent = positiveExponent >> 1;
		}
		return exponent < 0 ? 1 / result : result;
	}

	public static void main(String[] args) {
		Power_16 p = new Power_16();
		System.out.println(p.power(2, -3));
	}
}
