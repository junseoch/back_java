package inheritanceTask;

// 클래스 파일 따로 만들기

// 누가 부모고 누가 자식인가
// 부모는 하나!
// 부모부터 만들고 자식을 정의해야함
// 초기화, 객체화

// personTask가 부모

//PersonTask
//이름, 나이, 주소, 핸드폰
//각 메서드 출력
//work 일을 한다 
//sleep 잠을 잔다
//eat 세 끼를 먹는다

//StudentTask
//인스타아이디
//각 메서드 출력
//work 아르바이트를 한다
//sleep 수업 시간에 잠을 잔다
//eat 아침을 거른다

//EmployeeTask
//비상금
//각 메서드 출력
//work 하루 종일 일을 한다
//sleep 잠을 설친다
//eat 야식을 먹는다

//InhertanceTask에서
//사람, 학생, 직장인 객체화 후 각 메서드 출력하기
public class InheritanceTask2 {
	public static void main(String[] args) {
		PersonTask pt = new PersonTask();
		StudentTask st = new StudentTask();
		EmployeeTask et = new EmployeeTask();
		
		pt.eat();
		st.eat();
		et.eat();
		
	}
}
