package Practice;

import java.util.Scanner;

public class Java03 {

	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		int amount;
		int price;
		System.out.print("������Ʊ�棺");
		amount =in.nextInt();
		System.out.print("�������");
		price =in.nextInt();
		System.out.println(amount+"-"+price+"="+(amount-price));
	}
	

}
