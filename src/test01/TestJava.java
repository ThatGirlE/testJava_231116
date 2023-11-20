package test01;

public class TestJava {
	int z =1;
	public static void main(String[] args) { // main 메소드
		
		int a = 10;  // 정수형 변수 a를 선언하고 정수 10을 저장
		double b = 10.5; // 실수형 변수 b를 선언하고 실수 10.5를 저장
		int c; // 정수형 변수 c를 선언만
		c = 100; // 정수형 변수 c에 100을 저장
		
		int result = a + c; // 정수형 변수 result를 선언과 동시에 a와 c합을 저장
		
		
		
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(result); // result 변수 출력
		
		// 예약된 명령어는 변수이름으로 쓸 수 없다.
		
		int value; // 초기화가 되어 있지 않음
		//int res = value + 10;  value값이 초기화 되어있지 않으므로 에러 발생
		
		System.out.println("c의 값은 " + c + "입니다");	// c의 값은 100입니다.
				
	}

}
