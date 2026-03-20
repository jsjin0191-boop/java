package day04;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		/*
		 * ----menu---- 1.+ | 2.- | 3.* | 4./ | 5.% |6. 종료 두 수를 일렵해 주세요 > 2 3 menu 1 =>
		 * 2+3=5 menu 2 => 2-3=1 menu 3 => 2*3=6 menu 4 => 2/3= => num2를 다시 입력해주세요.
		 */

		Scanner scan = new Scanner(System.in);
		int menu = 0;
		int num1 = 0;
		int num2 = 0;
		int result = 0;
		char ch = ' ';

		do {

			System.out.println("---memu---");
			System.out.println("1. + | 2. - | 3. * | 4. / 5. % | 6. 종료");
			System.out.println("메뉴를 선택해주세요.>");
			menu = scan.nextInt();
			if (menu < 1 || menu > 6) {
				System.out.println("존재하지 않는 메뉴입니다.");
				continue;
			} else if (menu == 6) {
				System.out.println("프로그램을 종료합니다.");
				break;

			} else {
				System.out.println("두 수를 입력해주세요 > 예시) 2 3");
				num1 = scan.nextInt();
				num2 = scan.nextInt();

				while (((menu == 4 || menu == 5) && num2 == 0)) {

					System.out.println("0으로 나눌 수 없습니다.");
					System.out.println("num2를 다시 입력하세요>");
					num2 = scan.nextInt();

				}
			}

			switch (menu) {
			case 1:
				ch = '+';
				result = num1 + num2;
				break;
			case 2:
				ch = '-';
				result = num1 - num2;
				break;
			case 3:
				ch = '*';
				result = num1 * num2;
				break;
			case 4:
				ch = '/';
				result = num1 / num2;
				break;
			case 5:
				ch = '%';
				result = num1 % num2;
				break;

			}

			System.out.println("" + num1 + "" + ch + "" + num2 + "=" + result);

		} while (menu != 6);

		scan.close();

	}
}