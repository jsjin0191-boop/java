package day08;

import java.util.Arrays;
import java.util.Random;
public class Exam02 {

	Random random = new Random();
	
	

	public int[] getWinNum(int maxNum) {
		int winNum = 7;
		int machine[] = new int[winNum];
		for (int i = 0; i < winNum; i++) {
			machine[i] = random.nextInt(maxNum) + 1;
			for (int j = 0; j < i; j++) {
				if (machine[i] == machine[j]) {
					i--;
				}
			}
		}
		return machine;
	}

	public int[] getUserNum(int maxNum) {
		int winNum = 6;
		int myNum[] = new int[winNum];
		for (int i = 0; i < winNum; i++) {
			myNum[i] = random.nextInt(maxNum) + 1;
			for (int j = 0; j < i; j++) {
				if (myNum[i] == myNum[j]) {
					i--;
				}
			}
		}
		return myNum;
	}

	public void ranking(int[] winNum, int[] userNum) {
		int count = 0;
		for (int i = 0; i < 6; i++) { // 사용자
			for (int j = 0; j < 6; j++) { // 당첨
				if (userNum[i] == winNum[j]) {
					count++;
				}
			}
		}
		// 보너스 번호 확인
		int bonusNum = winNum[6]; // winNum의 마지막 인덱스
		boolean bonus = false;
		for (int i = 0; i < 6; i++) {
			if (userNum[i] == bonusNum) {
				bonus = true;
				break;
			}
		}
		// 등수 체크(switch)
		System.out.print("결과: " + count + "개 일치");
		if (bonus)
			System.out.print(" (+보너스 번호 일치)");
		System.out.println();

		switch (count) {
		case 6:
			System.out.println("1등 당첨! (모든 번호 일치)");
			break;
		case 5:
			if (bonus) {
				System.out.println("2등 당첨! (5개 일치 + 보너스)");
			} else {
				System.out.println("3등 당첨! (5개 일치)");
			}
			break;
		case 4:
			System.out.println("4등 당첨! (4개 일치)");
			break;
		case 3:
			System.out.println("5등 당첨! (3개 일치)");
			break;
		default:
			System.out.println("낙첨되었습니다. 다음 기회에!");
			break;
		}
	}

	public static void main(String[] args) {
		/*
		 * 로또 번호 생성 => 당첨여부 user 1~45까지 번호 중 6개 선택 (랜덤 자동선택) 당첨번호 7개 => 6개의 당첨번호 + 보너스
		 * 번호 유저번호와 당첨 번호는 중복 불가능 당첨여부 확인 6개 일치 = 1등(순서 상관없고, 보너스제외) 5개 일치 + 보너스 번호 = 2등
		 * 5개 일치 = 3등 4개 일치 = 4등 3개 일치 = 5등 이 외에는 낙첨 테스트는 숫자 10개로
		 */

		Exam02 e2 = new Exam02();
		int maxNum = 45;
		int winNum[] = e2.getWinNum(maxNum);
		int userNum[] = e2.getUserNum(maxNum);
		System.out.println(Arrays.toString(winNum));
		System.out.println(Arrays.toString(userNum));
		e2.ranking(winNum, userNum);

	}
}