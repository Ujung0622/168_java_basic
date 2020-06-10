package race;
import java.util.Scanner;
public class PlayerApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Player[] players = new Player[3];
		int i;
		
		for (i = 0; i < players.length; i++) {
			Player player = new Player();
			System.out.print("선수 이름: ");
			player.setName(scan.next());
			System.out.print("기록: ");
			player.setRec(scan.nextInt());
			players[i] = player;
		}
		
		for (i = 0; i < players.length; i++) {
			players[i].printStates();
		}
		
	
		Player[] ranking = new Player[3];
		if (players[0].getRec() < players[1].getRec()) {
			
			if (players[0].getRec() < players[2].getRec()) {
				System.out.println("1등은 " + players[0].getName());
			}
		} else if (players[1].getRec() < players[2].getRec()) {
			System.out.println("1등은 " + players[1].getName());
		} else { 
			System.out.println("1등은 " + players[2].getName());
		}
	}
}
