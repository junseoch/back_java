package classTask;

import java.util.Scanner;

// 국어, 영어, 수학 점수 입력하면 
// 총점, 평균 구하기

class Student3 {
	
	int korean;
	int english;
	int math;
	
	public Student3() {;}

	public Student3(int korean, int english, int math) {
		this.korean = korean;
		this.english = english;
		this.math = math;
	}
	
	void printTotalPoint(int input1, int input2, int input3) { // 총점구하는 메서드
		int total = input1 + input2 + input3;
		System.out.println(total);
	}
	
	void printAverage(){ // 평균 구하는 메서드
		double average = 0.0;
	}
}

public class ClassTask1Practice {
	public static void main(String[] args) {
		Student3 st1 = new Student3();
		Student3 st2 = new Student3();
		Student3 st3 = new Student3();
		
		Scanner sc = new Scanner(System.in);
		int input1 = sc.nextInt();
		int input2 = sc.nextInt();
		int input3 = sc.nextInt();
		
//		System.out.println(st1.sumTotalPoint(input1, input2, input3));
		
	}
}
