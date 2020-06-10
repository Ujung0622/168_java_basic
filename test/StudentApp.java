package test;

import java.util.Scanner;

public class StudentApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Student[] students = new Student[2];
		int i;
		
		for (i = 0; i < students.length; i++) {
			Student student = new Student();
			System.out.println("이름: ");
			student.setName(scan.next());
			System.out.println("국어: ");
			student.setKor(scan.nextInt());
			System.out.println("영어: ");
			student.setEng(scan.nextInt());
			System.out.println("수학: ");
			student.setMath(scan.nextInt());
			student.sum();
			student.avg();
			
			students[i] = student;
		}
		
		for (i = 0; i < students.length; i++) {
			students[i].printStates();
		}					
	}	
}