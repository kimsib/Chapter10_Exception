package ch10_3_example;

public class Calculator {

	public static int add(int x, int y) throws Biz, BizNegativeNumberException {
		int result = x + y;
		if (result > 1_000) {
			throw new Biz();
		}
		if (result < 0) {
			throw new BizNegativeNumberException();
		}
		return result;

	}

	public static int sub(int x, int y) {
		int result = x - y;
		return result;

	}

	public static int multi(int x, int y) {
		int result = x * y;
		return result;

	}

	public static int div(int x, int y) {
		int result = x / y;
		return result;

	}
}