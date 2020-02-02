import java.util.Scanner;

/**测试String的用法
 * 
 * @author 毛程浩
 *2020.2.2
 */
public class Open2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		System.out.println("请输入你的名字：");
		String name= scanner.nextLine();
		System.out.println("请输入你的爱好：");
		String favor= scanner.nextLine();
		System.out.println("请输入你的年龄：");
		int age =scanner.nextInt();
		System.out.println("#########");
		System.out.println(name);
		System.out.println(favor);
		System.out.println("来到地球的天数"+age*365);
		System.out.println("到一百岁剩余的天数："+(100-age)*365);
	}

}
