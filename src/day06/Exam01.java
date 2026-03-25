package day06;

//import java.util.Arrays;
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
			for (int j = 0; j < i; j++) {
				if (com[i] == com[j]) {
					i--;
					break;
				}
			}
		}
		
//		System.out.println(Arrays.toString(com));

		// user 번호를  String 으로 받아서 배열로 split "" => 한글자씩 잘라 배열로 리턴
		// 숫자로 변환
		
//		while(true) {
//			// user 번호 입력
//			System.out.println("숫자입력>");
//			String myNum = scan.next();
//			
//			// 한글자씩 나누어 배열로 리턴
//			String[]myNumstr = myNum.split("");
//		    for(int i=0; i<myNumstr.length;i++) {
//		    	user[i]= Integer.parseInt(myNumstr[i]);
//		    }
//		}
		System.out.println("야구게임을 시작합니다.> (0~9사이의 숫자 3개)");
		while (true) {
			int strike = 0;
			int ball = 0;
			System.out.print("숫자 3개를 눌러주세요 :");
			for (int i = 0; i < user.length; i++) {
				user[i] = scan.nextInt();
			}
			boolean duplicate = false;
			a: for (int i = 0; i < user.length; i++) {
				for (int j = 0; j < i; j++)
					if (user[i] == user[j]) {
						duplicate = true;
						break a;
					}
			}
			if (duplicate) {
				System.out.println("중복된숫자입니다. 서로다른 숫자를 입력해주세요.");
				continue;
			}
			for (int i = 0; i < user.length; i++) {
				for (int j = 0; j < com.length; j++) {
					if (user[i] == com[j]) {
						if (i == j) {
							// System.out.println("strike");
							strike++;
						} else {
							// System.out.println("ball");
							ball++;
						}

					}
				}
			}
			if (strike == 0 && ball == 0) {
				System.out.println("out!!");
			} else {
				if (strike != 0) {
					System.out.println(strike + "s ");
				}
				if (ball != 0) {
					System.out.println(ball + "b ");
				}
			}
			if (strike == 3) {
				System.out.println("정답입니다.");
				System.out.println("게임을 종료합니다.");
				break;
			}

		}

		scan.close();

	}

}