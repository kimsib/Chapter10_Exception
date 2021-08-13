package ch10_3_example;

public class ExceptionExample {
	public static void main(String[] args) {

		
	
		
		try {
			System.out.println(Calculator.add(10000, -2));
			System.out.println(Calculator.div(10000, 0));

		} catch (BizNegativeNumberException e) {
			e.printStackTrace();
//			System.out.println("결과값이 음수입니다. 확인요망");
		} catch (Biz e) {
		System.out.println(e.toString());
		System.out.println(e.getMessage());
//			System.out.println("결과값이 천을 넘습니다.확인 요망");
		}
		// 무조건 마지막에 모두 들리는 곳
		finally {
			System.out.println("입력값을 확인하세요~");
		}

//		System.out.println(Calculator.sub(5, 3));
//		System.out.println(Calculator.multi(1, 3));
//		System.out.println(Calculator.div(1, 1));
		System.out.println("프로그램 정상 종료");
	}
}
