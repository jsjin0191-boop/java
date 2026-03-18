package day02;

public class Exam01 {

	public static void main(String[] args) {
		// 까페에 제출
		/*
		 * 국어, 영어, 수학 점수를 변수로 선언 => 값을 저장 합계와 평균을 출력 평균에 소수점은 표시 조건선택연산자를 이용하여 평균이 80점
		 * 이상이면 합격, 아니면 불합격 출력
		 */

		int korl = 100;
		int mat = 59;
		int ens = 59;

		System.out.println(korl + mat + ens);
		int total = korl + mat + ens;
		System.out.println(total / 3.0);
		double average = total / 3.0;
		System.out.println(average >= 80 ? "합격" : "불합격");

		// 합격여부를 if문으로 변경

		if (average >= 80) {
			System.out.println("합격");
		} else if (average < 80) {
			System.out.println("불합격");
		}

		System.out.println("-------------------");
		// 평균이 80이상이면 합격, 60이상이면 통과, 60미만이면 불합격

		if (average > 100 || average < 0) {
			System.out.println("오류");
		} else if (average >= 80) {
			System.out.println("합격");
		} else if (average >= 60) {
			System.out.println("통과");
		} else {
			System.out.println("불합격");
		}

		// 평균 100 <= avg <= 0
		// 평균이 100보다 크거나, 0보다 작으면 오류
		// 평균이 80이상이면 합격, 60이상이면 통과, 60미만이면 불합격

		System.out.println("--------------------");

		if (average > 100 || average < 0) {
			System.out.println("오류");
		} else {
			if (average >= 80) {
				System.out.println("합격");
			} else if (average >= 60) {
				System.out.println("통과");
			} else {
				System.out.println("불합격");
			}

		}
	}

}
