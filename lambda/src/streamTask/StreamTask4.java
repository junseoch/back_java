package streamTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collector;
import java.util.stream.Collectors;

// 클래스를 이용
public class StreamTask4 {
	
	public static void main(String[] args) {
		
		ArrayList<Member> members = new ArrayList<Member>();
	      
	      Member member1 = new Member("홍길동", "축구_농구_야구", "나는 축구왕!");
	      Member member2 = new Member("이순신", "개발_당구_축구", "나는 개발자 좋아!");
	      Member member3 = new Member("장보고", "피아노", "피아노만 한 우물!");
	      Member member4 = new Member("김철수", "스포츠댄스_개발", "취미로 춤을 춘다 ~");
	      Member member5 = new Member("김영희", "골프_야구", "운동 선수는 나의 꿈");
	      Member member6 = new Member("흰둥이", "개발_축구_농구", "개발도 운동도 다 잘해요!");
	      Member member7 = new Member("배승원", "개발_놀기", "자바가 제일 쉬웠어요^^");
	      
	      Member[] memberArray = new Member[] {member1, member2, member3, member4, member5, member6, member7};
	      
	      for(Member member : memberArray) {
	    	  members.add(member);
	      }
	      
//	      members.add(member1);
//	      members.add(member2);
//	      members.add(member3);
//	      members.add(member4);
//	      members.add(member5);
//	      members.add(member6);
//	      members.add(member7);
	      
	      // 일반 값으로 배열을 넘기고 싶을 때
	      // 초기값을 추가하고 싶을 때
//	      members.addAll(Arrays.asList(memberArray));
	      
//	      1) 각 Member의 취미를 검토하시오.
//	      취미 중 개발을 좋아하는 취미를 가진 멤버의 데이터를 모두 출력
	      
	      members.stream().filter((n)-> n.getHobby().contains("개발")).forEach(System.out::print);
	      
//		  2) 개발자 000(이름)으로 변경 후 출력
	      
//	      members.stream()
//	      	.filter((user)-> user.getHobby().contains("개발"))
//	      	.filter((user) -> user.getName()).map((user -> "개발자" + user ));
	      
	      
//	      members.stream().map((user -> "개발자" + user.getName() )).forEach( (user) -> System.out.println(user));
	      
//	      3) 취미를 3개 이상 가진 사람의 id 출력
	      
	      // string을 배열로 바꿈
	      members.stream().filter((user) -> user.getHobby().split("_").length >= 3)
	      					.forEach(user -> System.out.println(user));
	      
//	      4) 취미를 3개 이상 가진 사람의 id를 ArrayList로 변경하고 hobbyIds 변수에 담기
	      
	      ArrayList<Long> hobbyIds = 
	    		  members.stream().filter((user) -> user.getHobby().split("_").length >= 3)
	    		  .map((user) -> user.getId())
	    		  .collect(Collectors.toCollection(ArrayList::new));
	      			
	      System.out.println(members);
	      System.out.println(hobbyIds);
	      
//	      5) hobbyIds에 존재하는 id와 같은 id를 가진 members의 데이터 소개를 출력하기
	      // 0,1,5번 사용자의 소개 
	      // members에서 반복
	      
	      // members의 id, hobbyIds의 id 비교
	      // 같다면 members의 introduce의 
	      // 같은 조건만 비교해서 그 조건만 있는 배열로 리턴
	      
	      // 일단 hobbyIds의 id를 가져와야 함
	      // hobbyIds의 id는 Long타입 ArrayList 
	      
	      
	      // Long -> int , int -> Integer
//	      hobbyIds
//	      .stream()
//	      .mapToInt(Long::intValue)
//	      .boxed().map(i -> members.get(i)).map(null);
	      
	      
//	      hobbyIds.stream().map((i) -> {members.stream().filter((m) -> m.getId()) ;
//	      });
	      
//	      6. 소개를 가장 길게 쓴 사용자의 정보를 문자열로 출력
//	      예시) 이름 : 흰둥이 소개 : 개발_축구  취미 : 개발도 운동도 잘해요!
	      
//	      소개글이 가장 긴 걸 찾고 그 사용자를 찾아야 함
	      
//	      introduce를 반복하면서 .length
//	      반복하면서 max > introduce.length ->  소개글이 가장 긴 것 : max
//	      소개글이 가장 긴 introduce의 id를 가져와서 그 id의 member의 모든 정보 출력
	      // 반복하면서 max < n  : n이 가장 큰 수
	      
	      // n
	      // max 
	      
//	      int max;
//		members.stream().map((n) -> n.getIntroduce().length())
//	      .map((n) -> n > );
	    
//	      members.stream().reduce((a, b) -> a.getIntroduce() > b.getIntroduce() ? );
	      

//	      최대 길이
	      
//		members.stream().reduce();
//		members.stream().max(n);
	      
	    
//	    7. 
	      
	      
	      
	}
}


