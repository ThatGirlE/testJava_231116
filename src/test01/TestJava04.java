package test01;

public class TestJava04 {
	public static void main(String[] args) {
		
		int a = 20, b = 9;
		int result1, result2;
		double result3;
		
		result1 = a + b ;
		result3 = a / b;
		
		//System.out.println(result2); // 정수/ 정수 = 정수
		System.out.println(result3); // 정수 / 정수 = 실수형선언해도 .0만 붙고 소수계산이 안됨
		
		// 10 / 2 -> 5를 실수타입변수에 저장하면 5.0
		double result4;
		
		result4 = 10 / 3.0; // 정수 / 실수 = 실수가 나옴.
		System.out.println(result4);
		
		int x = 10;
		double y = 3.5;
		
		double result_xy = x / y;
		
		System.out.println(result_xy);
		
		String str = 3 + "3";
		System.out.println(str);
		
		String str1 = "300000";
		int intStr = Integer.parseInt(str1); // wrapper class, 문자-> 정수로 형변환
		
		System.out.println(intStr);
		
		int intStr2 = 1000;
		String str3 = String.valueOf(intStr2); // 숫자 -> 문자
		System.out.println(intStr2);
		
	}

}
