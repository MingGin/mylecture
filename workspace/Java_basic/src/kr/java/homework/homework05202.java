package kr.java.homework;

import java.util.Scanner;

public class homework05202 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수를 입력하시오.");
		int n = sc.nextInt();
		int num = 1;
		
		int[][] arr = new int[n][n];
		
			
			for(int i = 0; i<n; i++)
			{
				for(int j = 0; j<n; j++)//j 10미만 홀수 값 1 3 5 7 9
				{	
					arr[i][j] = num;
					num = num+2;
					if(num > 10)
						num = 1;
					
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}

	}

}
