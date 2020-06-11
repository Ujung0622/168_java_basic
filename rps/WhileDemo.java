package rps;

import java.util.Scanner;

public class WhileDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("메뉴: 1.게임   2.종료 ");
			int flag = scan.nextInt();
			switch (flag) {
			case 0:
				System.out.println("게임 종료");
				return;
			case 1:
				System.out.println("게임 시작");
				break;
			}

		}

	}
}
