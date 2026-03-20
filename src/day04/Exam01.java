package day04;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {

		/*
		 * 과제 정수 2개와 연잔자 1개을 입력받아 두 정수의 연산의 결과를 출력 ex) 2 3 + => 2 + 3 = 5 ex) 2 3 - =>
		 * 2- 3 = -1 ex) 2 3 ! => 잘못된 언산자 연산자는 + - * / % 만 가능 String 문자열 == "+" => 불가능
		 * 
		 * equals() char == '+' => 가능 scan.next().charAt(0);
		 */
		/*
		 * 연산은 0으로 나눈떄 exception 발생
		 * 
		 * - / % 피연산자가 0이면 0으로 나눌수 없습니다. 출력
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("정수 2개와 연산자를 순서대로 입력 > (2 3 +)");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		char op = scan.next().charAt(0);
//		String opstr = scan.next();

//		int ifResult = 0;
//		if (op == '+') {
//			ifResult = n1 + n2;
//		} else if (op == '-') {
//			ifResult = n1 - n2;
//		} else if (op == '*') {
//			ifResult = n1 * n2;
//		} else if (op == '%') {
//			if (n2 == 0) {
//				System.out.println("0으로 나눌수 없습니다.");
//				return;
//			}
//			ifResult = n1 % n2;
//		} else if (op == '/') {
//			if (n2 == 0) {
//				System.out.println("0으로 나눌수 없습니다.");
//				return;
//			}
//			ifResult = n1 / n2;
//		} else {
//			System.out.println("잘못된연산자입니다.");
//		}
//		if (op == '+' || op == '-' || op == '*' || op == '%' || op == '/') {
//			System.out.println("" + n1 + op + n2 + "=" + ifResult);
//		}

//		if (opstr.equals("+")) {
//			ifResult = n1 + n2;
//		} else if (opstr.equals("-")) {
//			ifResult = n1 - n2;
//		} else if (opstr.equals("*")) {
//			ifResult = n1 * n2;
//		} else if (opstr.equals("%")) {
//			if(n2==0) {
//				System.out.println("0으로 나눌수 없습니다."); return;
//			}
//			ifResult = n1 % n2;
//		} else if (opstr.equals("/")) {
//			if(n2==0) {
//				System.out.println("0으로 나눌수 없습니다."); return;
//			}
//			ifResult = n1 / n2;
//		} else {
//			System.out.println("잘못된연산자입니다.");
//		}
//		if (opstr.equals("+") ||opstr.equals("-") || opstr.equals("*") || opstr.equals("%") || opstr.equals("/")) {
//			System.out.println("" + n1 + opstr + n2 + "=" + ifResult);
//		}
//		
		
		if((op=='%' || op=='/') && n2==0) {
			System.out.println("0으로 나눌수 없습니다.");
			return;
		}
		switch (op) {
		case '+':
			System.out.println("" + n1 + op + n2 + "=" + (n1 + n2));
			break;
		case '-':
			System.out.println("" + n1 + op + n2 + "=" + (n1 - n2));
			break;
		case '*':
			System.out.println("" + n1 + op + n2 + "=" + (n1 * n2));
			break;
		case '/':
			System.out.println("" + n1 + op + n2 + "=" + (n1 / n2));
			break;
		case '%':
			System.out.println("" + n1 + op + n2 + "=" + (n1 % n2));
			break;
		default:
			System.out.println("잘못된연산자");

		}
//		int result = 0;
		
		
		
		
		
		
		
		
		scan.close();

	}

}
