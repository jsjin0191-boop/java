package day08;

import java.util.Arrays;
import java.util.Scanner;

public class Exam01_1 {

	public static void main(String[] args) {
		/*
		 * 숫자를 입력받아 입력받은 숫자의 합계와 평균을 출력 12345 => 1+2+3+4+5 합계 평균 123456789 =>
		 * 1+2+2+4+5+5+7+8+9 합계 평균 반복 (0 또는 음수를 입력하면 종료)
		 */

		Scanner scan = new Scanner(System.in);

		int arr[] = new int[1]; // 숫자를 담는 배열
		int count = 0; // 담아야할 숫자 개수
		int sum = 0;
		while (true) {
			System.out.println("숫자를 입력 > (0이나 -면 종료)");
			int num = scan.nextInt();

			if (num <= 0) {
				System.out.println("종료");
				break;
			}
			if (count == arr.length) {
				int arr2[] = new int[arr.length + 3];
				System.arraycopy(arr, 0, arr2, 0, arr.length);
				arr = arr2;
			}
			arr[count] = num;
			sum += num;
			count++;
		}
		System.out.println(Arrays.toString(arr));
		if (count == 0) {
			System.out.println("입력한 숫자가 없습니다.");
		} else {
			System.out.println("---계산식---");
			for (int i = 0; i < count - 1; i++) {
				System.out.print(arr[i] + "+");
			}
			System.out.print(arr[count - 1]);
			double avg = (double) sum / count;
			System.out.println();
			System.out.println("합계: " + sum);
			System.out.printf("평균: %.2f\n", avg);

		}

		scan.close();
	}

}
