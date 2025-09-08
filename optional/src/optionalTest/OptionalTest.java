package optionalTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class OptionalTest {

	ArrayList<User> users = new ArrayList<User>(Arrays.asList(
			new User("최준서", "cjs", "1234"),
			new User("홍길동", "hgd", "1234"),
			new User("이순신", "lss", "1234"),
			new User("장보고", "jbg", "1234")
			));
	
//	if문에 한 번이라도 들어가지 않았다면 null이 리턴
//	NPE 발생
//	🎯강조 : 반드시 리턴 타입에만 Optional을 사용하고, 단일 객체만 감싼다.
//	나쁜 예시 Optional
	public Optional<User> findById(Long id) {
		User user = null;
		for(User userInDb: users) {
			if(userInDb.getId() == id) {
				user = userInDb;
			}
		}
		return Optional.ofNullable(user);
	}
	
	public static void main(String[] args) {
		OptionalTest optionalTest = new OptionalTest();
		
		Optional<User> foundUser = optionalTest.findById(2L);
		
		// 유저가 없으면 throw로 에러를 날리겠다
		// 유저가 있으면 그냥 유저를 주겠다
		
		
		// 실무에서 가장 많이 쓰이는 null 처리
		// user가 null이 아니면 통째로가 user
		// null이면 throw
		
//		User user = foundUser.orElseThrow(() -> {
//			throw new NoSearchException("유저를 찾을 수 없습니다");
//		});
		
//		User user = foundUser.orElseThrow(() -> {
//			throw new NoSearchException("유저를 찾을 수 없습니다");
//		});
		
		User user;
		try {
			user = foundUser.orElseThrow(() -> {
				throw new NoSearchException("유저를 찾을 수 없습니다");
			});
		} catch (NoSearchException e) {
			System.out.println("유저를 찾을 수 없습니다");
		}
		
//		boolean
		foundUser.map(User::getId).isPresent();
		
		// ifPresent() : 값이 있을 때만 해당 로직을 수행
		// 값이 없을 때는 아무것도 안 함 값이 있으면 그 내부 로직을 실행
		optionalTest.findById(100L).map(User::getUserEmail).ifPresent(System.out::print);
		
		// 값이 있을 때 앞에 거 리턴(값이 있어야함) , 값이 없을 때는 뒤에꺼
		optionalTest.findById(100L)
		.map(User::getUserEmail)
		.ifPresentOrElse((email) -> {System.out.println(email);}   , () -> {
			System.out.println("존재하지 않는 유저입니다");
		});
		
	}
}
