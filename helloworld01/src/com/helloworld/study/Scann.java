package com.helloworld.study;

import java.util.Scanner;

public class Scann{
	
	public static void main(String[] args) {
//		System.out.println("Hello world");
//		System.out.println("����");
		System.out.println("��ã��ҽ�ë�̺ƣ��ܸ�����ʶ��");
		System.out.println("С��㣬��ѧ��");
		
		
		
//		int A =0;
//		int S;
//			
		Scanner in = new Scanner(System.in);
		int A =(int)(Math.random()*100+1);
		int B;
		int count=0;
		do {
			B =in.nextInt();
//			B=((Object) in).nextInt();
			count=count+1;
			if (B>A)
			{
				System.out.println("ƫ��");
				
				
			}
			else if (B<A)
			{
				System.out.println("ƫС");
			}
		}while(B!=A);
		System.out.println("��ϲ�㣬��¶���"+count+"��");
		}	
			
			
			
	
//		if(A <=100)
//		{
//			A=A+1;
//			S=S+A;
//		}
//		System.out.println("S="+S);
//	}
	

}
