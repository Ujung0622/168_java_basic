package member;

public class Member {
	private String userid, password, name;
	

	
	public void setUserid (String userid) {
		this.userid = userid;
	}
	public String getUserid ( ) {
		return this.userid;
	}
	public void setPassword (String password) {
		this.password = password;		
	}
	public String getPassword () {
		return this.password;
	}
	public void setName (String userid) {
		 this.name = userid;
	}
	public String getName () {
		return this.name;
	}
	public String toString() {
		return "[아이디: "+userid+", 비번: "+password+", 이름: "+name+ "]";
	}
}
