package com.helloworld.study;

import java.util.Scanner;

public class Scann{
	
	public static void main(String[] args) {
//		System.out.println("Hello world");
//		System.out.println("您好");
		System.out.println("你好，我叫毛程浩，很高兴认识你");
		System.out.println("小姐姐，开学见");
		
		
		
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
				System.out.println("偏大");
				
				
			}
			else if (B<A)
			{
				System.out.println("偏小");
			}
		}while(B!=A);
		System.out.println("恭喜你，你猜对啦"+count+"次");
		}	
			
			
			
	
//		if(A <=100)
//		{
//			A=A+1;
//			S=S+A;
//		}
//		System.out.println("S="+S);
//	}
	

}
