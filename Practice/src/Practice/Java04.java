package Practice;

import java.util.Scanner;

public class Java04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		
		System.out.println("请输入票面:");
		int amount = in.nextInt();
		System.out.println("请输入金额:");
		int price = in.nextInt();
		System.out.println(amount+"-"+price+"="+(amount-price));

	}

}
