package ex.java.input;

import java.util.Scanner;

public class ArrayTest1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int max = 0;
		
		for(int i=0; i<args.length; i++)
		{
			if(Integer.parseInt(args[i]) > max)
			{
				max = Integer.parseInt(args[i]);
			}
		}
		
		System.out.println("제일 큰 수 : " + max);
		
		max = 0;
		int sum = 0;
		int avg = 0;
		while(true)
		{
			if(max%2 == 0 || max == 0)
			{
				sum += Integer.parseInt(args[max]);
				avg++;
			}
			max++;
			if(max == args.length)
				break;
		}
		System.out.println();
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + sum/avg);
		
	}

}
