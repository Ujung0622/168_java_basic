package grade;
import java.util.Scanner;
public class GradeDemo {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	int[] arr = new int[3]; 
	
	for (int i = 0; i < 3; i++) {
	System.out.println("학생 점수: ");
	arr[i] = scan.nextInt();
	}
	
	// 클래스 내부 field instance 변수는 초기화 하면 안되고, 
	// 메소드 내부 area 지역 변수 는 반드시 초기화해야한다.
	
	// 클래스 내부를 field 라고 하는데, 인스턴스 변수(파란색)는 반드시 초기화 하면 안된다.
	// 메소드 내부를  area 라고 하는데, 지역 변수는 반드시 초기화해야한다. 
	// 지역 변수의 값을 받아서 초기화한다. 
	int result = 0;
	if (arr[0] > arr[1] && arr[0] > arr[2]) {
		result = arr[0];
	} else if (arr[1] > arr[0] && arr[1] > arr[2]) {
		result = arr[1];
	} else {
		result = arr[2];
		}
	System.out.println(result);
	}
}
