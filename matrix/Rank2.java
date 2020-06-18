package matrix;

import java.util.Random;

class Class {
	int scores;
	String names;
}

public class Rank2 {
	public static void main(String[] args) {
		Random rand = new Random();
		Class[] classes = new Class[5];
		String[] names = { "철수", "영희", "민지", "유정", "예원" };

		for (int i = 0; i < classes.length; i++) {
			classes[i] = new Class();
			classes[i].names = names[i];
			classes[i].scores = rand.nextInt(101);
		}

		for (int i = 0; i < classes.length; i++) {
			for (int j = 0; j < i; j++) {
				if (classes[i].scores > classes[j].scores) {
					Class temp = classes[i];
					classes[i] = classes[j];
					classes[j]= temp;
				}
			}
		}

		for (int i = 0; i < classes.length; i++) {
			System.out.printf("%d등\t%s\t%d\n", i + 1, classes[i].names, classes[i].scores);
		}

	}

}
