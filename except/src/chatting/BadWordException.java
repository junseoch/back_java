package chatting;

// 상속받으면 예외가 됨

// Exception : 컴파일러가 검사한다. try ~ catch를 강제한다
// 강제 종료가 된다.

// RuntimeException : 컴파일러가 검사하지 않는다. 즉 강제종료가 되지 않는다
public class BadWordException extends RuntimeException{
	public BadWordException() {;}
	public BadWordException(String message) { // 메세지 받아서 부모에 넘김
		super(message);
	}
}
