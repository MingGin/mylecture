package kr.java.homework;

import java.util.Arrays;
import java.util.Scanner;

public class homework05215 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] bubble = new int[10];
		int temp = 0;
		
		for(int i = 0; i < bubble.length; i++)
			bubble[i] = sc.nextInt();
		
		for(int i = 0; i < bubble.length; i++)
		{
			for(int j = 0; j < bubble.length-i-1; j++)
			{
			
				if(bubble[j] < bubble[j+1])
				{
					temp = bubble[j];
					bubble[j] = bubble[j+1];
					bubble[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(bubble));
	}

}
