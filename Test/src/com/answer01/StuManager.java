package com.answer01;
import java.util.*;
public class StuManager {
//	StuManager[] test=new StuManager[100];	
	Student[] test=new Student[100];
	Scanner input=new Scanner(System.in);
//	增加学生
	public void add(Student a){
		for(int i=0;i<test.length;i++){
				if(test[i]==null){
					System.out.print("请输入姓名：");
					a.name=input.nextLine();
					System.out.print("请输入学号：");
					a.id=input.nextLine();
					System.out.print("请输入性别：");
					a.sex=input.nextLine();
					System.out.print("请输入年龄：");
					a.age=input.nextInt();
					test[i]=a;
					System.out.println("添加成功！");
					break;
				}
			
		}
	}
//	删除学生
	public void remove(String name){
		for(int i=0;i<test.length;i++){
			if(test[i].name.equals(name)){
				test[i]=null;
				System.out.println("删除成功！");
				break;
			}
		}
	}
//	查找学生（根据名字）
	public void getbyName(String name){
			for(int i=0;i<test.length;i++){
			if(test[i].name.equals(name)){
				System.out.println("学号："+test[i].getId()+"姓名："+test[i].getName()+"年龄："+test[i].getAge()+"性别："+test[i].getSex());
				
				break;
			}
		}
	}
//	展示所有学生		
	public void showAll(){
		for(int i=0;i<test.length;i++){
			Student c=test[i];
			if(c!=null){
				System.out.println("学号："+test[i].getId()+"姓名："+test[i].getName()+"年龄："+test[i].getAge()+"性别："+test[i].getSex()+"\n");
			}
		}
	}
	

}
