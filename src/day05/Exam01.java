package day05;

import java.util.Random;
import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// 가위바위보
		/*
		 * 컴퓨터와 유저가 가위바위보 게임을 진행 가위 =0, 바위 = 1, 보 = 2 
		 * 유저는 input 0 1 2 중 선택 컴퓨터는 랜덤으로 0 1 2 중 선택 
		 * ex) com = 0 / me = 0 com(가위) / me(가위) => 무승부 
		 * com = 0 / me = 2 com(가위 ) /me(보) => me 패배!! 
		 * 0 1 2 외에 다른 입력값이 들어오면 => 다시 입력하세요
		 */

		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		String[] hand = { "가위", "바위", "보" };

//		while (true) {
//			System.out.println("게임을 시작합니다.");
//			System.out.println("가위. 0 | 바위. 1 | 보. 2 | 종료. 3");
//			System.out.println("해당하는 숫자를 입력해주세요.>");
//			int user = scan.nextInt();
//
//			if (user == 3) {
//				System.out.println("게임을 종료합니다.");
//				break;
//			}
//
//			if (user < 0 || user > 2) {
//				System.out.println("다시입력해 주세요.>");
//				continue;
//			}
//
//			int com = random.nextInt(3);
//
//			System.out.print("com(" + hand[com] + ") / user(" + hand[user] + ") => ");
//
//			if (user == com) {
//				System.out.println("무승부!");
//			} else if ((user == 0 && com == 2) || (user == 1 && com == 0) || (user == 2 && com == 1)) {
//				System.out.println("user 승리!!");
//
//			} else {
//				System.out.println("user 패배!!");
//			}
//			System.out.println("-----------------------------------------");
//
//		}
//		

		
		
		// 0~2 사이의 값만 가능
		System.out.println("가위바위보 게임 시작>");
		
		int comNum = (int)(Math.random()*3); // 0부터 3개의 숫자를 랜덤으로 출력
		System.out.println("컴퓨터 결정 완료!!");
		
		System.out.println("가위(0)바위(1)보(2) 종료(3) 중 (0 1 2) 선택>");
		int myNum = scan.nextInt();
		//System.out.println("유저 결정 완료!!");
		
		// 승패 비교
		if(myNum <0 || myNum > 2){
			System.out.println("입력오류입니다.");
			return; // main 메서드 종료 구문
		}
		
		String result = "";
		
		if(comNum == myNum) {
			result = "무승부!!";
		}else {
			if(myNum == 0) { 
				// 가위
				result = (comNum == 2) ? "유저 승!!!" : "유저 패!";
				
			}else if(myNum == 1) {
				// 바위
				result = (comNum == 0) ? "유저 승!!!" : "유저 패!";
				
			}else {
				//myNum == 2 보
				result = (comNum == 1) ? "유저 승!!!" : "유저 패!";
			}
		}
		
		// 출력
		System.out.println("Com("+hand[comNum]+") "
				+ "/ User("+hand[myNum] +") => "+result);
		
		scan.close();
		

	}

}






