package grade;
import java.util.Scanner;


public class GradeDemo2 {
public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
	 

	 System.out.println("이름");
	 String name = scan.next();
	 final String ENG = "영어";
	 System.out.println("점수");
	 int score = scan.nextInt(); 
	 System.out.println("등급");
	 String grade = "";
	 
	 if (score >= 90) grade = "A";
	 else if (score >= 80) grade = "B";
	 else if (score >= 70) grade = "C";
	 else if (score >= 60) grade = "D";
	 else if (score >= 50) grade = "E";
	 else grade = "F"; 
		
 
	System.out.println("*********************");
	System.out.println("이름      영어       점수     등급");
	System.out.println("---------------------");
	System.out.println("|"+name+"| "+ENG+" | "+score+"점 | "+grade+" |");
	System.out.println("*********************");
	}
}
