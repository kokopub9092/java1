package exam01;

public class Exam11 {
	public static void main(String[] args) {
		// int ������ Ÿ���� nums��� �迭������ �������ּ���.
		// nums�迭������ �氹���� 10���Դϴ�.
		// for���� �ۼ��Ͽ� 0��° �濡�� 1���� ���ʴ�� �Է����ּ���.

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
