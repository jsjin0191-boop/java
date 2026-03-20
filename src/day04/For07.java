package day04;

public class For07 {

	public static void main(String[] args) {
		// 소수 : 1과 자기자신만을 약수로 가지는 수 (약수가 2개인 수)
		// 2 3 5 7 11 13...
		
		// 2~100까지 중 소수를 출력(2중 for문)
		// 2~100까지 루프
		// 2~자기자신수(i) 전까지 루프
		// 나누어 떨어지는 수가 없으면 출력
		
		for (int i =2; i<=100; i++) {	// 2-100까지의 수 중
			int count=0; // 1과 자기자신을 제외한 약수의 개수
			// i 의 수가 num가 됨.
			for (int j =2; j<i; j++) { // 1과 자기 자신을 뺀 범위 (약수가 0개여야 소수)
				if(i%j==0) {	// i가 j로 나누어 떨어진다면 = j가 i의 약수라면
					count++;	// 약수의 개수를 하나 증가시킨다
				}
			}
			if(count == 0) {	// 1과 자기 자신을 뺀 수 중에 i의 약수 (나누어 떨어지는 수) 가 없으면
				System.out.println(i);	// i는 소수이므로 출력한다
			}
		}
		System.out.println("-------------------");
		// num = 3 num가 소수인지 아닌지 판별
		// 2~가기자신수(i) 전까지 루프
		// 나누어 떨어지는 수가 없으면 출력
		
		
		int num = 3;
		int count = 0;
		
		for (int i = 1; i<=num ; i++) { // 1과 자기자신을 포함한 범위 (약수가 2개여아 소수)
			if(num % i == 0) {
				count++;
			}
		}
//		System.out.println(count);
		if(count != 2) {
			System.out.println("소수가 아닙니다.");
		}else {
			System.out.println("소수입니다.");
		}
	}

}
