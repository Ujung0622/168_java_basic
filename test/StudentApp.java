package test;

import java.util.Scanner;

public class StudentApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Student[] students = new Student[2];
		int i;
		
		for (i = 0; i < students.length; i++) {
			Student student = new Student();
			System.out.println("�̸�: ");
			student.setName(scan.next());
			System.out.println("����: ");
			student.setKor(scan.nextInt());
			System.out.println("����: ");
			student.setEng(scan.nextInt());
			System.out.println("����: ");
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