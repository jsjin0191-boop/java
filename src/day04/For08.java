package day04;

public class For08 {

	public static void main(String[] args) {
		// 구구단 2~9단까지 출력
		// For03 구구단 예제 참고

		// 각단의 모양을 옆으로 나오게

		for (int dan = 2; dan <= 9; dan++) {
			for (int i = 1; i <= 9; i++) {
				System.out.print(dan + "*" + i + "=" + (dan * i) + " ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();
		
//		for (int i = 1; i <= 9; i++) {
//			for (int dan = 2; dan <= 9; dan++) {
//				System.out.print(dan + "*" + i + "=" + (dan * i) + " ");
//			}
//			System.out.println();
//		}

		for (int dan = 1; dan <= 9; dan++) {
			for (int i = 2; i <= 9; i++) {
				System.out.print(i + "*" + dan + "=" + (dan * i) + " ");
			}
			System.out.println();
		}
		
	}

}
