package test01;

public class TestJava03 {
	public static void main(String[] args) {
		
		char var1 = 'A'; // char 타입은 문자열(큰 따음표) 저장 불가
		//System.out.println(var1);
		String var2 = "A"; // 문자열 String S대문자.
		//System.out.println(var2);
		
		
		char chr = 'A'; // 한글자만 저장 가능한 타입 char
		char a = 10; // 메모리 용량 안이면 정수도 저장가능
		
		String str = "Korea\nJapan"; // 문자열 class로 저장?
		
		System.out.println(str);
		
		float c = 3.14f;  // float 사용할시 f붙여줘야됨
		long d = 10000000L; // long 사용할시 L 붙여줘야됨
		
		double k = 3.1455645;
		
		boolean jj = true;   // true false t,f 소문자로
		
		char charValue = 'A';
		int intValue = charValue;
		System.out.println(intValue); // 오류가 안남 int로 자동변환 되고 유니코드값 반환
		
		int intValue1 = 10;
		//byte byteValue = intValue1; // 큰 용량 -> 작은용량 자동형변환 불가		
		double doubleValue = 10.123;
		int intValue2 = (int)doubleValue; // 강제 타입 변환(임시형변환)
		
		System.out.println(intValue2); // 실수-> 정수로 임시형변환하면 소수점은 버림
		
	}

}
