package day07;

		import java.util.Scanner;

		public class Exam01 {

			public static void main(String[] args) {
				/*
				 *  숫자를 입력받아 입력받은 숫자의 합계와 평균을 출력
				 *  12345 => 1+2+3+4+5 합계 평균
				 *  123456789 => 1+2+2+4+5+5+7+8+9 합계 평균
				 *  반복 (0 또는 음수를 입력하면 종료)
				*/
				
				Scanner scan = new Scanner(System.in);

				while (true) {
					System.out.println("숫자를 입력하세요 (0 또는 음수 입력 시 종료): ");
					int num = scan.nextInt();

					if (num <= 0) {
						System.out.println("프로그램을 종료합니다.");
						break;
					}

					// 1. Integer를 사용하여 숫자를 문자열로 변환
					String strNum = Integer.toString(num);

					// 2. 문자열의 길이를 통해 배열 크기 결정
					int count = strNum.length();
					int[] arr = new int[count];

					int sum = 0;
					System.out.print("과정: ");

					// 3. 일반 for 문으로 각 자릿수 추출 및 배열 채우기
					for (int i = 0; i < count; i++) {
						// charAt(i)로 한 글자씩 꺼내서 숫자로 변환
						arr[i] = strNum.charAt(i) - '0';
						sum += arr[i];

						// 출력 과정 만들기
						System.out.print(arr[i]);
						if (i < count - 1) {
							System.out.print(" + ");
						}
					}

					double avg = (double) sum / count;
					System.out.println();
					System.out.println("합계: " + sum);
					System.out.printf("평균: %.2f\n", avg);
				}
				scan.close();
			}
		}