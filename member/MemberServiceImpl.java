package member;

public class MemberServiceImpl implements MemberService {
	private Member[] members;
	// Member[] members = new Member [3] 
	// => 돌아가긴 하지만 쪼개면 공간을 나눠서 주면 필드에서 공유할 수 있게 된다.
	// 클래스 변수로 만들려면 static Member[] members = new Member [3] 
	// 이게 그럼 메인클래스에 떠버려서 보안이 취약.
	private int idx = 0;
	// Ctrl + Space 이렇게 뜬다. 
	// 이것이 생성자.
	
	public MemberServiceImpl() {
		// TODO Auto-generated constructor stub
	members = new Member[3];
	idx = 0;
	}
	@Override
	public void join(Member member) {
		System.out.println("App 에서 넘어온 회원 정보 ");
		System.out.println(member.toString());
		members[idx] = member;
		idx++;
		System.out.println("증가된 인덱스 값: " + idx);
		System.out.println("배열에 저장된 회원정보");
		for (int i = 0; i < members.length; i++) {
			if (members[i] != null) {
				System.out.println(members[i]);
			} else {
				System.out.println("회원 정보가 없어요.");
			}
		}
	}

	@Override
	public void login() {
		// TODO Auto-generated method stub

	}
	@Override
	public Member[] list() {
		// TODO Auto-generated method stub
		return members;
	}

}
