package exam05;

public class StringExam {
	
	String str = "123";
	

	public static void main(String[] args) {
		StringExam se = new StringExam();
		String str2 = "123";
		String str3 = new String("123"); //메모리를 따로 만들어준다. 값은 똑같지만 만드는 위치가 다르다. 값을 비교하려면 equals를 사용한다.
		String str4 = "123";
		
		System.out.println(se.str == str2);
		System.out.println(se.str == str3);
		System.out.println(se.str == str4);
		System.out.println(str2 == str4);
	} 

}
