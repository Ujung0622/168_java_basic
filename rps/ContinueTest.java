package rps;

public class ContinueTest {
	public static void main(String[] args) {

		for (int i = 5; i <= 15; i++) {
			if (i == 12) {
				// continue는 break와는 다소 차이가 있다.
				// 현재 상황에서 Loop(반복문)의 최상위로 돌아간다.
				// 최상위 => for(int i = 5; i <= 15; i++) {
				// for문이므로 증감부로 가게 된다.
				// 현재의 어떤 특정값을 스킵 할 때 사용한다.

				continue;
			}
			System.out.println("i = " + i);
		}
	}
}