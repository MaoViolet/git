package Practice;

import java.util.Scanner;

public class Java03 {

	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		int amount;
		int price;
		System.out.print("请输入票面：");
		amount =in.nextInt();
		System.out.print("请输入金额：");
		price =in.nextInt();
		System.out.println(amount+"-"+price+"="+(amount-price));
	}
	

}
