package test;

import java.util.Scanner;

/*
 * RFP
 * Person(id, pass, name) 
 * - Student(ssn:String, score:int) 
 * - Admin(rank: int)
 * 요구사항 (기능정의) 
 * <사용자기능> 
 * 1. 회원가입 
 * 2. 로그인
 * 3. 비번 수정
 * 4. 회원탈퇴
 * 5. 아이디 중복 체크
 * 6. 마이페이지
 * 7. 점수 입력
 * ********** 
 * <관리자기능> 
 * 1. 회원목록 
 * 2. 아이디검색
 * 3. 이름검색 
 * 4. 전체 회원수
 * 5. 성적별 현황
 */
 class Constants {
	 public static final String MAN_MENU = "0.시스템종료 1.학생 2.관리자";
	 public static final String STUDENT_MENU = "0.학생화면종료\n "
	 		+ "1.회원가입\n" +
	 		"  2. 로그인\n" + 
	 		"  3. 비번 수정\n" + 
	 		"  4. 회원탈퇴\n" +
	 		"  5. 아이디 중복 체크\n" +  
	 		"  6. 마이페이지\n" +
	 		"  7. 점수 입력";
	 public static final String ADMIN_MENU = "0.관리자화면종료\n "
	 		+ "1.회원가입\n" +
			"  2. 아이디검색\n" +
	 		"  3. 이름검색 \n" +
	 		"  4. 전체 회원수\n" + 
	 		"  5. 성적별 현황";
	 public static final String PERSON_SPEC = "아이디: %s  비번: %s 이름: %s";
	 public static final String STUDENT_SPEC = "아이디: %s 비번: %s 이름: %s";
	 public static final String ADMIN_SPEC = "관리자 아이디: %s 비번: %s 이름: %s 등급: %s";
	  }
 class Person { 
	protected String id, pass, name;

	public String getId() {return id;}
	public void setId(String id) {this.id = id;}
	public String getPass() {return pass;}
	public void setPass(String pass) {this.pass = pass;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}

	@Override
	public String toString() {
		return String.format("아이디: %s   비번: %s   이름: $s", id, pass, name);
	}
}
 
class Student extends Person {
	private String ssn, gender; private int score;
	 
	public String getSsn() {return ssn;}
	public void setSsn(String ssn) {this.ssn = ssn;}
	public int getScore() {return score;}
	public void setScore(int score) {this.score = score;}
	public String getGender() {return gender;}
	public void setGender(String gender) {this.gender = gender;}
	}
class Admin extends Person {
	private int rank;
	public int getRank() {return rank;}
	public void setRank(int rank) {this.rank = rank;}
		@Override
		public String toString() {
			return String.format("아이디: %s   비번: %s   이름: $s", id, pass, name);
	  }
}
interface PersonService{
	 /** 1.회원가입 */
	public void join();
	 /** 2. 로그인 */
	public void loin();
	 /** 3. 비번 수정 */
	public void changePass();
	 /** 4. 회원탈퇴 */
	public void remove();
	 /** 5. 아이디 중복 체크 */
	public void existId();
	 /** 6. 마이페이지 */
	public void mypage();
	 /** 7. 점수 입력 */
	public void score();
	 /** 1.회원가입 */
	public void studentList();
	 /** 2. 아이디검색 */
	public void idSearch();
	 /** 3. 이름검색 */
	public void nameSearch();
	 /** 4. 전체 회원수 */
	public void countStuent();
	 /** 5. 성적별 현황 */
	public void  gradeRank();
}

class PersonserviceImpl implements PersonService {

	@Override
	public void join() {
		/** 1.회원가입 */}
	@Override
	public void loin() {
		 /** 2. 로그인 */}
	@Override
	public void changePass() {
		 /** 3. 비번 수정 */}
	@Override
	public void remove() {
		 /** 4. 회원탈퇴 */}
	@Override
	public void existId() {
		/** 5. 아이디 중복 체크 */}
	@Override
	public void mypage() {
		/** 6. 마이페이지 */}
	@Override
	public void score() {
		/** 7. 점수 입력 */}
	@Override
	public void studentList() {
		/** 1.회원가입 */}
	@Override
	public void idSearch() {
		/** 2. 아이디검색 */}
	@Override
	public void nameSearch() {
		/** 3. 이름검색 */}
	@Override
	public void countStuent() {
		/** 4. 전체 회원수 */}
	@Override
	public void gradeRank() {
		/** 5. 성적별 현황 */}		
}
public class PersonApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println(Constants.MAN_MENU);
			switch(scan.nextInt()) {
			case 0: return;
			case 1: student(scan); break;
			case 2: admin(scan); break;
			default: System.out.println("1.학생 2.관리자 선택바랍니다."); break;
			}	
		}
	}	
	public static void admin (Scanner scan) {
		System.out.println(Constants.ADMIN_MENU);
		switch (scan.nextInt()) {
		case 0: return;
		case 1: break;
		case 2: break;
		case 3: break;
		case 4: break;
		case 5: break;
		default: break;
		}
	}	
	public static void student(Scanner scan){
		System.out.println(Constants.STUDENT_MENU);
		switch(scan.nextInt()) {
		case 0: return;
		case 1: break;
		case 2: break;
		case 3: break;
		case 4: break;
		case 5: break;
		case 6: break;
		case 7: break;
		default: break;
		}
	}

	
}



