package memberone;

import java.util.Scanner;
public class MemberAppOne {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Member member = null;
		MemberService memberService = new MemberServiceImpl();
		while (true) {
			System.out.println("메뉴: 0.종료 1.회원가입 2.로그인"
					+ "5.아이디존재 7.회원목록");
			switch (scanner.nextInt()) {
			case 0: System.out.println("종료");return;
			case 1: // 1. 회원가입
				member = new Member();
				System.out.println("회원가입");
				System.out.println("아이디: ");
				member.setUserid(scanner.next());
				System.out.println("비밀번호: ");
				member.setPassword(scanner.next());
				System.out.println("이름: ");
				member.setName(scanner.next());
				memberService.join(member);
				break;
			case 2: // 2. 로그인
				System.out.println("로그인");
				member = new Member();
				System.out.println("아이디: ");
				member.setUserid(scanner.next());
				System.out.println("비밀번호: ");
				member.setPassword(scanner.next());
				String result= memberService.login(member);
				System.out.println(result);
				break;
			case 3: // 3. 회원목록
				System.out.println("목록보기");
				Member[] list= memberService.list();
				for(int i=0;i < 3;i++) {
					System.out.println(list[i].toString());
				}
				break;
			case 4: // 4. 아이디 중복체크
				System.out.println("아이디 체크");
				member = new Member();
				System.out.println("아이디: ");
				member.setUserid(scanner.next());
				result= memberService.existId(member);
				System.out.println(result);
				break;
			case 5: // 5. 비번 수정
				break;
			case 6: // 6. 회원탈퇴
				break;
			case 7: // 7. 아이디검색
				break;
			case 8:	// 8. 이름 검색
				break;
			case 9: // 9. 전체 회원수
				break; 
			default:
				System.out.println("메뉴에 없는 기능입니다.");
				break;
			}
		}

	}
}
class Member {
	private String userid,password, name;
	
	public Member() {
		// TODO Auto-generated constructor stub
	}
	
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserid() {
		return this.userid;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword() {
		return this.password;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	public String toString() {
		return "[아이디: "+userid+", 비번: "+password+", 이름: "+name+"]";
	}

}
interface MemberService {
	// 1. 회원가입
	public void join(Member member);
	// 2. 로그인
	public String login(Member member);
	// 3. 회원목록
	public Member[] list();
	// 4. 아이디 중복체크
	public String existId(Member member);
	// 5. 비번 수정
	public String changePassword(Member member);
	// 6. 회원탈퇴
	public String withdrawal (Member member);
	// 7. 아이디검색
	public String idfind(Member member);
	// 8. 이름 검색
	public String namefind(Member member);
	// 9. 전체 회원수
	public int count();
}
class MemberServiceImpl implements MemberService{
	private Member[] members; 
	private int count;
	
	public MemberServiceImpl() {
		members  = new Member[3];
		count = 0;
	}
	// 1. 회원가입
	@Override
	public void join(Member member) {
		members[count] = member;
		count++;
	}
	
	// 2. 로그인
	@Override
	public String login(Member member) {
		String result = "FAIL";
		for(int i=0;i< count; i++) {
			if(member.getUserid().equals(members[i].getUserid())
					&&
				member.getPassword().equals(members[i].getPassword())) {
				result = "SUCCESS";
				break;
			}
		}
		return result;
	}
	// 3. 회원목록
	@Override
	public Member[] list() {
		return members;
	}
	// 4. 아이디 중복체크
	@Override
	public String existId(Member member) {
		String result = "중복없음";
		for(int i=0; i< count; i++) {
			if(member.getUserid().equals(members[i].getUserid())) {
				result ="중복된 아이디";
			}
		}
		return result;
	}
	// 5. 비번 수정
	@Override
	public String changePassword(Member member) {
		return null;
	}
	// 6. 회원탈퇴
	@Override
	public String withdrawal(Member member) {
		return null;
	}
	// 7. 아이디검색
	@Override
	public String idfind(Member member) {
		return null;
	}
	// 8. 이름 검색
	@Override
	public String namefind(Member member) {
		return null;
	}
	// 9. 전체 회원수
	@Override
	public int count() {
		return 0;
	}
}