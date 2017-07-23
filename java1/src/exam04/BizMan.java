package exam04;

public class BizMan extends Person { // Person상속 받음
	
	public static void main(String[] args) {
//		Person p = new BizMan(); // 데이터타입이 다르지만 상속을 받았기 때문에 사용할 수 있다.
//		p.doSleep();
//		p.doWakeUp();
//		p.doWork();
//		
//		Person p2 = new Student();
//		p2.doSleep();
//		p2.doWakeUp();
//		p2.doWork(); // Student클래스에서 함수를 재정의하면 일이 아닌 공부한다로 바꿀 수 있다.
		
			Person[] arrP = new Person[2];
			arrP[0] = new BizMan();
			arrP[1] = new Student();
			arrP[0].doWork();
			arrP[1].doWork();
	}

}
