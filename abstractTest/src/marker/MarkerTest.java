package marker;

public class MarkerTest {
	
//	어떤 동물이 어떤 분류인지 알려주는 메서드
//	1. 초식동물 이라면 초식동물이라고 알려줌
//	2. 육식동물 이라면 육식동물이라고 알려줌
	public void checkKinds(Animal[] animal) { // 업케스팅
		// 매개변수 배열 or 클래스
		
		for(int i = 0; i < animal.length; i++) {
			if(animal[i] instanceof CarnivorMarker) {
				System.out.println("육식동물");
			} else if(animal[i] instanceof HerviboreMarker) {
				System.out.println("초식동물");
			} else {
				System.out.println("잡식동물");
			}
			
		}
		
	}
	
//	메서드 완성 후 각 동물들을 객체화 시킨 후 메서드 확인 출력!
	public static void main(String[] args) {
		Animal[] animal = {new Bear(), new Cat(), new Cow(), new Dog(), new Rabbit(), new Tiger() };		
		
		MarkerTest mt = new MarkerTest();
		mt.checkKinds(animal);
		
	}

}
