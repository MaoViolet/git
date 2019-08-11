import java.util.Scanner;

/**
 * 运用数组算平均数
 * @author 毛程浩
 *
 */
public class m_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int x;
		double sum =0;
		int cnt =0;
		int[] numbles =new int[100];
		x = in.nextInt();
		while(x!=1)
		{
			numbles[cnt] = x;
			sum += x;
			cnt++;
			x =in.nextInt();
		
			
		}
		if(cnt>0)
		{
			double average = sum/cnt;
			for(int i=0;i<cnt;i++)
			{
				if(numbles[i] > average)
				{
					System.out.println(numbles[i]);
				}
			}
		}
		
	}
	

}
