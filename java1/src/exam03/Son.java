package exam03;

public class Son extends Father {
	String house = "�Ÿ� ��ÿ�";
	
	public Son() {
		
	}
	
	public void printHouse() { // �Լ��� ������, �������̵� - �Լ����� ���ƾ���. (����� �޾������� �����ϴ�.), �����
		System.out.println(house);
	}
	
	public static void main(String[] args) {
		Son s = new Son(); // SonŬ������ s��� �������� ����ϰڴٴ� ������ �� ���̴�.
		System.out.println(s.money);
		System.out.println(s.car);
		System.out.println(s.house); // �Ȱ��� �������� �������ָ� �ڱ� �ڽ��� ���� ��Ÿ����.
		s.printHouse();
		s.doJob("�ƺ�");
		s.who = "��";
		s.doSleep("��");
		
	}

}
