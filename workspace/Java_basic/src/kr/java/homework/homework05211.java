package kr.java.homework;

import java.util.Arrays;
import java.util.Scanner;

public class homework05211 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char [] alpabet = new char[26];
		int cnt = 0;
		for(int i = 0; i < alpabet.length; i++)
		{
			alpabet[i] = (char)(i+65);
		}
		while(true)
		{
			System.out.print("자연수를 입력하시오 : ");
			int n = sc.nextInt();
			
			if(3 <= n && n <= 10)
			{
				for(int i = n; i >= 0; i--) 
				{
					for(int j = 0; j < i; j++) 
					{	
						System.out.print(alpabet[cnt]); // 알파벳 출력문
						cnt++; 
						if(cnt == 26) // 배열수 넘었을때 초기화
							cnt = 0;
					}
					System.out.println();
				}
				break;
			}
			else
				System.out.println("3이상 10이하인 자연수를 입력하시오.");
			System.out.println();
		}
	}

}
