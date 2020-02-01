/**
 * 测试嵌套循环
 * @author 毛程浩
 *2020.2.1
 */
public class Open {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				System.out.print(i+"\t");
				
			}
			System.out.println();
		}
		System.out.println("这是九九乘法表");
		for(int m=1;m<=9;m++){
			for(int n=1;n<=m;n++){
				System.out.print(m+"*"+n+"="+m*n+"\t");
//				System.out.println("****");
					
			}
			System.out.println();

		}
		

	}
	

}

