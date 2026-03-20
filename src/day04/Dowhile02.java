package day04;

import java.util.Scanner;

public class Dowhile02 {

	public static void main(String[] args) {
		// 메뉴구성
		// 1. 저장하기 | 2. 새로만들기 | 3. 종료하기
		
		Scanner scan = new Scanner(System.in);
		int memu = 0;
		do {
			System.out.println("--memu--");
			System.out.println("1.저장하기 | 2.새로만들기 | 3.종료하기");
			System.out.println("memu> ");
			memu = scan.nextInt();
			
			// 실제 가능 처리 구현 구문
			switch(memu) {
			case 1:
				System.out.println("저장되었습니다.");
				break;
			case 2:
				System.out.println("새로만들었습니다.");
				break;
			case 3:
				System.out.println("종료합니다.");
				break;
			default: System.out.println("잘못된 메뉴입니다.");
			}
		} while(memu != 3);

	}

}
