/**
 * ����if�����÷�
 * @author ë�̺�
 *2020.2.2
 */
import java.util.Scanner;
public class Open3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 		int h =(int)(6*Math.random()+1);
		Scanner scanner =new Scanner(System.in);
		int h= scanner.nextInt();
//	System.out.println(h);
		if(h<3){
			System.out.println("С��");
		}else{
			System.out.println("����");
		}
		System.out.println("########");
		int i = (int)(6*Math.random())+1;
		int j = (int)(6*Math.random())+1;
		int k = (int)(6*Math.random())+1;
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		int count =i+j+k;
		if(count>10){
			System.out.println("��������һ��");
			
		}else if(count>15&count<18){
			System.out.println("������������");
		}else{
			System.out.println("����������");
		}
			

	}

}
