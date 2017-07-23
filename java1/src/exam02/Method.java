package exam02;

public class Method {
	
	int[] num1=new int[10];
	
	public void setNum1(int num1) {
		System.out.println(num1);
	}
	
	public int[] getNum1() {
		return num1; //num1이 앞에 this.이 생략
	}
	
	public static void main(String[] args) {
		Method method = new Method();
		method.setNum1(3);
		int[] a = method.getNum1(); // 정해져 있지 않은 데이터 타입은 주소값이 나온다.
		System.out.println(a[0]); // a의 0번째 방은 int이기 때문에 0
		String str = "주소값이 나올까? 내 문자열 값이 나올까?"; // 하지만 String은 특별하기 때문에 문자열이 나옴
		String str2 = new String("여기요!");
		System.out.println(str); 
		System.out.println(method);
	} 

}
