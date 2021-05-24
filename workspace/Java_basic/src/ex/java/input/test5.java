package ex.java.input;

import java.util.Scanner;

public class test5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하시오.");
		int num = sc.nextInt();
		for(int i = 2; i<=num; i++)
		{
			for(int y = 2; y < i; y++)
			{
				if(i % y == 0)
				{
					continue;
				}
			}
			
		}

	}

}
