package kr.java.homework;

import java.util.Scanner;

public class homework05212 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[100];
		int[] num2 = new int[100];
		
		System.out.println("100개의 정수를 입력하시오."+"\n"+"(입력을 그만하시려면 0을 입력하시오.)");
		for(int i = 0; i < 100; i++)
		{
			
			num[i] = sc.nextInt();
			if(num[i] == 0)
			{
				for(int j = 0; j < i ; j++)
				{
					num2[j] = num[i-j-1];
					System.out.print(num2[j] + " ");
				}
				break;
			}
		}
	}

}
