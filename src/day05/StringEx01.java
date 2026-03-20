package day05;

public class StringEx01 {

	public static void main(String[] args) {
		// 주민등록번호를 참고하여 생년월일과 나이 성별을 출력
		//String regNum = "990101-1234567"; //1900년대 => 1(남) 2(여)
		 String regNum = "020101-3234567"; //2000년대 => 3(남) 4(여)
		int today = 2026;
		
		/* 출력결과
		 * 생년월일 : 990101
		 * 성별 : 남
		 * 나이 : 30
		 * */
		
		
		int i = regNum.indexOf("-");
		String birth = regNum.substring(0, i);

		System.out.println("생년월일:"+birth);
		
		int num = Integer.parseInt(regNum.substring(7, 8));// regNum 성별 코드
		System.out.println("성별:"+((num ==1 || num==3)?"남":"여"));
		
		int num2 = (num == 1 || num ==2)? 1900 : 2000;  // num값이 1 2 면 1900년대 num값이 3 4 면 2000년대
		int num3 = Integer.parseInt(regNum.substring(0, 2)); //년도 뒤 두자리수 추출
		int num4  = num2+num3; // 태어난 연도
		int age = today - num4;
		System.out.println("나이는:"+age);

	}

}
 