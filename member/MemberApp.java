package member;

import java.util.Scanner;

public class MemberApp {
	public static void main(String[] args) {
		// 클래스 인스턴스   = 뉴  생성자 
		Scanner scan = new Scanner(System.in);
         //이걸 해야 덮어 쓰지 않고 따로 저장 된다.
		Member member = null;
		// 클래스 인터페이스 = 뉴  생성자 
		MemberService memberService = new MemberServiceImpl();

		while (true) {
			System.out.println("메뉴:  0.종료    1.회원가입    2.로그인   3.회원목록");
			switch (scan.nextInt()) {
			case 0:
				System.out.println("종료");
				return;
			case 1:
				// 클래스 인스턴스 = 뉴  생성자 
				member = new Member();
				System.out.println("회원가입");
				System.out.println("아이디: ");
				member.setUserid(scan.next());
				System.out.println("비밀번호: ");
				member.setPassword(scan.next());
				// System -> 클래스 변수
				System.out.println("이름: ");	
				// member -> 인스턴스 변수
				member.setName(scan.next());
				System.out.println("*** 회원가입 정보확인 ***");
				System.out.println(member.toString());
				memberService.join(member);
				break;
			case 2:
				System.out.println("로그인");
				break;
			case 3: 
				System.out.println("목록보기");
				Member[] list = memberService.list();
				for(int i = 0; i < 3; i++) {
					System.out.println(list[i].toString());
				}
			default:
				System.out.println("메뉴에 없는 기능입니다.");
				break;
			}

		}
	}
}
