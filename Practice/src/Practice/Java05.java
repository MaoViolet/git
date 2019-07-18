package Practice;

import java.util.Scanner;

public class Java05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double RATE = 8.25;
		final int STANDARD = 40;
		double pay =0.0;
		Scanner in =new Scanner(System.in);
		System.out.print("Enter the number of hours worked:");
		int hours =in.nextInt();
		System.out.println();
		if (hours > STANDARD )
			pay = STANDARD*RATE + (hours-STANDARD)*(RATE*1.5);
		else
			pay = hours*RATE;
		System.out.println("Gross earning:"+pay);
	}

}
