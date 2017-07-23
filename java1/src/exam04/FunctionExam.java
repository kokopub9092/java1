package exam04;

public class FunctionExam {
	
	public void printStr1(String str) {
		System.out.println(str);
	}
	
	protected void printStr2(String str) {
		System.out.println(str);
	}
	
	void printStr3(String str) {
		System.out.println(str);
		printStr4(str); // this.생략되어있음
	}
	
	private void printStr4(String str) {
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		
	}

}
