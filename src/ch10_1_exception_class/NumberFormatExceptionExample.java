package ch10_1_exception_class;

public class NumberFormatExceptionExample {
	public static void main(String[] args) {

		String date1 = "200";
		String date2 = "a300";

		int value1 = Integer.parseInt(date1);

		int value2 = Integer.parseInt(date2);

		int result = value1 = value2;

		System.out.printf("%d + %d = %d\n", value1, value2, result);

	}

}
