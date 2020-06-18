package sequence;

public class Names {
	public static void main(String[] args) {
		String[] names = { "a", "b", "c", "d", "e" };
		// ace를 출력
		String sum = "";
		int i = 0;
		while (true) {
			if (i < names.length) {
				if (i % 2 == 0) {
					sum += names[i];
				}
				i++;
			} else {
				break;
			}
		}
		System.out.println(sum);
	}
}
