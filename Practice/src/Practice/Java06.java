package Practice;
import java.util.Scanner;
/**
 * 遍历数组
 * @author 毛程浩
 *2019.08.21
 */
public class Java06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		final int MINOR =35;
//		System.out.print("请输入你的年龄：");
//		Scanner in = new Scanner(System.in);
//int age = in.nextInt();
//System.out.print("你的年龄是"+age);
//if (age <MINOR )
//{
//	System.out.println("年轻是美好的");
//	
//}
//	System.out.println("你的年龄决定了你的精神世界，好好珍惜吧。");	
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
