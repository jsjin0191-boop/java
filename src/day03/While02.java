package day03;

public class While02 {

	public static void main(String[] args) {
		// 1~10까지의 합계 while 출력
		int sum = 0;
		int count = 1;
		while (count <= 10) {
			sum = sum + count;
			count++;
		}
		System.out.println("1~10까지 합계:"+sum);

		// 1~10까지의 짝수 합계 while 출력

		sum = 0;
		count = 1;
		while (count <= 10) {
			if (count % 2 == 0) {
			sum = sum + count;
			}
			count++;
		}
		System.out.println("짝수합계:"+sum);

	}

}
