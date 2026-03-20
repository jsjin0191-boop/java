package day04;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		/*
		 * 생년을 숫자로 입력받아 어린이(13), 청소년(19), 어른으로 구분 어린이 5000원, 청소년 7000원, 어른 10000원 입장료 출력
		 * 
		 * ex) 2017 입력 => 9세 어린이입니다. 입장료는 5000원 입니다. 생년을 기준으로 2026 - 2017
		 * 
		 * 생년의 기준은 1900 ~ 2026 유효한 값 기준을 넘어간 데이터는 다시 입력하라고 요청
		 */

		Scanner scan = new Scanner(System.in);
		int nowYear = 2026;
		int i = 0;
		int age = 0;

		while (true) {
			System.out.println("출생년도 입력> ");
			i = scan.nextInt();
			if(i<1900 || i>2026) {
				System.out.println("다시입력하세요.");
			}else {
				age = nowYear - i;
				
				if (age <= 13) {
					System.out.println(age + "세 어린이 입니다. 입장료는 5000원 입니다.");
				} else if (age <= 19) {
					System.out.println(age + "세 청소년 입니다. 입장료는 7000원 입니다.");
				} else {
					System.out.println(age + "세 어른 입니다. 입장료는 10000원 입니다.");
				} 
				break;
			}

		}

	}

}
