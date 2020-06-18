package phone;

import java.util.Scanner;

/**
 * 
 * @author yujungpark622@gmail.com
 * @since 2020.06.18
 * @param kind 종류, company 제조사, call 통화내역
 */
class BelPhone {
	protected String kind, company, call;

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCall() {
		return call;
	}

	public void setCall(String call) {
		this.call = call;
	}

	@Override
	public String toString() {
		return "집전화 [폰종류=" + kind + ", 제조사=" + company + ", 통화내역=" + call + "]";
	}
}

class CelPhone extends BelPhone {
	public final String KIND = "휴대폰";
	protected boolean portable;
	protected String move;

	public boolean isPortable() {
		return portable;
	}

	public void setPortable(boolean portable) {
		move = (portable) ? "이동 중에" : "이동 불가능";
		this.portable = portable;
	}

	public String getMove() {
		return move;
	}

	public void setMove(String move) {
		this.move = move;
	}

	@Override
	public String toString() {
		return String.format("%s 인  %s 제품을 사용해서 %s 라고 통화한다.", KIND, super.company, super.call, move);
	}
}

class Iphone extends CelPhone {
	public final static String KIND = "아이폰";
	protected String search;

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	@Override
	public String toString() {
		return String.format("%s %s을 사용해서 %s중에 %s을 한다.", super.company, KIND, move, search);
	}


}
class GalPhone extends Iphone {
	public final static String KIND = "갤럭시";
	protected String pay;
	
	public String getPay() {
		return pay;
	}
	
	public void setPay(String pay) {
		this.pay = pay;
	}
	@Override
	public String toString() {
		return String.format("%s %s를 사용해서 %s중에 %s을 한다", 
				company, KIND, move, pay);}
}
// [삼성] 갤럭시를 사용해서 [이동]중에 [삼성페이]를 한다

public class Phone {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BelPhone phone = null;
		BelPhone[] arr = new BelPhone[1];
		CelPhone cel = null;
		Iphone iph = null;
		GalPhone gal = null;
		while (true) {
			System.out.println("0.종료  1.전화걸기  2.전화받기  3.휴대폰걸기 4.아이폰 서치 5.삼성페이결제");
			switch (scan.nextInt()) {
			case 0:
				return;
			case 1:
				phone = new BelPhone();
				phone.setKind("집 전화");
				phone.setCompany("금성사");
				phone.setCall("안녕하세요.");
				arr[0] = phone;
				break;
			case 2:
				System.out.println(arr[0].toString());
			case 3:
				cel = new CelPhone();
				cel.setCompany("노키아");
				cel.setPortable(true);
				cel.setCall("이동중에 통화하고 있다.");
				arr[0] = cel;
				break;
			case 4:
				iph = new Iphone();
				iph.setCompany("애플");
				iph.setPortable(true);
				iph.setSearch("뉴스 검색");
				arr[0] = iph;
				break;
			case 5:
				gal = new GalPhone();
				gal.setCompany("삼성");
				gal.setPortable(true);
				gal.setSearch("삼성 페이 결제");
				arr[0] = gal;
				break;
			default:
				break;
			}
		}

	}
}
