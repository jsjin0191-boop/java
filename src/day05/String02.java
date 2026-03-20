package day05;

import java.util.Arrays;

public class String02 {

	public static void main(String[] args) {
		// String method
		
		// toLowerCase() / toUpperCase() : 소문자변환 / 대문자변환
		System.out.println("---toLowerCase / toUpperCase---");
		System.out.println("ABC".toLowerCase()); // 대문자로
		System.out.println("abc".toUpperCase()); // 소문자로
		
		// isEmpty() : 값이 비었는지 확인(공백도 있는걸로 간주) true / false
		System.out.println("---isEmpty()---");
		System.out.println("".isEmpty());
		
		// is Blank() : 값이 비었는지 확인(공백은 빈것으로 간주)
		System.out.println("---isBlank---");
		System.out.println("2".isBlank());
		
		// trim() : 불필요한 공백제거
		System.out.println("---trim---");
		System.out.println("    abc    ".trim());
		
		// replace() : 글자를 치환(변환)
		System.out.println("---replace---");
		String str = "apple, banana, kiwi, orange";
		// 2026-03-20 => 2026/03/26
		System.out.println(str.replace(",","/"));
		
		// split : 특정 값을 기준으로 나누기 => 배열도 리턴
		System.out.println("---split---");
		String[] strArr = str.split(", ");
		
		System.out.println("---ArraysToString---");
		System.out.println(Arrays.toString(strArr));
		
		
		System.out.println("---향상된for문---");
		for(String tmp : strArr) {
			System.out.println(tmp);
		}
		
		System.out.println("---일반형for문---");
		for(int i=0; i<strArr.length;i++) {
			System.out.println(strArr[i]);
		}
		
		// 문자를 숫자로 Integer.parseInt()
		String num = "123";
		int num2 = Integer.parseInt(num);
		System.out.println(num2);
		
		// 숫자를 문자로 변경 string.valueof()
		String num3 = String.valueOf(num2);
		System.out.println(num3);
		
		// instanceof : 같은 클래스가 맞는지 확인하는 연산자 (클래스만 가능)
		System.out.println(num3 instanceof String);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
