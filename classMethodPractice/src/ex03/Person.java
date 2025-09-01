package ex03;

public class Person {
	private String name;
	private int age;
	private String job;
	private String hobby;
	
	public Person() {;}
	public Person(String name, int age, String job, String hobby) {
		this.name = name;
		this.age = age;
		this.job = job;
		this.hobby = hobby;
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

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	// 해당 객체 필드의 이름 출력
	public void printName() {
		System.out.println(this.getName());
	}
	
	// 해당 객체 필드의 직업 출력
	public void printWork() {
		System.out.println(this.getJob());
	}
	 
	public void printHobby() {
		System.out.println("취미는 잠자기 입니다.");
	}
	
	
}
