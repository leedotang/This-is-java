package ch06.sec08.exam01;

public class CalculatorExample {

	public static void main(String[] args) {

		Calculator myCalc = new Calculator();
		
		double result1 = myCalc.areaRectangle(10);
		
		double result2 = myCalc.areaRectabgle(10, 20);
		
		System.out.println("정사각형 넓이 = " + result1);
		System.out.println("직사각형 넓이 = " + result2);
	}

}
