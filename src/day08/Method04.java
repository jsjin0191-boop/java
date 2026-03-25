package day08;

public class Method04 {

	/* 정수 하나를 매개변수로 입력받아 해당 정수의 구구단을 출력
	 * 매개변수 : 
	 * 리턴타입 :
	 * 메서드명 : 
	 * */
	public void print(int dan) {
		for (int i = 1; i <= 9; i++) {
			System.out.print(dan + "*" + i + "=" + (dan * i) + " \n");
		}
	}
	
	public static void main(String[] args) {
		// 구구단 출력 메서드 연습
		Method04 m4 = new Method04();
		int num = 5;
		m4.print(num);
		
		System.out.println("------");
		for (int i = 2; i <= 9; i++) {
			System.out.println("--" + i + "단--");
			m4.print(i);
		}

	}

}
