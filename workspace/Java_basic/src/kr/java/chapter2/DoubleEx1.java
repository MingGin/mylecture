package kr.java.chapter2;

public class DoubleEx1 {

	public static void main(String[] args) {
		double dnum = 3.14;
		float fnum = 3.14F;
		
		System.out.println(dnum);
		System.out.println(fnum);
		
		// minus
		
		double dnum2 = -3.14;
		float fnum2 = -3.14F;
		
		System.out.println(dnum2);
		System.out.println(fnum2);
		
		// float to int
		System.out.println("double2long: " + (long)dnum2);
		System.out.println("double2int: " + (int)dnum2);
		System.out.println("double2short: " + (short)dnum2);
		System.out.println("double2byte: " + (byte)dnum2);
		
		// int to float/double
		
//		int i1 = 32768;
		int i2 = 2147483647;
//		int i3 = -2147483648;
		
		float fnum3 = i2;
		double dnum3 = i2;
		
		String result = String.format("%.1f", fnum3);
		
		System.out.println("int2flaot: " + result);
		System.out.println("int2double: " + (double)i2);
		System.out.println("int2float: " + fnum3);
		System.out.println("int2double: " + dnum3);
	}

}
