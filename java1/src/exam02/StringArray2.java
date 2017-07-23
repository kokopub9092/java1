package exam02;

public class StringArray2 {
	int num;
	public void printStr() {
		System.out.println("함수 : printStr을 호출하셨네요");
	}

	public static void main(String[] args) {
		StringArray2 st2 = new StringArray2();  //데이터 타입 생성 --> 변수 생성
		st2.num = 3;
		System.out.println(st2.num);
		st2.printStr();
	}

}
