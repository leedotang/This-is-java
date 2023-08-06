package ch05.sec05;

public class SubStringExample {

	public static void main(String[] args) {
		
		String ssn = "1231241240-36161421";
		
		String firstNum = ssn.substring(0, 8);
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(6);
		System.out.println(secondNum);

	}

}
