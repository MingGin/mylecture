package kr.java.homework;

import java.util.Scanner;

public class homework05201 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력하시오.");
		int n = sc.nextInt();
		
		for(int i = n; i >= 1; i--)
		{
			for(int j = 0; j < n-i; j++)
			{
				System.out.print(" ");
			}
			for(int j = 0; j < i*2-1 ; j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 2; i <= n; i++)
		{
			for(int j = 0; j < n-i; j++)
			{
				System.out.print(" ");
			}
			for(int j = 0; j < i*2-1 ; j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
