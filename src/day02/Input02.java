package day02;

import java.util.Scanner;

public class Input02 {

	public static void main(String[] args) {
		// 국어, 영어, 수학점수를 입력받아
		// 합계와 평균 pass 여부를 출력
		// pass 여부는 평군이 80이상이면 합격 / 불합격

		Scanner scan = new Scanner(System.in);

		System.out.println("국어>");
		int kor = scan.nextInt();
		if (kor > 100 || kor < 0) {
			System.out.println("잘못입력된 값입니다.");
			return;
		}

		System.out.println("영어>");
		int eng = scan.nextInt();
		if (eng > 100 || eng < 0) {
			System.out.println("잘못입력된 값입니다.");
			return;
		}

		System.out.println("수학>");
		int math = scan.nextInt();
		if (math > 100 || math < 0) {
			System.out.println("잘못입력된 값입니다.");
			return;
		}
		
		// 국어, 영어, 수학의 값이 0보다 작거나, 100보다 크면
		// 잘못된 점수입니다.

//		if (kor > 100 || kor < 0) {
//			System.out.println("잘못된 점수입니다.");
//		} else if (eng > 100 || eng < 0) {
//			System.out.println("잘못된 점수입니다.");
//		} else if (math > 100 || math < 0) {
//			System.out.println("잘못된 점수입니다.");
//		} else {
//
//			int sum = kor + math + eng;
//			System.out.println(sum);
//
//			double avg = sum / 3.0;
//			System.out.println(avg);
//
//			System.out.println(avg >= 80 ? "합격" : "불합격");

//		}

//		if ((kor > 100 || kor < 0) || (eng > 100 || eng < 0) || (math > 100 || math < 0)) {
//			System.out.println("잘못된 점수입니다.");
//			return;
//		}
//
		int sum = kor + math + eng;
		System.out.println(sum);

		double avg = sum / 3.0;
		System.out.println(avg);

		System.out.println(avg >= 80 ? "합격" : "불합격");

		scan.close();

	}

}
