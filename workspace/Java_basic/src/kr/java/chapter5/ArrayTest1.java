package kr.java.chapter5;

import java.util.Scanner;

public class ArrayTest1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] name = new String[10];
		
		int mathSum = 0;
		int sciSum = 0;
		int avg = 0;
		
		boolean T;
		
		for(int i = 0; i<10; i++)
		{
			
			System.out.print("성적입력) ");
			String result = sc.nextLine();
			
			name [i] = result;
			String[] data = name[i].split("/");
			System.out.println(i+1+"/10");
			if(data[0].contains("홍"))
			{
				mathSum += Integer.parseInt(data[1]);
				sciSum += Integer.parseInt(data[2]);	
			}
			
		}
		System.out.println();
		System.out.println("수학: " + mathSum + "/" + mathSum / name.length);
		System.out.println("과학: " + sciSum + "/" + sciSum / name.length);

	}

}
