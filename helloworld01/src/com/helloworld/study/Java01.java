package com.helloworld.study;

import java.util.Scanner;

public class Java01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("��ã��ҽ�ë�̺�");
		Scanner in = new Scanner(System.in);
//		System.out.println(in.nextLine());
		int amount;
		int price;
		System.out.print("������Ʊ�棺");
		amount = in.nextInt();
		System.out.print("�������");
		price=in.nextInt();
		System.out.println("�����:"+amount+"-"+price+"="+(amount-price));
		
		
	}

}
