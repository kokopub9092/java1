package exam01;

public class Exam07 {

	public static void main(String[] args) {
		// int num = 1;
		// System.out.println(num);
		// num = num +1;
		// System.out.println(num);
		// num++; // ++은 자기 자신에 1을 더한다는 의미
		// System.out.println(num);
		// num +=1; // +=는 +=옆에 있는 숫자만큼 더해준다
		// System.out.println(num);

		// System.out.println(4%2); // mode 연산자 --> 나머지 연산자 <%>
		// for (int i=0; i<10; i++) { // 1씩 증가
		// // 변수를 사용하려면 int와 같은 타입을 선언해준다.
		// // i=0; 초기화
		//
		// if(i%2==0 && i!=0) {
		// System.out.println(i);
		// }
		// }

		for (int i = 0; i < 10; i++) { // if와 else if
			if (i != 0) { // 공통묶이
				if (i % 3 == 0) {
					System.out.println("3의 배수:" + i);
				}
				if (i % 2 == 0) {
					System.out.println("2의 배수:" + i);
				}
			}
		}

		// for (int i=0; i<10; i+=2) { // 2씩 증가
		// System.out.println(i);
		// }
	}
}
