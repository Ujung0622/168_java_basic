package member;

public interface MemberService { 
	
	//setter의 의미
	public void join(Member member); 
	//getter의 의미
	public void login();
	public Member[] list();
	

}
