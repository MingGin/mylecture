package kr.java.homework;

import java.util.Scanner;

public class homework05212 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[100];
		int[] num2 = new int[100];
		
		System.out.println("100���� ������ �Է��Ͻÿ�."+"\n"+"(�Է��� �׸��Ͻ÷��� 0�� �Է��Ͻÿ�.)");
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