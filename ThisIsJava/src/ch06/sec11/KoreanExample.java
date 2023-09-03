package ch06.sec11;

public class KoreanExample {

	public static void main(String[] args) {

		Korean k1 = new Korean("123124-12412421", "김자반");
		
		System.out.println(k1.nation);
		System.out.println(k1.ssn);
		System.out.println(k1.name);
		
		k1.name = "이도현";
		System.out.println(k1.name);
	}

}
