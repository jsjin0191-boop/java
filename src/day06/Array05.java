package day06;

import java.util.Arrays;

public class Array05 {

	public static void main(String[] args) {
		/* 10개의 숫자를 가지는 배열 생성
		 * 1~50까지 랜덤수를 배열에 저장 => 출력
		 * 최대, 최소, 합계, 평균 출력
		 * */ 

		
//		 int arr[]=new int[10];
//		 
//		 for(int i=0; i<arr.length; i++) {
//			 arr[i]=(int) (Math.random()*50)+1;
//			
//		 }
//		 
//		 System.out.println(Arrays.toString(arr));
//		 
//			int sum = 0;
//			double avg = 0;
//			int max = arr[0];
//			int min = arr[0];
//			
//			for (int i = 0; i < arr.length; i++) {
//				sum = sum + arr[i];
//				max = Math.max(max, arr[i]);
//				min = Math.min(min, arr[i]);
//			}
//			
//			avg = sum / (double) arr.length;
//			
//			System.out.println("점수합계는" + sum + "이고" + "" + "평균점수는" + avg + "입니다.");
//			System.out.println("최대값은" + max + "입니다.");
//			System.out.println("최소값은" + min + "입니다.");
			
			
			
			
		/* 10개의 숫자를 가지는 배열 생성
		 * 1~50까지 랜덤수를 배열에 저장 => 출력
		 * 최대, 최소, 합계, 평균 출력
		 * */ 
		
		int arr[]= new int[10];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i]=(int)(Math.random()*50)+1;
		}
		System.out.println(Arrays.toString(arr));
		
		
		int max = arr[0];
		int min = arr[0];
		int sum = 0;
		double avg = 0;
		
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		avg = sum / (double) arr.length;
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			

			
				
			
		 
		 
		 
		 
		 
	}

}
