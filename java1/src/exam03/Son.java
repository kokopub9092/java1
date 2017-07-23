package exam03;

public class Son extends Father {
	String house = "신림 고시원";
	
	public Son() {
		
	}
	
	public void printHouse() { // 함수의 재정의, 오버라이딩 - 함수명이 같아야함. (상속을 받았을때만 가능하다.), 덮어쓰기
		System.out.println(house);
	}
	
	public static void main(String[] args) {
		Son s = new Son(); // Son클래스로 s라는 변수명을 사용하겠다는 선언을 한 것이다.
		System.out.println(s.money);
		System.out.println(s.car);
		System.out.println(s.house); // 똑같은 변수명을 선언해주면 자기 자신의 것을 나타낸다.
		s.printHouse();
		s.doJob("아빠");
		s.who = "나";
		s.doSleep("나");
		
	}

}
