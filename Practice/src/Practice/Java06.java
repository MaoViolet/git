package Practice;
import java.util.Scanner;
/**
 * ��������
 * @author ë�̺�
 *2019.08.21
 */
public class Java06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		final int MINOR =35;
//		System.out.print("������������䣺");
//		Scanner in = new Scanner(System.in);
//int age = in.nextInt();
//System.out.print("���������"+age);
//if (age <MINOR )
//{
//	System.out.println("���������õ�");
//	
//}
//	System.out.println("��������������ľ������磬�ú���ϧ�ɡ�");	
//	}
		Scanner in =new Scanner(System.in);
		int[] numbles =new int[10];
		int x ;
		x=in.nextInt();
		while(x != -1)
		{
			if(x>=0&& x<=9 )
			{
				numbles[x]++;
//			
			}
			x=in.nextInt();
		}
		for(int i=0;i<numbles.length;i++)
		{
			System.out.println(i+":"+numbles[i]);
		}
	}
}
