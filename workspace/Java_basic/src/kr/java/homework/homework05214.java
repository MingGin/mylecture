package kr.java.homework;

import java.util.Scanner;

public class homework05214 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[100];
		int sum0 = 0, sum1 = 0, sum2 = 0, sum3 = 0, sum4 = 0
		, sum5 = 0, sum6 = 0, sum7 = 0, sum8 = 0, sum9 = 0;
		
		System.out.println("자연수를 입력하시오 : ");
		
		for(int i = 0; i < num.length; i++)
		{
			num[i] = sc.nextInt();
			if(num[i] == 0)
			{
				for(int j = 0; j < i; j++)
				{
					if(num[j]/10 == 0)
						sum0++;
					else if(num[j]/10 == 1)
						sum1++;
					else if(num[j]/10 == 2)
						sum2++;
					else if(num[j]/10 == 3)
						sum3++;
					else if(num[j]/10 == 4)
						sum4++;
					else if(num[j]/10 == 5)
						sum5++;
					else if(num[j]/10 == 6)
						sum6++;
					else if(num[j]/10 == 7)
						sum7++;
					else if(num[j]/10 == 8)
						sum8++;
					else if(num[j]/10 == 9)
						sum9++;
				}
				if(sum0 != 0)
					System.out.println("0 : "+sum0);
				if(sum1 != 0)
					System.out.println("1 : "+sum1);
				if(sum2 != 0)
					System.out.println("2 : "+sum2);
				if(sum3 != 0)
					System.out.println("3 : "+sum3);
				if(sum4 != 0)
					System.out.println("4 : "+sum4);
				if(sum5 != 0)
					System.out.println("5 : "+sum5);
				if(sum6 != 0)
					System.out.println("6 : "+sum6);
				if(sum7 != 0)
					System.out.println("7 : "+sum7);
				if(sum8 != 0)
					System.out.println("8 : "+sum8);
				if(sum9 != 0)
					System.out.println("9 : "+sum9);
				break;
			}
		}
	}
}
