package exam03;

public class ConExam { // 소문자로 시작하지 않은 ConExam 이것은 생성자라고 부른다.
	
	int age = 30;
	String name = "홍길동";
	
	// age의 값이 20보다 작다면 => 10대라고 출력
	// age의 값이 30보다 작다면 => 20대라고 출력
	// age의 값이 40보다 작다면 => 30대라고 출력
	// age의 값이 50보다 작다면 => 40대라고 출력
	// age의 값이 60보다 작다면 => 50대라고 출력
	// age의 값이 60이상이라면 => 우대권 받아가세요 라고 출력
	
	public ConExam(int age, String name) {
		this.age = age;
		this.name = name;
		if(age<20) {
			System.out.println("10대");
		} else if (age<30) {
			System.out.println("20대");
		} else if (age<40) {
			System.out.println("30대");
		} else if (age<50) {
			System.out.println("40대");
		} else if (age<60) {
			System.out.println("50대");
		} else if (age>=60) {
			System.out.println("우대권 받아가세요");
		}
		System.out.println(age);
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		ConExam ce = new ConExam(20, "김길동");  // 생성자 호출
		ConExam ce1 = new ConExam(30, "고길동");
	} 
}
