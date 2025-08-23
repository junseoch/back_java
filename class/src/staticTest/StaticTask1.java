package staticTest;

class Employee {
//  필드
//  회사의 돈(돈)
//  이름(name), 나이(age), 수익(income)
//  회사원들이 벌어온 수익을 모두 회사의 돈(돈)에 합치고,
//  회사의 돈 출력
	
	static int money;
	String name; 
	int age;
	int income;
	
	// 기본 생성자
	public Employee() {;}
	// 초기화 생성자
	public Employee(String name, int age, int income) {
		this.name = name;
		this.age = age;
		this.income = income;
		money += this.income; // 만들어지면서 static 영역에 누적합
	}
	
	void printComanyMoney() {
		System.out.println(money);
	}
}

public class StaticTask1 {
	public static void main(String[] args) {
		Employee em1 = new Employee("홍길동", 25, 20_000); // 객체화
		Employee em2 = new Employee("장보고", 27, 50_000); 
		Employee em3 = new Employee("김철수", 30, 80_000);
		Employee em4 = new Employee("김영희", 40, 80_000);
		
		em1.printComanyMoney();
		em2.printComanyMoney();
		em3.printComanyMoney();
		
	}
}


