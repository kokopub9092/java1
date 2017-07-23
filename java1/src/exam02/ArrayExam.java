package exam02;

public class ArrayExam {
	public static void main(String[] args) {
		int[] arrNum = new int[20]; // arrNums 변수명은 상관이 없다.
		for(int i=0; i<arrNum.length; i++) { // for문 - 반복문 함수가 아니다. 
			 //System.out.println(i);
			arrNum[i] = i+1;
		}
		System.out.println(arrNum.length);
		
	}
}
