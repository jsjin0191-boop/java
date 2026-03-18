package day03;

public class While01 {

	public static void main(String[] args) {

		// While문
		/*
		 * for : 반복 횟수가 정해져 있는 경우 사용 while : 실행 횟수가 정해져 있지 않은 경우 사용
		 */

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

		int count = 1;
		while (count <= 10) {
			System.out.println(count);
			// 반복 변수가 종료되기 위한 조건을 포함해야 함.
			count++;

			// 종료 조건
			if (count == 5) {
				break; // 반복문 빠져나가기
			}
		}

		System.out.println("-----------------");

		count = 1;
		while (count <= 10) {
			System.out.println(count + "");
			count++;
		}

		System.out.println("-----------------");

		// while로 짝수만 출력

		count = 1;
		while (count <= 10) {
//			System.out.println("(42번째 줄) count: "+count);
//			System.out.println("(43번째 줄) 짝수인가?: "+(count % 2 == 0));
			if (count % 2 == 0) {
				System.out.println(count + "");

			}
			count++;
//			System.out.println("(49번째 줄)---------");
		}

		System.out.println("-----------------");
		count = 1;
		while (true) {
//			System.out.println("(42번째 줄) count: "+count);
//			System.out.println("(43번째 줄) 짝수인가?: "+(count % 2 == 0));
			if (count % 2 == 0) {
				System.out.println(count + "");
			}
			if (count > 10) {
				break;
			}
			count++;
//			System.out.println("(49번째 줄)---------");
		}

	}
}