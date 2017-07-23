package exam04;

public class Person {
	
	String personName;
	int personAge;
	
	public void doSleep() {
		System.out.println("잠을 잡니다.");
	}
	
	public void doWakeUp() {
		System.out.println("일어납니다.");
	}
	
	public void doWork() { // 오버라이딩은 상속 받았을때에만 사용 가능하다.
		System.out.println("일을 합니다.");
	}
	
}
