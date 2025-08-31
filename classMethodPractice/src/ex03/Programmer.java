package ex03;

public class Programmer extends Person{
	
	private boolean notebook;
	private String[] languages;
	
	{
		this.languages = new String[5];
	}
	
	
	public Programmer() {;}
	
	public Programmer(boolean notebook, String[] languages) {
		this.notebook = notebook;
		this.languages = languages;
	}
	
	public boolean isNotebook() {
		return notebook;
	}

	public void setNotebook(boolean notebook) {
		this.notebook = notebook;
	}

	public String[] getLanguages() {
		return languages;
	}
	public void setLanguages(String[] languages) {
		this.languages = languages;
	}
	
	
	public void registerLanguages(String[] languages) { // 받은 languages
		int count = 0;
		for(int i = 0; i < languages.length; i++) {
//			객체 필드의 배열을 가져온다.
			String[] myLanguages = this.getLanguages(); // 내 languages
			String language = languages[i];
//			사용자에게 받은 값이 null이면 continue
			if(language == null) {
				continue;
			}
			
//			반복을 돌 때 중복값을 확인하기 위해서 check 상태를 둔다.
			boolean check = false;
//			반복을 모두 돌아서, 내가 가지고 있는 문자열 배열의 값과, 전달받은 문자열 배열의 값 중
//			중복되는 값이 있는지 체크하고, 있다면 true 후 탈출
//			내가 가지고 있는 배열의 개수만큼만 반복을 돌도록 count를 사용한다.
//			5번씩 돌지 않도록 한다. 즉 값이 2개라면 2번만 현재 문자열과 내가가진 문자열을 비교한다.
			for(int j = 0; j < count; j++) {
				if(myLanguages[j].equals(language)) {
					check = true;
					break;
				}
			}
			
//			중복이 없고, 5개 미만으로 추가할 수 있다면
			if(!check && count < 5) {
//				내가 지금 추가하려는 글자를 빈 자리에 추가한다.
				myLanguages[count] = language;
//				다음 방번호로 넘어가서 다음 반복을 진행한다.
				count++;
			}
		}
	}
	
	// 자신이 가진 언어들을 모두 출력해서 보여주는 메서드
	public void showLanguages() {
		String[] myLanguages = this.getLanguages();
		for(String language : myLanguages) {
			System.out.println(language);
		}
	}
	
	// (찾을 값 , 변경할 값)
	// 찾은 위치에 변경할 값을 집어넣어 수정해주는 메서드
	// 변경이 성공했다면 true, 실패했다면 false로 리턴
	// 자신아 가진 showLanguages 호출
	public boolean changeLanguage(String findStr, String changeStr) {
		String[] myLanguages = this.getLanguages();
		boolean condition = false;
		for(int i = 0; i < myLanguages.length; i++) {
			if(myLanguages[i].equals(findStr)){
				myLanguages[i] = changeStr;
				condition = true;
				break;
			}
		}	
		return condition;
	}
	
	public static void main(String[] args) {
		Programmer programmer = new Programmer();
		// 문자열 배열을 만듦
		programmer.registerLanguages(new String[] {"a", "b", "c", "d"});
	}
	
}
