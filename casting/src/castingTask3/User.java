package castingTask3;

public class User {
	String name;
	int time;
	int price;
	
	public User() {;}
	
	public User(String name, int time, int price) {
		this.name = name;
		this.time = time;
		this.price = price;
	}

	// instanceof
	void show(Netflix contents) { // 자식들을 부모로 : 업 케스팅
		
		if(contents instanceof Movie) {
			// 부모 -> 자식 : 다운 케스팅
			Movie movie = (Movie)contents;
			movie.upgrade();
		}
		else if(contents instanceof Animation) {
			Animation ani = (Animation)contents;
			ani.comments();
		}
		else if(contents instanceof Drama) {
			Drama drama = (Drama)contents;
			drama.goods();
		}
		
	}
	
	
}
