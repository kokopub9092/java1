package exam04;

public class ClassExam {
	// 오버로딩이 된다는건 내가 원하는 생성자를 몇개나 만들 수 있다.
	
	int num;
	String str;
	
	ClassExam(){
		System.out.println("기본 생성자 호출");
	}
	
	ClassExam(String str){
		System.out.println("스트링 파라메터 생성자 호출");
	}
	
	ClassExam(int str){
		System.out.println("스트링 파라메터 생성자 호출");
	}
	
	ClassExam(boolean str){
		System.out.println("스트링 파라메터 생성자 호출");
	}
	
	ClassExam(FunctionExam str){
		System.out.println("스트링 파라메터 생성자 호출");
	}
	
	public void printStr(String str) {
		System.out.println(str);
	}
	
	public String getStr() {
		String str = "adsf";
		return str;
	}
	
	public static void main(String[] args) {
		ClassExam ce = new ClassExam();
	} 
}
