package exam04;

public class BizMan extends Person { // Person��� ����
	
	public static void main(String[] args) {
//		Person p = new BizMan(); // ������Ÿ���� �ٸ����� ����� �޾ұ� ������ ����� �� �ִ�.
//		p.doSleep();
//		p.doWakeUp();
//		p.doWork();
//		
//		Person p2 = new Student();
//		p2.doSleep();
//		p2.doWakeUp();
//		p2.doWork(); // StudentŬ�������� �Լ��� �������ϸ� ���� �ƴ� �����Ѵٷ� �ٲ� �� �ִ�.
		
			Person[] arrP = new Person[2];
			arrP[0] = new BizMan();
			arrP[1] = new Student();
			arrP[0].doWork();
			arrP[1].doWork();
	}

}
