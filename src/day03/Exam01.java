package day03;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// up/down game
		// 1~50까지의 랜덤수 하나를 컴퓨터가 생성=> user 모름
		// 유저가 맞추는 게임
		// ex) 컴퓨터가 랜덤수를 생성했습니다. (23)
		// 입력> 10 up!
		// 입력> 20 up!
		// 입력> 30 down!
		// 입력> 25 down!
		// 입력> 23 정답!

		Scanner scan = new Scanner(System.in);
		int sus = (int) (Math.random() * 50) + 1;

//		System.out.println("컴퓨터가 랜덤수를 생성했습니다.");
//		while (true) {
//			System.out.println("입력> ");
//			int input = scan.nextInt();
//			if (input > sus) {
//				System.out.println("down!");
//			}
//			if (input < sus) {
//				System.out.println("up!");
//			}
//			if (input == sus) {
//				System.out.println("정답!");
//				System.out.println("게임종료");
//				break;
//			}
//
//		}

		int count = 0;
//		System.out.println("컴퓨터가 랜덤수를 생성했습니다.");
//		for (count = 1; count <= 5; count++) {
//			System.out.println("입력> ");
//			int input = scan.nextInt();  // 사용자 입력
//			if (input > sus) {
//				System.out.println("down!");
//			}
//			if (input < sus) {
//				System.out.println("up!");
//			}
//			if (input == sus) {
//				System.out.println("정답!");
//				System.out.println("게임종료");
//				break;
//			}
//		}
//
//		if (count > 5) {
//
//			System.out.println("모든기회를 사용하였습니다.");
//		}

		while (true) {
			System.out.println("입력> ");
			int input = scan.nextInt();
			count++;
			if (input > sus) {
				System.out.println("down!");
			}
			if (input < sus) {
				System.out.println("up!");
			}
			if (input == sus) {
				System.out.println("정답!");
				System.out.println("게임종료");
				break;
			}
			if (count == 5) {
				System.out.println("횟수를 초과하였습니다.");
				System.out.println("정답은" + sus + "입니다.");
				break;
			}
		}

		scan.close();
	}
}
