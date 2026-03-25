package day08;

public class MethodEx02 {
	/*
	 * 1.배열을 매개변수로 받아 출력하는 메서드 매개변수 : 배열 => int arr[] 리턴타입 : void
	 */
	public void agt(int arr[]) {
		if (arr.length > 0) {
			for (int i = 0; i < arr.length - 1; i++) {
				System.out.print(arr[i] + ", ");

			}
			System.out.println(arr[arr.length - 1]);
		}
	}

	/*
	 * 2.배열을 매개변수로 받아 오름차순으로 정렬하는 메서드 매개변수 : 배열 => int arr[] 리턴타입 : void
	 */

	public void order(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
				}
			}
		}
	}

	/*
	 * 3. 배열을 매개변수로 받아 합계, 평균, 최대, 최소값을 출력하는 메서드 매개변수 : 배열 => int arr[] 리턴타입 : void
	 */
	public void totalNum(int arr[]) {
		int sum = 0;
		double avg = 0;
		int max = arr[0];
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			max = Math.max(max, arr[i]);
			min = Math.min(min, arr[i]);
		}
		avg = sum / (double) arr.length;
		System.out.printf("합계:%d\t\t평균:%.2f%n최대:%d\t\t최소:%d%n", sum, avg, max, min);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 78, 85, 49, 68, 59, 63, 26, 59, 98, 84, 75, 43, 52 };

		// 메서드 생성
		/*
		 * 1.배열을 매개변수로 받아 출력하는 메서드 
		 * 2.배열을 매개변수로 받아 오름차순으로 정렬하는 메서드 
		 * 3. 배열을 매개변수로 받아 합계,평균, 최대, 최소값을 출력하는 메서드
		 */
		MethodEx02 me2 = new MethodEx02();
		me2.agt(arr);
		me2.order(arr); // 정렬만
		me2.agt(arr);
		me2.totalNum(arr);

	}

}
