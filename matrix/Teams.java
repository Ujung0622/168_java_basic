package matrix;

public class Teams {
	public static void main(String[] args) {

		String[][] teams = { { "길동", "순신", "강참", "철수" }, 
				{ "톰", "제임스", "칼", "로빈" }, 
				{ "제이콥", "유정", "사라", "태빈" },
				{ "민수", "동수", "수민", "민지" } };

		for (int i = 0; i < teams.length; i++) {
			for (int j = 0; j < teams[i].length; j++) {
				System.out.printf("%s\t", teams[i][j]);
			}
			System.out.println("");
		}
	}
}
