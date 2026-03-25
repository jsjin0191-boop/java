package day07;

import java.util.Scanner;

public class MethodEx01 {

	public static void main(String[] args) {
		/*
		 * 계산기 만들기 ---menu--- 1.덧셈|2.뺄셈|3.곱셉|4.나눗셈|5.나머지|6.종료 메뉴선택 > 1 숫자입력 (두정수)> 1 3
		 * >> 결과 : 1 + 3 =4
		 * 
		 * 뎃셈... 메서드는 Method03에서 호출하여 사용
		 */

		Method03 m3 = new Method03();
		Scanner scan = new Scanner(System.in);
		int menu = 0;
		int num1 = 0;
		int num2 = 0;
//		double result = 0;
//		char ch = ' ';

		do {

			System.out.println("---memu---");
			System.out.println("1. 덧셈 | 2.뺄셈 | 3.곱셈 | 4.나눗셈 | 5.나머지 | 6. 종료");
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
//				ch = '+';
//				int sum = m3.sum(num1, num2);
				m3.print(num1, "+", num2, m3.sum(num1, num2));
				System.out.println(m3.toprint(num1, "+", num2, m3.sum(num1, num2)));
				break;
			case 2:
				m3.print(num1, "-", num2, m3.sub(num1, num2));
//				ch = '-';
//				result = m3.sub(num1, num2);
				break;
			case 3:
				m3.print(num1, "*", num2, m3.mul(num1, num2));
//				result = m3.mul(num1, num2);
//				ch = '*';
				break;
			case 4:
				m3.print(num1, "/", num2, m3.div(num1, num2));
//				ch = '/';
//				result = m3.div(num1, num2);
				break;
			case 5:
				m3.print(num1, "%", num2, m3.mod(num1, num2));
//				ch = '%';
//				result = m3.mod(num1, num2);

				break;

			}
//			if (menu == 4) {
//
//				System.out.println("" + num1 + "" + ch + "" + num2 + "=" + result);
//			} else {
//				System.out.println("" + num1 + "" + ch + "" + num2 + "=" + (int) result);
//			}

		} while (menu != 6);

		scan.close();
	}

}
