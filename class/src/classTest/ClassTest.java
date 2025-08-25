package classTest;

public class ClassTest { // 이미 추상화를 끝낸 것
	
	// 필드, 필드 변수, 멤버, 멤버 변수
	String name;
	int age;
	
//  기본 생성자 // 리턴하면 안 됨 // 이 클래스를 메모리에 할당하는 기능이기 때문에
  public ClassTest() {;}
  
//  초기화 생성자
  public ClassTest(String name, int age) {
//	  this : 자기 자신의 주소값
     this.name = name; 
     this.age = age;  
  }
	
//	public static void main(String[] args) {
//		ClassTest ct = new ClassTest("홍길동",20); // 객체화
//						// new ClassTest("홍길동",20) : 생성자 -> ClassTest의 주소값을 가져오는 역할을 함 -> return 쓰면 안 됨
	
//     객체화
//     여기서 ct1은 객체
 	   public static void main(String[] args) {
		      ClassTest ct1 = new ClassTest("홍길동", 20); 
		      					// ClassTest : 메모리에 값을 올리는 작업
		      ClassTest ct2 = new ClassTest("김길동", 20);
		      ClassTest ct3 = new ClassTest();
		      System.out.println(ct1.name);
		      System.out.println(ct2.name);
	}  
}


