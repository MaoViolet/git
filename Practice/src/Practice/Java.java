package Practice;

import java.io.Serializable;
import java.util.Scanner;

public class Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world");
		Scanner in =new Scanner(System.in);
		Serializable price;
		price = in.next();
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("100-");
		stringBuilder.append(price);
		stringBuilder.append("=");
		stringBuilder.append(100-price);
		System.out.println(stringBuilder.toString());
		
	}

}
