package day05;

import java.util.Arrays;
import java.util.Scanner;

public class Array02 {

	public static void main(String[] args) {
		// 5명의 점수를 입력받기 => 배열로 생성
		/*
		 * 1.배열을 생성 5개 2.점수를 입력받는다(0~100) 3.점수를 출력한다. 4.점수의 합계와 평균을 출력
		 */

		Scanner scan = new Scanner(System.in);

		int sum = 0; // 합계
		double avg = 0; // 평균

		int arr[] = new int[5];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("점수를 입력해주세요.>");
			arr[i] = scan.nextInt(); // 점수: arr[i]
			while (arr[i] < 0 || arr[i] > 100) {
				System.out.println("잘못된 점수입니다.");
				System.out.println("다시입력하세요.>");
				arr[i] = scan.nextInt();
			}
			System.out.println("점수입력완료.");
			sum = sum + arr[i];

		}
		System.out.println(Arrays.toString(arr));
		avg = sum / (double) arr.length;
		System.out.println("점수의 합계는" + sum + "평균점수는" + avg + "입니다.");

		scan.close();
	}

}
