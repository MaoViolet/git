package Practice;

import java.util.Scanner;

public class Java04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		
		System.out.println("������Ʊ��:");
		int amount = in.nextInt();
		System.out.println("��������:");
		int price = in.nextInt();
		System.out.println(amount+"-"+price+"="+(amount-price));

	}

}
