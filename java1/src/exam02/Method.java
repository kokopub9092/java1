package exam02;

public class Method {
	
	int[] num1=new int[10];
	
	public void setNum1(int num1) {
		System.out.println(num1);
	}
	
	public int[] getNum1() {
		return num1; //num1�� �տ� this.�� ����
	}
	
	public static void main(String[] args) {
		Method method = new Method();
		method.setNum1(3);
		int[] a = method.getNum1(); // ������ ���� ���� ������ Ÿ���� �ּҰ��� ���´�.
		System.out.println(a[0]); // a�� 0��° ���� int�̱� ������ 0
		String str = "�ּҰ��� ���ñ�? �� ���ڿ� ���� ���ñ�?"; // ������ String�� Ư���ϱ� ������ ���ڿ��� ����
		String str2 = new String("�����!");
		System.out.println(str); 
		System.out.println(method);
	} 

}
