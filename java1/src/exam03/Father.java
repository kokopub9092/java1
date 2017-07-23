package exam03;

public class Father { // 상속

	int money = 1000;
	String car = "YF소나타";
	String house = "강남 타워팰리스";
	String who = "아빠";

	public void printHouse() { // void 아무것도 넘기지 않는 함수
		System.out.println("아빠 집");
	}

	public void doJob(String who) { // (String who) 인자값, 파라메터 - 데이터 타입을 선언해야한다.
		System.out.println(who + " 일해, 바빠 임마.");
	}

	public void doSleep(String who) {
		System.out.println(who + " 피곤해, 자야돼.");
	}

}
