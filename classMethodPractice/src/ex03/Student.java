package ex03;

import java.util.Random;

public class Student extends Person{
	private int number;
	 	
	public Student() {;}
	// 부모 생성자를 통해서 초기화
	public Student(String name, int age, String job, String hobby) {
		super(name, age, job, hobby);
		this.number = number;
	}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	@Override
	public void printName() {
		System.out.println(this.getName() + "님 환영합니다.");
	}
	
	@Override
	public void printWork() {
		System.out.println(this.getName() + "은 공부를 합니다.");
	}
	
	// 자식만의 +@ 구현
//	public int printHobby(String str, char c) {
//		int count = 0; 
//		for(int i = 0; i < str.length(); i++) {
//			if(str.charAt(i) == c) {
//				count++;
//			}
//			else {
//				continue;
//			}
//		}
//		return count;
//	}
	
	public int printHobby(String str, char c) {
		int count;
		// abcdeaa  bcde
		return str.length() - str.replaceAll(String.valueOf(c), "").length();
	}
	
	public String getRandomNumber() {
		
		Random random = new Random();
		String number = "";
		for(int i = 0; i < 8; i++) {
			number += random.nextInt(0, 10); // 0~9까지 중에서 랜덤 숫자 한 개
		}
		// 필드에 대입 -> setNumber
		this.setNumber(Integer.parseInt(number));
		return number;
	}
	
	// 학생(Student)이 가진 번호를 비교해서 같으면 true, 다르면 false 리턴
	public boolean checkNumber(Student student) {
		return student.getNumber() == this.getNumber();
		       // 가져온 number           내 number
	}
	
	public static void main(String[] args) {
		
	}
	
}
