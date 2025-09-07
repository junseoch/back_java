package streamTask;

import java.util.Objects;

// 필드 구성 : 이름, 취미, 소개
// 1. 필드 구성
// 2. private 붙이기
// 3. 기본 생성자, 초기화 생성자
// 4. getter, setter
// 5. toString 재정의
// 6. HashCode, Equals 재정의

public class Member {
	private Long id;
	private String name;
	private String hobby;
	private String introduction;
	private static Long seq;
	
//	최초 1번
	static {
		seq = 0L;
	}
	
//	생성자가 호출될 때 마다
	{
		this.id = seq++;
	}
	
	public Member() {;}
	public Member(String name, String hobby, String introduction) {
		this.name = name;
		this.hobby = hobby;
		this.introduction = introduction;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", hobby=" + hobby + ", introduction=" + introduction + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return Objects.equals(id, other.id);
	}
}












