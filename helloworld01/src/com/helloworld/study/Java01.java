package com.helloworld.study;

import java.util.Scanner;

public class Java01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("你好，我叫毛程浩");
		Scanner in = new Scanner(System.in);
//		System.out.println(in.nextLine());
		int amount;
		int price;
		System.out.print("请输入票面：");
		amount = in.nextInt();
		System.out.print("请输入金额：");
		price=in.nextInt();
		System.out.println("余额是:"+amount+"-"+price+"="+(amount-price));
		
		
	}

}
