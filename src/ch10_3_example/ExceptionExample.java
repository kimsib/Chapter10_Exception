package ch10_3_example;

public class ExceptionExample {
	public static void main(String[] args) {

		
	
		
		try {
			System.out.println(Calculator.add(10000, -2));
			System.out.println(Calculator.div(10000, 0));

		} catch (BizNegativeNumberException e) {
			e.printStackTrace();
//			System.out.println("������� �����Դϴ�. Ȯ�ο��");
		} catch (Biz e) {
		System.out.println(e.toString());
		System.out.println(e.getMessage());
//			System.out.println("������� õ�� �ѽ��ϴ�.Ȯ�� ���");
		}
		// ������ �������� ��� �鸮�� ��
		finally {
			System.out.println("�Է°��� Ȯ���ϼ���~");
		}

//		System.out.println(Calculator.sub(5, 3));
//		System.out.println(Calculator.multi(1, 3));
//		System.out.println(Calculator.div(1, 1));
		System.out.println("���α׷� ���� ����");
	}
}
