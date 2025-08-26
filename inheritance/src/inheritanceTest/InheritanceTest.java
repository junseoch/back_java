package inheritanceTest;

// 부모 클래스
class A {
	String name;
	int data;
	
	public A() {
		System.out.println(this);
		System.out.println("부모 생성자 호출");
		this.name = "A";
		this.data = 10;
	}
	
	void printName() {
		System.out.println(name);
	}
	
	void walk() {
		System.out.println("네 발로 걷기");
	}
}

// 자식 클래스
// A를 상속 받았음
// B는 A의 모든 것을 받음
class B extends A {
	public B() {
		super(); 
		System.out.println(this);
		System.out.println("자식 생성자 호출됨");
	}
	
	void printData() {
		System.out.println(data);
		System.out.println(this.data);
		System.out.println(super.data);
	}
	
	// 오버 라이딩
	@Override
	void walk() {
		System.out.println("두 발로 걷기");
	}
}
 
public class InheritanceTest {
	public static void main(String[] args) {
		B b = new B(); // 자식
		A a = new A(); // 부모
		// b도 a의 메소드를 쓸 수 있음
		b.printName(); // 부모
		b.printData(); // 자식
		b.walk(); 
		a.walk();
		// 부모의 코드는 오버라이딩과 상관없음, 부모는 부모 자신의 객체
	} 
}



