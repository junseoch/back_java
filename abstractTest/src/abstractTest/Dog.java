package abstractTest;

public class Dog implements Pet, Animal{
	
	// 이 오버라이드 된 메서드들이 없으면 강제성이 있음
	// 이 오버라이드 된 메서드들이 있으면 강제성이 없음
	
	// 재정의 -> 강제성을 부여 
	// Pet은 강제성이 있음
	@Override
	public void poop() {
		System.out.println("패드 위에");
	}
	
	@Override
	public void sitDown() {
		System.out.println("강아지 앉아");
	}
	
	@Override
	public void waitNow() {
		System.out.println("강 기다려");
	}
	
		
}
