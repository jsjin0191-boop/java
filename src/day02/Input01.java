package day02;

import java.util.Scanner;

public class Input01 {

	public static void main(String[] args) {
		// Input class
		// console input : 콘솔에서 값을 입력받는 것을 의미
		// Scanner 클래스 : 입력받은 값의 형식변환을 편리하게 해주는 클래스
		// 객제를 생성 => new 키워드로 생성

		// 기본자료형 => 타입 변수명 = 값;
		// 클래스 자료형 => 클래스명 객체이름 = new 클래스명(값);
		// 객체명.next() : 한 단어만 입력(공백 미포함) (문자) => string
		// 객체명.nextline() : 공백포함 여러단어 (문자) => string
		// 객체명.nextint() : wjdtn dlqfur => int
		// 객체명.next자료형() : 자료형에 맞게 입력받기

		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("숫자 입력 >");
//		int num = scan.nextInt();
//		System.out.println("내가 입력한 값 : "+num);
//		
//		// 내가 받은 값이 짝수인지 홀수인지 판별
//		if(num % 2 == 0) {
//			System.out.println("짝수");
//		}else {
//			System.out.println("홀수");
//		}
//		
		System.out.println("소수점을 포함한 수 입력 >");
		double dou = scan.nextDouble();
		System.out.println("dou");

		// 문자입력
		System.out.println("문자입력>");
		String str = scan.next(); // 공백 미포함
		System.out.println(str);

		scan.nextLine(); // 공백 제거용

		System.out.println("여러 단어 입력 >");
		String str1 = scan.nextLine(); // 공백 포함 (Enter)
		System.out.println(str1);

		scan.close();

	}

}
