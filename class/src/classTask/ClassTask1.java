package classTask;

import java.util.Scanner;

// 학생 클래스
//학생이 국어점수, 영어점수, 수학점수를 입력하면
//총점과 평균을 확인해서 출력

class Student {
	
	int korean;
	int english;
	int math;
	
	public Student() {;}

	public Student(int korean, int english, int math) {
		this.korean = korean;
		this.english = english;
		this.math = math;
	}

	// 스태틱 블록
	static {
		System.out.println("점수를 입력하세요\nex)국어, 영어, 수학");
	}
	
	void sum() {
		System.out.println(this.korean + this.english + this.math);
	}
	
	void average() {
		System.out.println((this.korean + this.english + this.math) / 3);
	}
}

public class ClassTask1 {
	 public static void main(String[] args) {
		
//		 Student st2 = new Student(90, 92, 76);
//		 Student st3 = new Student(87, 92, 96);
		 int input1 = 0, input2 = 0, input3 = 0;
		 
		 Student st1 = new Student(input1, input2, input3);
		 Scanner sc = new Scanner(System.in);
		 input1 = sc.nextInt();
		 input2 = sc.nextInt();
		 input3 = sc.nextInt();
		 
		 st1.korean = input1;
		 st1.english = input2;
		 st1.math = input3;
		
		 
		 
		 st1.sum();
		 st1.average();
	}
}

