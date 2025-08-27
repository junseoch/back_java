package castingTask3;

public class Drama extends Video{
	
	public Drama() {;}
	public Drama(String name, int time) {
		super(name, time);
	}
	
	public void sellGoods() {
		super.setTime(10000);
		System.out.println(super.getTime() + "분 남음");
	}

	    
	
}
