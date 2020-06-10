package race;
import java.util.Scanner;
public class PlayerApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Player[] players = new Player[3];
		int i;
		
		for (i = 0; i < players.length; i++) {
			Player player = new Player();
			System.out.print("���� �̸�: ");
			player.setName(scan.next());
			System.out.print("���: ");
			player.setRec(scan.nextInt());
			players[i] = player;
		}
		
		for (i = 0; i < players.length; i++) {
			players[i].printStates();
		}
		
		//��ŷ ���ϱ� 
		Player[] ranking = new Player[3];
		if (players[0].getRec() < players[1].getRec()) {
			
			if (players[0].getRec() < players[2].getRec()) {
				if (players[1].getRec() < players[2].getRec()) {
					System.out.println("��: " + players[0].getName() 
							+ ", ��: " + players[1].getName()
							+ ", ��: " + players[2].getName());
				} else {
						System.out.println("��: " + players[0].getName() 
							+ ", ��: " + players[2].getName()
							+ ", ��: " + players[1].getName());
					}
			} 
		} else if (players[1].getRec() < players[2].getRec()) {
			if (players[2].getRec() < players[0].getRec()) {
				System.out.println("금: " + players[1].getName() 
						+ ", 은: " + players[2].getName()
						+ ", 동: " + players[0].getName());
			} else if (players[2].getRec() < players[1].getRec()) {
			System.out.println("금: " + players[2].getName() 
					+ ", 은: " + players[1].getName()
					+ ", 동: " + players[0].getName());
			} else {
			System.out.println("금: " + players[1].getName() 
					+ ", 은: " + players[0].getName()
					+ ", 동: " + players[2].getName());
			}
		} else { 
			System.out.println("금: " + players[2].getName() 
				+ ", 은: " + players[1].getName()
				+ ", 동: " + players[0].getName());
		}
	}
}

/**
System.out.println(players[0].getName() 
+"�� " + players[1].getName() + " ���� ������."); 
**/



