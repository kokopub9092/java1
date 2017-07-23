package exam01;

import java.util.Scanner; // ctrl + shift + o

public class Exam08 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("반복문의 시작값을 입력해주세요.");
		String initStr = scan.nextLine();
		int initNum = Integer.parseInt(initStr);

		int num = 0;

		System.out.println("반복문의 종료값을 입력해주세요.");
		String maxStr = scan.nextLine();
		int maxNum = Integer.parseInt(maxStr);

		for (int i = initNum; i <= maxNum; i++) {
			System.out.println(i);
			// if (i % 3 == 0 || i%2==0) { // || or조건 --> 6일 경우 3이 만족하므로 2의 조건은 넘어간다.
			// num += i; // && 3과 2를 만족하는 조건 --> 3과 2의 공통점 (10안에서) 6이다.
		}
	}
}
