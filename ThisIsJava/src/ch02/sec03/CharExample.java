package ch02.sec03;

public class CharExample {

	public static void main(String[] args) {

		char c1 = 'A'; // 문자 저장
		char c2 = 65;  // 유니코드 직접 저장
		
		char c3 = '가'; // 문자 저장
		char c4 = 44032; // 유니코드 직접 저장
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		
//		char c = ''; // 컴파일에러 ''만 쓸 수 없음
		char d = ' '; // 공백하나 포함해서 초기화
		
	}

}
