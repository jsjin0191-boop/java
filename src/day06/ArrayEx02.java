package day06;

public class ArrayEx02 {

	public static void main(String[] args) {
		// 그림파일만 출력 => jpg. png
		// 없으면 그림파일이 없습니다.

		String[] fileName = { "이것이자바다.java", "java의정석.java", "array.txt", "array.java", "String.txt",
				"StringMethod.jpg", "ArrayMethod.png", "method.jpg", "javaMethod.png" };
//		int count = 0;
//		for (String file : fileName) {
//			int i = file.lastIndexOf(".");
//			String suffix = file.substring(i+1);
//			if (suffix.equals("jpg")||suffix.equals("png")) {
//				count++;
//				System.out.println(file);	
//			}
//		}
//		if(count==0){
//			System.out.println("그림파일이 없습니다.");
//		}else {
//			System.out.println("파일개수:"+count+"개");
//		}

		boolean check = false;
		for (String file : fileName) {
			int i = file.lastIndexOf(".");
			String suffix = file.substring(i + 1);
			if (suffix.equals("jpg") || suffix.equals("png")) {
				check = true;
				System.out.println(file);
			}
		}
		if (!check) {
			System.out.println("그림파일이 없습니다.");
		}

	}

}
