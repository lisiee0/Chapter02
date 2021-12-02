package com.javaex.ex19;

import java.util.Scanner;

public class ArithException2 {

	public static void main(String[] args) {
		
		double result;
		int num;
		
		Scanner sc= new Scanner(System.in);
		
		num= sc.nextInt();
		
		try {
			result= 100/num;
			System.out.println(result);
		}
		catch(ArithmeticException e) {
			System.out.println("catch 영역");
		}
		finally {
			System.out.println("finally 영역");
		}
		
		
		
		sc.close();

	}

}
