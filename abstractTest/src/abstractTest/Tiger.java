package abstractTest;

// pet에서 넘겨준 걸 실제로 만들어!
// implements : 구현하다
public class Tiger extends PetAdapter{
	
	// PetAdapter가 가져다준 메서드를 가지고 있음
	
	// 재정의해서 부족한 게 없어짐
	@Override
	public void poop() {
		System.out.println("배변 훈련 완료");
	}
	
}
