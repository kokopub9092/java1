package exam04;

public class OverLoading { // 파라메터 이름이 달라도 다른 함수, 이름이 없어도 다른 함수
	// 오버로딩 함수 명이 같아야 한다.
	// 같은 함수 명으로 여러개를 만들 수 있다.
	// 파라메터 개수가 같아야 한다.
	// 파라메터 위치(순서)가 달라야 한다. (int a, String b 과 String b, int a은 다름)
	// 파라메터 변수가 다르다고 해서 다른게 아니다. (String b, int a 과 String str, int num은 같음)
	// 이름을 똑같이 하고 다른 기능을 수행할 수 있다. 단, 데이터 타입을 다르게 해야한다.
	
	public void over(int a, String b) { // 리턴이 없는 애 (아무것도 넘기지 않음)
		System.out.println("오버함수를 호출했네요~");
	}
	
	public void over(String b, int a) {
		System.out.println("두번째 오버함수를 호출했네요~");
	}
	
	public String over(String str) { //리턴이 있는 애
		System.out.println("세번째 오버함수를 호출했네요~");
		System.out.println(1);
		System.out.println('a');
		System.out.println(true);
		System.out.println(0.075);
		return "str";
	}

}
