package ch02.sec06;

public class StringExample {

	public static void main(String[] args) {
		String name = "이도현";
		String job = "개발자";
		System.out.println(name);
		System.out.println(job);
		
		String str = "나는 \'자바\'를 배웁니다."; // \*안됨
		System.out.println(str);
		
		str = "번호\t이름\t직업 ";
		System.out.println(str);
		
		System.out.print("나는\n");
		System.out.print("자바를\n");
		System.out.print("배웁니다");
				
	}
}
