package equalsTest;

import java.util.Objects;

public class Student {
	
	private int id;
	private String name;
	private int age;
	
	public Student() {;}

	public Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
	// hashCode : JVM이 관리하는 주소값
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
	// 단축키 : Alt + Shift + S + h
	// id 비교만 필요하기 때문에 id만 체크 
	// DB에서온 데이터
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return id == other.id;
	}
	
	
	public static void main(String[] args) {
		Student student = new Student(1, "홍길동", 20);
		// 도서관
		// 클래스의 equals는 내가 재정의하지 않으면 내가 선언한 적이 없으니 부모(object)에게 받는다
		// object에서는 주소를 비교
		if(student.equals(new Student(1, "홍길동", 20))) {
			System.out.println("책 대여 완료");
		} else {
			System.out.println("도난 신고");
		}
	}

	
}
