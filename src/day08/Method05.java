package day08;

public class Method05 {
	
	/* 최대공약수
	 * 매개변수 : int num1, int num2
	 * 리턴타입 : int
	 * 메서드명 : gcd
	 * 
	 * */
	public int gcd(int num1, int num2) {
		for (int i = num2; i >= 1; i--) {
			if (num1 % i == 0 && num2 % i == 0) {
				return i;
			}
		}
		return 1;
	}
	/* 최소공배수
	 * 매개변수 : int num1, int num2
	 * 리턴타입 : int
	 * 메서드명 : lcm
	 * */

	
	public int lcm(int num1, int num2) {
//		for (int i = num1;; i+=num1) {
//			if (i % num2 == 0) {
//				return i;
//			}
//		}
//		
		// 최소 공배수는 두 수를 곱해서 최대공약수로 나누면
		if (num1 == 0 || num2 == 0) {
			return 0;
		}
		return (num1 * num2) / gcd(num1, num2);
	}
	
	
	
	
	

	public static void main(String[] args) {
		// 최대공약수와 최소공배수 출력 메서드
		int num1 = 10;
		int num2 = 30;

		Method05 m5 = new Method05();
		System.out.println(m5.gcd(num1, num2));
		
		System.out.println(m5.lcm(num1, num2));
	}

}
