package formatTest;

public class FormatTest {
	
//	서식 문자(format)
//	   반드시 따옴표 안에서 작성한다.
//	   
//	   %d : decimal(10진수 정수)
//	   %o : octal(8진수 정수)
//	   %x : hexadecimal(16진수 정수)
//	   %f : float(실수)
//	   %c : character(문자)
//	   %s : string(문자열)
	
	public static void main(String[] args) {

		String name = "최준서";
		int age = 25;
		double height = 179.1;
		
		System.out.printf("저의 이름은 %s이고 나이는 %d, 키는 %.2fcm", name, age, height);
		
		
	}
}
