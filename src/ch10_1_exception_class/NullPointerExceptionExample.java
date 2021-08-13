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
			System.out.println("예외발생!");
			System.out.println("e.toString(): " + e.toString());
			System.out.println("e.getMessage(): " + e.getMessage());
			System.out.println("e.printStackTrace(): ");
			e.printStackTrace();
		} catch(Exception e ) {
			e.printStackTrace();
			System.out.println("예외 발생 코드 실행!");
		}

		System.out.println("프로그램 종료");

	}

}
