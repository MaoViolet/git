package Practice;
/**
 * ��������
 * ��д�ˣ�ë�̺�
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
			System.out.println(x+"�ǵ�"+(loc+1)+"��");
		}
		else
		{
			System.out.println("��������");
		}
				
		
		
		
//		
//		System.out.println("������Ʊ��:");
//		int amount = in.nextInt();
//		System.out.println("��������:");
//		int price = in.nextInt();
//		System.out.println(amount+"-"+price+"="+(amount-price));
		

	}

}
