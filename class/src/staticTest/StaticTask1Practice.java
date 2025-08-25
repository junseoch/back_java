package staticTest;


class Employee2{
// 필드
// 회사의 돈(money)에 누적 추가
// 이름 , 나이, 수익(income)
// 회사원들의 벌어온 수익을 모두 회사의 돈에 합침(money)
// 회사의 돈 출력

	static int money;
	String name;
	int age;
	int income;
	
	public Employee2() {;}
	// 각각의 필드를 초기화 해야함
	public Employee2(String name, int age, int income) {
		this.name = name;
		this.age = age;
		this.income = income;
		money += this.income;
	}

	void printCompnayMoney() {
		System.out.println(money);
	}
}

public class StaticTask1Practice {
	public static void main(String[] args) {
						// Employee("홍길동", 20, 10000) 이건 생성자
						// -> 클래스가 메모리에 할당되고(new)
						// -> 생긴 주소를 리턴해서 들고옴(생성자)
		Employee employee1 = new Employee("홍길동", 20, 10_000);
		Employee employee2 = new Employee("김철수", 20, 40_000);
		Employee employee3 = new Employee("김영희", 20, -10_000);
		Employee employee4 = new Employee("최우식", 20, -20_000);
		
//		Employee.money  = employee1.income + employee2.income + employee3.income+ employee4.income ; 
		employee1.printComanyMoney();   // employee1에 print메서드 실행
		employee2.printComanyMoney();
		employee3.printComanyMoney();  // 어떤 객체에 접근하더라도 같은 값 출력
		// 같은 클래스들끼리 공용 변수를 씀
		
	}
}
