package kr.java.homework;

import java.util.Scanner;

public class homework05213 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("자연수를 입력하시오 : ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++)
		{
			for(int j = n; j > i+1; j--) // 공백 출력
			{
				System.out.print("\t");
			}
			for(int j = 0; j <= i; j++) // 숫자 출력
			{
				System.out.print(j+1);
				System.out.print("\t");
			}
			System.out.println();
		}
	}

}
