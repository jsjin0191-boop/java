package day05;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// 가위바위보
		/*
		 * 컴퓨터와 유저가 가위바위보 게임을 진행 
		 * 가위 =0, 바위 = 1, 보 = 2 
		 * 유저는 input 0 1 2 중 선택 컴퓨터는 랜덤으로 0 1 2 중 선택 
		 * ex) com = 0 / me = 0 
		 * com(가위) / me(가위) => 무승부 
		 * com = 0 / me = 2 
		 * com(가위)/ me(보) => me 패배!! 
		 * 0 1 2 외에 다른 입력값이 들어오면 => 다시 입력하세요
		 */

		Scanner scan = new Scanner(System.in);
		int menu = 0;
		int me = 0;
		int com = 0;

		System.out.println("게임을 시작합니다.");
		System.out.println("가위. 0 | 바위. 1 | 보. 2");
		System.out.println("해당하는 숫자를 입력해주세요.>");
		menu = scan.nextInt();

		while (menu < 0 || menu > 2) {
			System.out.println("다시입력해 주세요.>");
			me = scan.nextInt();

		} 
		

		
		scan.close();

	}

}
