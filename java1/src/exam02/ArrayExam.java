package exam02;

public class ArrayExam {
	public static void main(String[] args) {
		int[] arrNum = new int[20]; // arrNums �������� ����� ����.
		for(int i=0; i<arrNum.length; i++) { // for�� - �ݺ��� �Լ��� �ƴϴ�. 
			 //System.out.println(i);
			arrNum[i] = i+1;
		}
		System.out.println(arrNum.length);
		
	}
}
