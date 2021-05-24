package kr.java.homework;

import java.util.Scanner;

public class homework05203 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("자연수를 입력하시오.");
		int n = sc.nextInt();
		int sum = 0;
		int cnt = 0;
		
		for(int i = 0; i<=n; i++)
		{
			if(i%2 == 1)
			{
				sum += i;
				cnt ++;
			}
		}
		System.out.println("합 : " + sum);
		System.out.println("개수 : " + cnt);
		

	}

}
