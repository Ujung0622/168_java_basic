package test;

import java.util.Scanner;

class Lotto {
	private int limit;

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public int getLimit() {
		return limit;
	}

	public int buy(int money) {
		int count = 0;
		if (money < 1000) {
			System.out.println("천 원 이상 구매 가능합니다.");
		} else {
			if (limit > money / 1000) {
				count = money / 1000;
			} else {
				count = limit;
			}
		}
		return count;
	}
}

public class LottoApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("구매제한 설정");
		Lotto lot = new Lotto();
		lot.setLimit(scan.nextInt());

		while (true) {
			System.out.println("0:종료  1:로또 구매 ");
			switch (scan.nextInt()) {
			case 0:
				System.out.println("종료");
				return;
			case 1:
				buyLogic(scan, lot);
				break;
			default:
				break;
			}
		}
	}
	public static void buyLogic(Scanner scan, Lotto lot) {
		System.out.println("구입");
		System.out.println("입금액: ");
		System.out.printf("구입 로또 %d 장\n", lot.buy(scan.nextInt()));
	}
}