package exam04;

public class OverLoading { // �Ķ���� �̸��� �޶� �ٸ� �Լ�, �̸��� ��� �ٸ� �Լ�
	// �����ε� �Լ� ���� ���ƾ� �Ѵ�.
	// ���� �Լ� ������ �������� ���� �� �ִ�.
	// �Ķ���� ������ ���ƾ� �Ѵ�.
	// �Ķ���� ��ġ(����)�� �޶�� �Ѵ�. (int a, String b �� String b, int a�� �ٸ�)
	// �Ķ���� ������ �ٸ��ٰ� �ؼ� �ٸ��� �ƴϴ�. (String b, int a �� String str, int num�� ����)
	// �̸��� �Ȱ��� �ϰ� �ٸ� ����� ������ �� �ִ�. ��, ������ Ÿ���� �ٸ��� �ؾ��Ѵ�.
	
	public void over(int a, String b) { // ������ ���� �� (�ƹ��͵� �ѱ��� ����)
		System.out.println("�����Լ��� ȣ���߳׿�~");
	}
	
	public void over(String b, int a) {
		System.out.println("�ι�° �����Լ��� ȣ���߳׿�~");
	}
	
	public String over(String str) { //������ �ִ� ��
		System.out.println("����° �����Լ��� ȣ���߳׿�~");
		System.out.println(1);
		System.out.println('a');
		System.out.println(true);
		System.out.println(0.075);
		return "str";
	}

}
