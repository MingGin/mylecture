package ex.java.input;

import java.util.Scanner;

public class test6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("N값을 입력하세요 : ");
		int n = sc.nextInt();
		System.out.println("N의 값 : " + n);
		long result = 0;
		
		for(int i = 1; i>=1; i++)
		{
			if(i%2 == 0)
			{
				result += (long) Math.pow(i, i-1);
			}
		}
		System.out.println("합계 : " + result);

	}

}
