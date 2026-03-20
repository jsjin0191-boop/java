package day04;

public class For09 {

	public static void main(String[] args) {
		// 이중for문
		/* ***** > 한줄에 5개 5줄
		/* ***** > 한줄에 5개 5줄
		/* ***** > 한줄에 5개 5줄
		/* ***** > 한줄에 5개 5줄
		 * 
		 * */

		for (int i = 1; i <= 5; i++) { //줄
			for (int j = 1; j <= 5; j++) { // 별 개수
				System.out.print("*");
			}
			System.out.println(); // 줄바꿈
		}
		
		/* *
		 * **
		 * ***
		 * ****
		 * *****
		 * */
		
		
		System.out.println("----------------");
		
		for (int i =1; i<=5; i++) {
			for (int j=1; j<=i; j++) {	// i번째 줄에 별을 i개 찍는다
				System.out.print("*");
			}
			System.out.println();
		}
		
		/* *****
		 * ****
		 * ***
		 * **
		 * *
		 * */
		
		/*
		 * 1번째 줄에 5개 6-1
		 * 2번째 줄에 4개 6-2
		 * 3번째 줄에 3개 6-3
		 * 4번째 줄에 2개 6-4
		 * 5번째 줄에 1개 6-5
		 */
		
		for (int i =1; i<=5; i++) {
			for (int j=1; j<=(6-i); j++) {	// i번째 줄에 별을 i개 찍는다
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------");
		
		/* 
		 * * 
		 * **
		 * ***
		 * **
		 * *
		 * 
		 * 
		 */
		for (int i =1; i<=3; i++) {
			for (int j=1; j<=i; j++) {	
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i =1; i<=2; i++) {
			for (int j=1; j<=(3-i); j++) {	
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}

}
