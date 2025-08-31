package ex03;

public class PersonMain {

	public static void main(String[] args) {
		// Student, Programmer를 업케스팅
		Person person1 = new Student();
		Person person2 = new Programmer();
		
		// 다운케스팅
		// 업케스팅 된 객체를 형변환해서 자식객체로 만듦
		Student student = (Student)person1;
		student.getRandomNumber();
		student.printHobby("abced", 'c');
		
		Programmer programmer = (Programmer)person2;
		programmer.registerLanguages(new String[] {"JAVA", "C", "Python", "JS", "JQuery"});
		programmer.showLanguages();
		programmer.changeLanguage("c", "f"); 
	}
	
}
