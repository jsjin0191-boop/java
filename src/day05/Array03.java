package day05;

public class Array03 {

	public static void main(String[] args) {
		// 합계와 평균을 구해주세요
		// 최대값, 최소값 출력

		int sum = 0;
		double avg = 0;
		int arr[] = { 60, 23, 65, 16, 86, 35, 56, 25, 9, 34 };
		int max = arr[0];
		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		avg = sum / (double) arr.length;
		System.out.println("점수합계는" + sum + "이고" + "" + "평균점수는" + avg + "입니다.");

		// 52 78
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			} else if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("최대값은" + max + "입니다.");
		System.out.println("최소값은" + min + "입니다.");
		
		// math.max() / math.min()
		
		for (int i = 0; i < arr.length; i++) {
			max = Math.max(max, arr[i]);
			min = Math.min(min, arr[i]);
		}
		System.out.println("최대값은" + max + "입니다.");
		System.out.println("최소값은" + min + "입니다.");
		
		

	}

}
