package ex02;

// 배열을 이용하여 다음과 같이 출력

// 배열 행 길이 : 3
// 배열 열 길이 : 4

// 1 2 3 4
// 5 6 7 8 
// 9 10 11 12


public class TwoArray {
	// 필드가 없으니 기본 생성자만
	public TwoArray() {;}
	
	public static void main(String[] args) {
		
		// 방법 1
		int[] arrData = new int[12];
		
		// for -> 1부터 12까지
		System.out.println("배열 행 길이 : 3");
		System.out.println("배열 열 길이 : 4");
		
		for(int i = 0; i < arrData.length; i++) {
			System.out.printf("%d ",arrData[i] = i + 1);
			if((i + 1) % 4 == 0) {
				System.out.println("");
			} 
		}
		
	}
}
