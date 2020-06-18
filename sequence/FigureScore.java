package sequence;

import java.util.Scanner;

/*
 5명의 심사위원의 점수중에서 0~100점 만점에서
 최고점과 최하점을 제외한 5명 점수 평균 구하기
 */
public class FigureScore {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] jud = new int[5];
		double sum = 0;
		int min = 100, max = 0;
		for (int i = 0; i < jud.length; i++) {
			System.out.println("심사위원 점수 입력: ");
			jud[i] = scan.nextInt();
			sum += jud[i];
			if (max < jud[1]) max = jud[i];
			if (min > jud[1]) min = jud[i];
		}
		sum -= max;
		sum -= min;
		System.out.println("평균= " + (sum/3));
	}
}
