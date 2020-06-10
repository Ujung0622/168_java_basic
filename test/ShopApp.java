package test;
import java.util.Scanner;
public class ShopApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Shop[] shops = new Shop[3];
		int i;
		
		for (i = 0; i < shops.length; i++) {
		Shop shop = new Shop();
		System.out.println("이름: ");
		shop.setName(scan.next());
		System.out.println("핸드폰 가격: ");
		shop.setPhone(scan.nextInt());
		System.out.println("TV 가격: ");
		shop.setTv(scan.nextInt());
		System.out.println("Computer 가격: ");
		shop.setCom(scan.nextInt());
		
		shop.sum();
		shops[i] = shop;
	}

		for (i = 0; i < shops.length; i++) {
			shops[i].printStates();
		}
	}
}
