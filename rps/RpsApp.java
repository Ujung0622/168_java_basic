package rps;

import java.util.Random;
import java.util.Scanner;
/*	
 "플레이어 : 가위"
 "컴퓨터 : 보"
 
  "플레이어 승리", "플레이어 패배", "플레이어 무승부"
 */

public class RpsApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();

		while (true) {
			System.out.println("<가위 바위 보 게임>");
			System.out.println("메뉴: 0.종료    1.게임 ");
			switch (scan.nextInt()) {
			case 0:
				return;
			case 1:
				game(scan, rand);
				break;
			default: {
				System.out.println("잘못 된 값을 입력하셨습니다.");
				break;
			}
			}
		}
	}

	private static void game(Scanner scan, Random rand) {
		System.out.println("가위:1   바위:2  보:3 ");
		System.out.print("숫자 입력: ");
		int player = scan.nextInt();
		int computer = rand.nextInt(3) + 1;
		String res = "";

		if (player > 3) {
			res = "판결 불가";
		} else if (player == 1 && computer == 3) {
			res = "승리";
		} else if (player == 2 && computer == 1) {
			res = " 승리 ";
		} else if (player == 3 && computer == 2) {
			res = " 승리 ";
		} else if (player == computer) {
			res = " 무승부 ";
		} else {
			res = "패배";
		}

		String rpsP = rps(player);
		String rpsC = rps(computer);

		System.out.println(" ");
		System.out.println("플레이어: " + rpsP);
		System.out.println("컴퓨터: " + rpsC);
		System.out.println("결과: " + res);
		System.out.println("***************");
		System.out.println(" ");

	}

	private static String rps(int player) {
		String rpsP = "";
		switch (player) {
		case 1:
			rpsP = "가위";
			break;
		case 2:
			rpsP = "바위";
			break;
		case 3:
			rpsP = "보";
			break;
		default:
			rpsP = "잘못 된 값";
			break;
		}
		return rpsP;
	}
}
