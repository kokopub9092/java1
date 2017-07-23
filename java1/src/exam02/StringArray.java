package exam02;

public class StringArray {

	public static void main(String[] args) {
		String[] arrStr = new String[5]; // 정해져있지 않은 데이터 타입은 null이라는 값이 들어간다.
		arrStr[0] = "a";
		for (int i = 0; i < arrStr.length; i++) {
			arrStr[i] = i + 1 + ""; // null 과 빈문자열은 다르다. 숫자 + 문자 = 문자
		}

		for (int i = 0; i < arrStr.length; i++) {
			System.out.println(arrStr[i]); // 출력하는 반복문
		}

	}

}
