package ch04.task;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("가고싶은 층을 눌러 주세요 =======> ");
		
		int button = scan.nextInt();
		String comment;
		
		switch (button) {
		case 1:
			comment = "1층은 식당입니다.";
			break;
		case 2:
			comment = "2층은 병원입니다.";
			break;
		case 3:
			comment = "3층은 학원입니다.";
			break;
		case 4:
			comment = "4층은 회사입니다.";
			break;
		case 5:
			comment = "5층은 스터디 카페입니다.";
			break;
		default:
			comment = "존재하지 않는 층입니다";
			break;
		}
		System.out.println(comment);
		scan.close();
	}
}
