package ch10_3_example;

import java.util.Scanner;

public class ExceptionCase {
	public static void main(String[] args) {

		// �� ������ ����ڷκ��� �Է¹ޱ� 3, 4 3/4 ������ �����ϱ�
		// �Է¹��� ���ڿ� ������ ����� ����Ͻÿ�

		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("a/b...a?>");
			int n1 = sc.nextInt();

			System.out.print("a/b...b?>");
			int n2 = sc.nextInt();

			System.out.printf("%d / %d = %d\n", n1, n2, n1 / n2);

		} catch (ArithmeticException e) {
			System.out.println("0 ���� ���� �� �����ϴ� .");
		} finally {
			System.out.println("���α׷� ����");
		}

	}
}
