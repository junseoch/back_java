package exceptTest;

public class ExceptTest {
	public static void main(String[] args) {
		
//		alt + shift + z
//		Exception이 모든 에러의 부모이다
		
		try {
			int[] arData = new int[5];
			arData[5] = 10;
			
		} catch (Exception e) {
//			가다가 마지막에 잡아야 함
			System.out.println("알 수 없는 오류가 발생!");
			e.printStackTrace();
		} 
		
		
		
	}
}
