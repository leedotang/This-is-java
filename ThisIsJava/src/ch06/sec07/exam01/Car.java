package ch06.sec07.exam01;

public class Car {
	
	// 필드 선언
	String company = "현대 자동차";
	String model;
	String color;
	int maxSpeed;
	
	// 생성자 선언
	
	Car() {
		System.out.println("1");
	}
	
	Car(String model){
		this.model = model;
		System.out.println("2");
	}
	
	Car(String model, String color) {
		this.model = model;
		this.color = color;
		System.out.println("3");
	}
	
	Car(String model, String color, int maxSpeer) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeer;
		System.out.println("4");
	}
	
}
