package exam03;

public class ConExam { // �ҹ��ڷ� �������� ���� ConExam �̰��� �����ڶ�� �θ���.
	
	int age = 30;
	String name = "ȫ�浿";
	
	// age�� ���� 20���� �۴ٸ� => 10���� ���
	// age�� ���� 30���� �۴ٸ� => 20���� ���
	// age�� ���� 40���� �۴ٸ� => 30���� ���
	// age�� ���� 50���� �۴ٸ� => 40���� ���
	// age�� ���� 60���� �۴ٸ� => 50���� ���
	// age�� ���� 60�̻��̶�� => ���� �޾ư����� ��� ���
	
	public ConExam(int age, String name) {
		this.age = age;
		this.name = name;
		if(age<20) {
			System.out.println("10��");
		} else if (age<30) {
			System.out.println("20��");
		} else if (age<40) {
			System.out.println("30��");
		} else if (age<50) {
			System.out.println("40��");
		} else if (age<60) {
			System.out.println("50��");
		} else if (age>=60) {
			System.out.println("���� �޾ư�����");
		}
		System.out.println(age);
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		ConExam ce = new ConExam(20, "��浿");  // ������ ȣ��
		ConExam ce1 = new ConExam(30, "���浿");
	} 
}