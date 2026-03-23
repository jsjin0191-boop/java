package day06;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		/*
		 * 야구게임 컴퓨터가 랜덤으로 3자리의 숫자를 생성 (각 자리수는 0~9까지 랜덤생성 => 중복불가능) => 배열로 저장 
		 * 유저가 3자리를 맞추는 게임. 
		 * 자리와 숫자가 일치하면 strike 
		 * 자리는 불일치 하지만 숫자가 다른 위치에 있다면 ball 
		 * 자리도 숫자도 없으면 out
		 * 
		 * ex) com : 1 2 3 
		 * user : 1 5 9 => 1s 
		 * user : 6 5 8 => out 
		 * user : 1 7 4 => 1s
		 * user : 1 3 2 => 1s 2b 
		 * user : 1 2 3 => 3s => 정답 !! 
		 * user : 3 4 5 => 1b
		 */
		Scanner scan = new Scanner(System.in);
		Random random = new Random();

		int com[] = new int[3];
		int user[] = new int[3];

		for (int i = 0; i < com.length; i++) {
			com[i] = random.nextInt(10);
			for (int j = i + 1; j < i; j++) {
				if (com[i] == com[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(com));
		
		System.out.println("야구게임을 시작합니다.> (0~9사이의 숫자 3개)");
		while (true) {
			int strike = 0;
			int ball = 0;
			System.out.print("숫자 3개를 눌러주세요 :");
			for(int i=0; i<user.length; i++) {
				user[i]= scan.nextInt();
			}
			for (int i = 0; i < user.length; i++) {
				for (int j = 0; j < com.length; j++) {
					if (user[i] == com[j]) {
						if (i == j) {
							//System.out.println("strike");
							strike++;
						}else {
							//System.out.println("ball");
							ball++;
						}

					}
				}
			}
			if(strike==0 && ball==0) {
				System.out.println("out!!");
			}else {
				if(strike!=0) {
					System.out.print(strike+"s ");
				}if(ball!=0) {
					System.out.println(ball+"b ");
				}
			}
			
			// com 입력 중복 확인!!
			// user 입력 중복 확인!!(선택)
			// 3s 일떄 정답 출력 후 종료 만들기
			
			
			

		}
		
		
		
		
		
//	scan.close();

	}

}
