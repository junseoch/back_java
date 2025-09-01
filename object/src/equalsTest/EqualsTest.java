package equalsTest;

public class EqualsTest {

	public static void main(String[] args) {
		String data1 = "abcd";
		String data2 = "abcd";
		String data3 = new String("abcd"); // 개발자가 heap 영역에 올린 것
		String data4 = new String("abcd");
		
		System.out.println(data1 == data2);
		System.out.println(data1 == data3);
		System.out.println(data2 == data4);
		
	}
	
}
