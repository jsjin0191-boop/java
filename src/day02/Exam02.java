package day02;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		/*
		 * 과제 정수 2개와 연잔자 1개을 입력받아 두 정수의 연산의 결과를 출력 ex) 2 3 + => 2 + 3 = 5 ex) 2 3 - => 2
		 * - 3 = -1 ex) 2 3 ! => 잘못된 언산자 연산자는 + - * / % 만 가능 String 문자열 == "+" => 불가능
		 * char == '+' => 가능 scan.next() : 한단어 => string
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("두정수를 띄어쓰기 하여 입력 >");
		int n1 = scan.nextInt();

//		System.out.println("두번째 숫자 >");
		int n2 = scan.nextInt();

		System.out.println(n1);
		System.out.println(n2);
		// char로 받을떄
		System.out.println(">>>");
		char op = scan.next().charAt(0); // char 형태로 입력받기
		System.out.println(op);

		System.out.println(">>>");
		String opstr = scan.next(); // string 형태로 입력받기

		// 1. swihch 이용
		
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
		
		// 2. switch result 변수 활용
		
		int result = 0;
		switch (op) {
		case '+':
			result = n1 + n2;
			break;
		case '-':
			result = n1 - n2;
			break;
		case '*':
			result = n1 * n2;
			break;
		case '/':
			result = n1 / n2;
			break;
		case '%':
			result = n1 % n2;
			break;
		default:
			System.out.println("잘못된연산자");

		}
		if (op == '+' || op == '-' || op == '*' || op == '%' || op == '/') {
			System.out.println("" + n1 + op + n2 + "=" + result);
		}

		// 3. if문 사용 (char)
		
		int ifResult = 0;
		if (op == '+') {
			ifResult = n1 + n2;
		} else if (op == '-') {
			ifResult = n1 - n2;
		} else if (op == '*') {
			ifResult = n1 * n2;
		} else if (op == '/') {
			ifResult = n1 / n2;
		} else if (op == '%') {
			ifResult = n1 % n2;
		} else {
			System.out.println("잘못된 연산자");
		}

		if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
			System.out.println("" + n1 + op + n2 + "=" + ifResult);
		}

		ifResult = 0; // 앞에서 쓴 변수 초기화

		// 4. if문 사용 (string)
		
		
		if (opstr.equals("+")) {
			ifResult = n1 + n2;
		} else if (opstr.equals("-")) {
			ifResult = n1 - n2;
		} else if (opstr.equals("*")) {
			ifResult = n1 * n2;
		} else if (opstr.equals("%")) {
			ifResult = n1 % n2;
		} else if (opstr.equals("/")) {
			ifResult = n1 / n2;
		} else {
			System.out.println("잘못된연산자입니다.");
		}
		if (op == '+' || op == '-' || op == '*' || op == '%' || op == '/') {
			System.out.println("" + n1 + op + n2 + "=" + result);
		}
		
//		char op = scan.next().charAt(0);  // return char
//		if(op == '+') {
//			
//		}
//		
//		// string으로 받을때
//		Scanner str = scan.next();
//		if(str.equals("+")) {
//			
//		}
//				 

//		switch(op) {
//		case "+": break;
//		
//		}

//		int a = scan.nextInt();
//		int b = scan.nextInt();
//		char op = scan.next().charAt(0);
//
//		if (op == '+') {
//			System.out.println("" + a + op + b + "=" + (a + b));
//		} else if (op == '-') {
//			System.out.println("" + a + op + b + "=" + (a - b));
//		} else if (op == '*') {
//			System.out.println("" + a + op + b + "=" + (a * b));
//		} else if (op == '/') {
//			System.out.println("" + a + op + b + "=" + (a / b));
//		} else if (op == '%') {
//			System.out.println("" + a + op + b + "=" + (a % b));
//		} else {
//			System.out.println("잘못된 연산자입니다.");
//		}
//
//		
//	}
//
//}

		scan.close();
	}

}
