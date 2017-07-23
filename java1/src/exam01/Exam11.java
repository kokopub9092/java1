package exam01;

public class Exam11 {
	public static void main(String[] args) {
		// int 데이터 타입의 nums라는 배열변수를 선언해주세요.
		// nums배열변수의 방갯수는 10개입니다.
		// for문을 작성하여 0번째 방에서 1부터 차례대로 입력해주세요.

		int[] nums = new int[10];

		for (int i = 1; i < nums.length + 1; i++) {
			nums[i - 1] = i * 2;
		}
		int sum = 0;
		for (int i = 1; i < nums.length + 1; i++) {
			sum += nums[i - 1];
		}
		System.out.println(sum);
	}
}
