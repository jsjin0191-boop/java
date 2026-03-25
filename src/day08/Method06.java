package day08;

public class Method06 {

	// 멤버변수 자리

	/*
	 * 1. 랜덤수(0~100) 정수 5개를 담는 배열을 생성하여 리턴하는 메서드 => int[] 매개변수 : 없음 리턴타입 : int[] *
	 */
	public int[] random() {
		int arr[] = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100) + 1;
		}
		return arr;
	}

	/*
	 * 2. 정수 배열을 매개변수로 받아 평균값을 리턴하는 메서드 매개변수 : int[]num 리턴타입 : double
	 */

	public double avg(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum / (double) arr.length;
	}

	/*
	 * 3. 정수 배열을 매개변수로 받아 출력하는 메서드 매개변수 : int[]num 리턴타입 : void
	 */
	public void print(int[] num) {
		System.out.print("[");
		if (num.length > 0) {
			for (int i = 0; i < num.length - 1; i++) {
				System.out.print(num[i] + ", ");
			}
			System.out.print(num[num.length - 1]);
		}
		System.out.println("]");
	}

	public static void main(String[] args) {
		// 메서드 배열 활용
		/*
		 * 1. 랜덤수(0~100) 정수 5개를 담는 배열을 생성하여 리턴하는 메서드 => int[] 
		 * 2. 정수 배열을 매개변수로 받아 평균값을 리턴하는 메서드 
		 * 3. 정수 배열을 매개변수로 받아 출력하는 메서드
		 */

		Method06 m6 = new Method06();
		// 메서드 호출
		int[] arr2 = m6.random();
		//평균 호출 후 => 출력
//	System.out.println(Arrays.toString(arr2));
		System.out.println(m6.avg(arr2));
		m6.print(arr2);
	}
}
