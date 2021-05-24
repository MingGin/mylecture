package kr.java.chapter5;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx2 {

	public static void main(String[] args) {
		String[] strArray = new String[] {"1","2","3","4","5","6","7","8","9","10"};
		
		System.out.println(strArray.toString());
		System.out.println(strArray[9]);
		
		for(int i = 0; i<strArray.length; i++)
		{	
			int t = i * Integer.parseInt(strArray[i]);
			strArray[i] = t + " ";
			
			System.out.print(strArray[i]);
		}
		
		strArray[5] = strArray[8];

		// java.util.Arrays
		System.out.println();
		System.out.println(Arrays.toString(strArray));
		
	}

}
