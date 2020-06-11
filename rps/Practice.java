package rps;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			
			System.out.println("메뉴: 1.시작  2.종료");
			int userInput = scan.nextInt();
			
			switch (userInput) {
			case 1:
				System.out.println("시스템을 시작합니다.");
				break;
			case 2:
				System.out.println("시스템을 종료합니다.");
				return;
			}
		}
	}
}
