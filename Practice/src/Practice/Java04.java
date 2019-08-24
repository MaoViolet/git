package Practice;
/**
 * 遍历数组
 * 编写人：毛程浩
 * 2019.08.24
 */

import java.util.Scanner;

public class Java04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int[] data = {2,3,4,5,7,9,6,23,54};
		int x = in.nextInt();
		int loc = -1;
		for(int i=0; i<data.length;i++)
		{
			if(x==data[i])
			{
				loc = i;
				break;
			}
		}
		if(loc<-1)
		{
			System.out.println(x+"是第"+(loc+1)+"个");
		}
		else
		{
			System.out.println("不在其中");
		}
				
		
		
		
//		
//		System.out.println("请输入票面:");
//		int amount = in.nextInt();
//		System.out.println("请输入金额:");
//		int price = in.nextInt();
//		System.out.println(amount+"-"+price+"="+(amount-price));
		

	}

}
