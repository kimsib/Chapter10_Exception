package ch10_3_example;

import java.util.Scanner;

public class ExceptionCase {
	public static void main(String[] args) {

		// 두 정수를 사용자로부터 입력받기 3, 4 3/4 나누고 실행하기
		// 입력받은 숫자와 나누기 결과를 출력하시오

		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("a/b...a?>");
			int n1 = sc.nextInt();

			System.out.print("a/b...b?>");
			int n2 = sc.nextInt();

			System.out.printf("%d / %d = %d\n", n1, n2, n1 / n2);

		} catch (ArithmeticException e) {
			System.out.println("0 으로 나눌 수 없습니다 .");
		} finally {
			System.out.println("프로그램 종료");
		}

	}
}
