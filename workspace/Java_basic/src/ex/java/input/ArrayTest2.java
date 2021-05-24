package ex.java.input;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] str = new String[10];
		
		
		System.out.println(Arrays.toString(args));
		for(int i = args.length-1; i < args.length; i--)
		{
			int y= 0;
			if(y<10)
			{
				str[y] = args[i];
				System.out.print(str[y]+", ");
				y++;
			}
			if(i == 0)
				break;
		}
		
		

	}

}
