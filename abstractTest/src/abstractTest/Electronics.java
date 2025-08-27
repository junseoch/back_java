package abstractTest;

public abstract class Electronics {
	// 클래스 안에 있음 -> 메소드 선언!!
    // 추상 메서드
	// 있을 것 같아라고 만든 것
	public abstract void safe(); 
	// 일반 메서드
	public void on() {
		System.out.println("전원 킴");
	}
}
