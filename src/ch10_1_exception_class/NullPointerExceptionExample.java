package ch10_1_exception_class;

public class NullPointerExceptionExample {

	public static void main(String[] args) {

		String date1;
		String date2 = null;
		String date3 = "";
		String date4 = " ";

		try {
		
			System.out.println(date2.length());

		} catch (NullPointerException e) {
			System.out.println("���ܹ߻�!");
			System.out.println("e.toString(): " + e.toString());
			System.out.println("e.getMessage(): " + e.getMessage());
			System.out.println("e.printStackTrace(): ");
			e.printStackTrace();
		} catch(Exception e ) {
			e.printStackTrace();
			System.out.println("���� �߻� �ڵ� ����!");
		}

		System.out.println("���α׷� ����");

	}

}
