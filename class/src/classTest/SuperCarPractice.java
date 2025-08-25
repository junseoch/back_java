package classTest;

import java.util.Scanner;

public class SuperCarPractice {
//  브랜드
  String brand;
//  색상
  String color;
//  가격
  long price;
//  엔진
  boolean engine;
//  비밀번호
  String password;
//  비밀번호 오류 횟수
  int errorCount;
  
//  스태틱 블록
  	static {
  		System.out.println("출고 축하합니다");
  	}
  	
//  초기화 블록	
  	{
  		this.password = "0000";
  	}
  
  	public SuperCarPractice() {;}
  	
  	// 생성자의 오버로딩
  	public SuperCarPractice(String brand, String color, long price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
  	
	public SuperCarPractice(String brand, String color, long price, String password) {
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.password = password;
	}
  	
	public static void main(String[] args) {
		// 객체화
		SuperCar ferrari = new SuperCar("Ferrari", "Red", 700_000_000);      
		 Scanner sc = new Scanner(System.in);
		 int choice = 0;
		 String password = null;
		 
		 while(true) {
			 
			 
			 
		 }
		  
	}
}



