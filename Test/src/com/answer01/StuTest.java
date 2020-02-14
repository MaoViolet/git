package com.answer01;
import java.util.*;
public class StuTest{
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("欢迎使用学生管理系统！");
			boolean m =true;
			while(m){
				Student d= new Student("mao", "122333443", "man", 19);
				StuManager n=new StuManager();
				Scanner in = new Scanner(System.in);
				System.out.print("请输入你选择的功能：");
				int s=in.nextInt();
				switch(s){
				case 1:
					System.out.println("请输入添加学生的信息：");
					n.add(d);
					break;
				case 2:
					System.out.print("请输入你要删除学生的名字：");
					Scanner st=new Scanner(System.in);
					String p=st.nextLine();
					n.remove(p);
					break;
				case 3:
					System.out.println("展示所有学生的信息：");
					n.showAll();
					break;
				case 4:
					System.out.print("请输入你要查找学生的名字：");
					Scanner ar=new Scanner(System.in);
					String q=ar.nextLine();
					n.getbyName(q);
					break;
				}
				}
			}
		
			

}

