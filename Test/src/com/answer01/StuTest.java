package com.answer01;
import java.util.*;
public class StuTest{
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("��ӭʹ��ѧ������ϵͳ��");
			boolean m =true;
			while(m){
				Student d= new Student("mao", "122333443", "man", 19);
				StuManager n=new StuManager();
				Scanner in = new Scanner(System.in);
				System.out.print("��������ѡ��Ĺ��ܣ�");
				int s=in.nextInt();
				switch(s){
				case 1:
					System.out.println("���������ѧ������Ϣ��");
					n.add(d);
					break;
				case 2:
					System.out.print("��������Ҫɾ��ѧ�������֣�");
					Scanner st=new Scanner(System.in);
					String p=st.nextLine();
					n.remove(p);
					break;
				case 3:
					System.out.println("չʾ����ѧ������Ϣ��");
					n.showAll();
					break;
				case 4:
					System.out.print("��������Ҫ����ѧ�������֣�");
					Scanner ar=new Scanner(System.in);
					String q=ar.nextLine();
					n.getbyName(q);
					break;
				}
				}
			}
		
			

}

