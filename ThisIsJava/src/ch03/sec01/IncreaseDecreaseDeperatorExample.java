package ch03.sec01;

public class IncreaseDecreaseDeperatorExample {

	public static void main(String[] args) {

		int x = 10;
		int y = 10;
		int z;
		
		x++;
		++x;
		System.out.println("x = " + x);
		System.out.println("================");
		
		y--;
		--y;
		System.out.println("y = " + y);
		System.out.println("================");
		
		z = x++;
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		System.out.println("================");
		
		z = ++x;
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		System.out.println("=================");
		
		z = ++x + y++;
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		int s = 1;
		int e = 1;
		int result1 = ++s + 10;
		int result2 = e++ + 10;
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(e);
		
	}

}
