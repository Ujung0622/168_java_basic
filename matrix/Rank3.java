package matrix;

import java.util.Random;

public class Rank3 {
	public static void main(String[] args) {
		Random rand = new Random(); 
		int[] scores = new int[5];
		
		for(int i=0; i<scores.length; i++) {
			scores[i] =rand.nextInt(101);
		}
		for (int i=0; i<scores.length; i++) {
			for(int j=0; j<i; j++) {
				if (scores[i] > scores[j]) {
					int temp = scores[j];
					scores[j] = scores[i];
					scores[i] = temp;
				}
			}
		}
		
		for(int i=0; i<scores.length; i++) {
			System.out.printf("%d등\t%d점\n", i+1, scores[i]);
		}
		
		
	}

}
