import java.util.Scanner;

/**
 * 验证是不是素数的程序
 * @author 毛程浩
 *
 */
public class m_scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a =in.nextInt();
		boolean isPrime =true;
		if (a == 1)
		{
		isPrime =false;
		
		
		}
		for(int i=2;i<a;i++ )
		{
		if( a % i ==0)	
		{
			isPrime =false;
			break;
		}
		
		}
		if(isPrime)
		{
		System.out.println(a+"是素数");
		}
		else
		{
			System.out.println(a+"不是素数");
		}
		}
		
		
}
