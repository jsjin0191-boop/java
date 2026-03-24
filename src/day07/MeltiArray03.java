package day07;

import java.util.Random;
import java.util.Scanner;

public class MeltiArray03 {

	public static void main(String[] args) {
		// 성적표
		/* 성적산출인원 > 3(입력)
		 * 이름 국어 영어 수학 합계 평균 등수 \t
		 * hong 89 85 78 00 00 00 
		 * kim 89 85 78 00 00 00 
		 * lee 89 85 78 00 00 00  
		 * 
		 * 
		 * 이름, 국어, 영어, 수학을 입력받아 합계, 평균, 등수
		 * */
		
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("성적산출 인원 >.");
		int count = scan.nextInt();
		
		String[]name = new String[count];
		
		int data[][]= new int[count][5];
		double data1[]= new double[count];
		
		for(int i=0; i<count; i++) {
			System.out.println((i+1)+"번째 학생 이름 입력 :");
			name[i]=scan.next();
			data[i][0]=random.nextInt(71)+30; //국어
			data[i][1]=random.nextInt(71)+30; //영어
			data[i][2]=random.nextInt(71)+30; //수학
			
			data[i][3]=data[i][0]+data[i][1]+data[i][2]; //합계
			data1[i]=(double)data[i][3] / count; //평균
			
			data[i][4]=1; //등수
		}
		// 등수 = 1 + (나보다 점수(평균)가 더 높은 사람의 수)
		
		for(int i=0; i<count; i++) { 		// 등수를 구하고자 하는 학생의 번호
			for(int j=0; j<count; j++) {	// 비교하는 학생의 번호
				if(data1[i] < data1[j]) {
					data[i][4]++;
				}
			}
		}
			
		
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균\t등수\t");
		for (int i = 0; i < count; i++) {
			System.out.print(name[i] + "\t");
			for (int j = 0; j < 4; j++) {
				System.out.print(data[i][j] + "\t");
			}
			System.out.printf("%.1f\t", data1[i]);
			//System.out.print(data1[i] + "\t");
			System.out.println(data[i][4]);

		}
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		scan.close();
			
		
	}

}
