package com.helloworld.study;

import java.util.Scanner;

public class Mao {
	
	private static Scanner in;

	public static void main(String[] args) {
		setIn(new Scanner(System.in));
		int foot;
		int inch;
		foot=in.nextInt();
		inch=in.nextInt();
		System.out.println((foot+inch/12.0)*0.3048);
		
		
		
		
//		System.out.println("heiio.world");
	}

	public static Scanner getIn() {
		return in;
	}

	public static void setIn(Scanner in) {
		Mao.in = in;
	}

}
