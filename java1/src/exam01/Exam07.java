package exam01;

public class Exam07 {

	public static void main(String[] args) {
		// int num = 1;
		// System.out.println(num);
		// num = num +1;
		// System.out.println(num);
		// num++; // ++�� �ڱ� �ڽſ� 1�� ���Ѵٴ� �ǹ�
		// System.out.println(num);
		// num +=1; // +=�� +=���� �ִ� ���ڸ�ŭ �����ش�
		// System.out.println(num);

		// System.out.println(4%2); // mode ������ --> ������ ������ <%>
		// for (int i=0; i<10; i++) { // 1�� ����
		// // ������ ����Ϸ��� int�� ���� Ÿ���� �������ش�.
		// // i=0; �ʱ�ȭ
		//
		// if(i%2==0 && i!=0) {
		// System.out.println(i);
		// }
		// }

		for (int i = 0; i < 10; i++) { // if�� else if
			if (i != 0) { // ���빭��
				if (i % 3 == 0) {
					System.out.println("3�� ���:" + i);
				}
				if (i % 2 == 0) {
					System.out.println("2�� ���:" + i);
				}
			}
		}

		// for (int i=0; i<10; i+=2) { // 2�� ����
		// System.out.println(i);
		// }
	}
}
