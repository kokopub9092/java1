package exam02;

public class StringArray2 {
	int num;
	public void printStr() {
		System.out.println("�Լ� : printStr�� ȣ���ϼ̳׿�");
	}

	public static void main(String[] args) {
		StringArray2 st2 = new StringArray2();  //������ Ÿ�� ���� --> ���� ����
		st2.num = 3;
		System.out.println(st2.num);
		st2.printStr();
	}

}
