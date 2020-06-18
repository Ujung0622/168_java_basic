package item2;

import java.util.Scanner;

public class Item2App {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Item2 item2 = null;
		Item2Service item2Service = new Item2ServiceImpl();
		while (true) {
			System.out.println("0.EXIT  1.ADD  2.LIST");
			switch (scan.nextInt()) {
			case 0: System.out.println("EXIT."); return;
			case 1: System.out.println("ADD");
			item2 = new Item2();
			System.out.println("상품명: ");
			item2.setName(scan.next());
			System.out.println("가격: ");
			item2.setPrice(scan.nextInt());
			item2Service.addCart(item2);
			break;
			
			case 2: System.out.println("LIST");
			
			}
		}		
	}
}
