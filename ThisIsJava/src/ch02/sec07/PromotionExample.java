package ch02.sec07;

public class PromotionExample {

	public static void main(String[] args) {

		// 기본타입 허용 범위 byte < short, char < int < long < float < double
		
		// 자동타입 변환
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue: " + intValue);
		System.out.println("=======================");
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드: " + intValue);
		System.out.println("=======================");
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue: " + intValue);
		System.out.println("========================");
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue: " + floatValue);
		System.out.println("=======================");
		
		floatValue = 100.5F;
		double doubleValue = floatValue;
		System.out.println("doubleValue: " + doubleValue);
		
		
		
	}

}
