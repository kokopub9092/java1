package exam03;

public class Father { // ���

	int money = 1000;
	String car = "YF�ҳ�Ÿ";
	String house = "���� Ÿ���Ӹ���";
	String who = "�ƺ�";

	public void printHouse() { // void �ƹ��͵� �ѱ��� �ʴ� �Լ�
		System.out.println("�ƺ� ��");
	}

	public void doJob(String who) { // (String who) ���ڰ�, �Ķ���� - ������ Ÿ���� �����ؾ��Ѵ�.
		System.out.println(who + " ����, �ٺ� �Ӹ�.");
	}

	public void doSleep(String who) {
		System.out.println(who + " �ǰ���, �ھߵ�.");
	}

}
