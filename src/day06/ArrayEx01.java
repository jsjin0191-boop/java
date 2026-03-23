package day06;

import java.util.Scanner;

public class ArrayEx01 {

	public static void main(String[] args) {
		// 파일명을 저장하고 있는 배열
		// 검색어를 입력하면 해당 검색어를 포함하고 있는 파일을 출력
		// 검색어를 포함하는 파일이 존재하지 않는다면
		// 일치하는 항목이 없습니다. => 출력

		String[] fileName = { "이것이자바다.java", "java의정석.java", "array.txt", "array.java", "String.txt",
				"StringMethod.jpg", "ArrayMethod.png", "method.jpg", "javaMethod.png" };

		Scanner scan = new Scanner(System.in);

		System.out.println("검색어를 입력하세요.>");
		String search = scan.nextLine().toLowerCase();

		// 대소문자 구분없이 검색

		// 1.검색어 입력받기
		int count = 0;
		for (String file : fileName) {
			if (file.toLowerCase().contains(search)) { // 검색어를 포함한 파일을 1개 찾았을 때
				count++;
				System.out.println(file);
			}
		}
		if (count == 0) {
			System.out.println("일치하는 항목이 없습니다.");
		}else {
			
			System.out.println("검색결과:" + count + "개");
		}

		 scan.close();

	}

}
