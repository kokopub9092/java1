package exam01;

import java.util.Scanner; // ctrl + shift + o

public class Exam08 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("�ݺ����� ���۰��� �Է����ּ���.");
		String initStr = scan.nextLine();
		int initNum = Integer.parseInt(initStr);

		int num = 0;

		System.out.println("�ݺ����� ���ᰪ�� �Է����ּ���.");
		String maxStr = scan.nextLine();
		int maxNum = Integer.parseInt(maxStr);

		for (int i = initNum; i <= maxNum; i++) {
			System.out.println(i);
			// if (i % 3 == 0 || i%2==0) { // || or���� --> 6�� ��� 3�� �����ϹǷ� 2�� ������ �Ѿ��.
			// num += i; // && 3�� 2�� �����ϴ� ���� --> 3�� 2�� ������ (10�ȿ���) 6�̴�.
		}
	}
}
