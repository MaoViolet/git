/**ѧϰScanner���÷�
 * 2020.2.2
 * @author ë�̺�
 */
import java.util.Scanner;
public class Open4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=(int)(100*Math.random()+1);
			System.out.println("��ʼ������Ϸ");
		Scanner i=new Scanner(System.in);
		int b = 0;
		while(a!=b){
			System.out.print("Please input your answer(1-100):");
			b=i.nextInt();
			if(a>b){
				System.out.println("Sorry,your answer is too small ,please try again");
				
			}else if(a<b){
				System.out.println("Sorry,your answer is too big,Please try again");
			}else if(a==b){
				System.out.println("your guess it,Congratulations!");				
			}
			}
	        }
			}

