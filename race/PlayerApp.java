package race;
import java.util.Scanner;
public class PlayerApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Player[] players = new Player[3];
		int i;
		
		for (i = 0; i < players.length; i++) {
			Player player = new Player();
			System.out.println("선수 이름: ");
			player.setName(scan.next());
			System.out.println("기록: ");
			player.setRec(scan.nextInt());
			players[i] = player;
		}
		
		for (i = 0; i < players.length; i++) {
			players[i].printStates();
		}
	}

}
