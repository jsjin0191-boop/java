package day06;

import java.util.Arrays;

public class Array06 {

	public static void main(String[] args) {
		// String 배열

		String[] strarr = new String[5];

		strarr[0] = "홍길동";
		strarr[1] = "박순이";
		strarr[2] = "김영이";
		strarr[3] = "황영이";
		strarr[4] = "고길동";

		// 출력
		System.out.println(Arrays.toString(strarr));

		for (String s : strarr) {
			System.out.println(s);
		}

		// 배열을 크기가 고정
		String[] arr = new String[5];
		arr[0] = "홍길동";
		System.out.println(Arrays.toString(arr));

		for (String s : arr) {
			System.out.println(s);

		}

		// 배열에 데이터를 줄이거나 늘리고 싶은 경우
		String arr2[] = new String[6];
//		arr = arr2;
//
//		// strarr 5개 있는 데이터를 arr2로 이동
//		// 받을 대상 = 옮길 대상
////		strarr = arr2;
//		for (int i = 0; i < 5; i++) {
//			arr2[i] = strarr[i];
//		}
//		
//		System.out.println("==========");
//		System.out.println(Arrays.toString(strarr));
//		System.out.println(Arrays.toString(arr2));
//		
//		strarr=arr2;
//		System.out.println(Arrays.toString(strarr));
		
		// 배열복사
		// System.arraycopy(구배열,시작번지, 신배열,시작번지, 개수)
		System.arraycopy(strarr, 0, arr2, 0, strarr.length);
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(strarr));
		
		strarr=arr2; // 새 배열로 배열 주소 연결
		strarr[5]="바둑이";
		System.out.println(Arrays.toString(strarr));
		System.out.println(Arrays.toString(arr2));
	}

}
