package sequence;

import java.util.Scanner;
/*
 * 1부터 합산하고자 하는 한계 숫자를 입력하시오
 * 1부터 합산한 숫자(이하) 범위내에서 홀수의 합을 출력하시오.
 */
public class InputSeuquence {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("한계 값 입력: ");
		int lim = scan.nextInt();
		int sum = 0;
		for (int i = 0; i < lim; i++) {
			if ((i + 1) % 2 == 1) {
				sum += (i + 1);
			}
		}
		System.out.println(sum);
	}
}
