package kr.java.chapter5;

import java.util.Arrays;

public class ArrayEx3 {

	public static void main(String[] args) {


		// 2 x 3 硅凯 : 青快急
		
		int[][] arr = new int [2][3];
		
		System.out.println("青: " + arr.length);
		System.out.println("青: " + arr[0].length);
		System.out.println("青: " + arr[1].length);
		
		for(int i = 0; i<arr.length; i++)
		{
			for(int j = 0; j<arr[0].length; j++)
			{
				arr[i][j] = 1;
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
