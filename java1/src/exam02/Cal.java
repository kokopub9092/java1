package exam02;

public class Cal {

	int num1; // 변수명이 같은 것을 선언할 수 없다.
	int num2;
	String op;

	public void printCal() {
		int num1 = 2; // 위에서 선언한 변수명을 아래에서도 선언할 수 있다.
		
		if (op.equals("+")) {
			System.out.println(num1+num2);
		} else if (op.equals("-")) {
			System.out.println(num1-num2);
		} else if (op.equals("/")) {
			System.out.println(num1/num2);
		} else {
			System.out.println(num1*num2);

		}
	}

	public static void main(String[] args) {
		Cal c = new Cal();  //생성자 호출
		c.num1 = 10;
		c.num2 = 2;
		c.op = "+";
		c.printCal();
		c.op = "-";
		c.printCal();
		c.num2 = 5;
		c.printCal();
		
	}

}
