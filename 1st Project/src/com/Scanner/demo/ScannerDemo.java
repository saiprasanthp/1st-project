package com.Scanner.demo;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int i=sc.nextInt();
		System.out.println(i);
		double d=sc.nextDouble();
		System.out.println(d);
		sc.close();
	}

}
