package com.answer01;
import java.util.*;
public class StuManager {
//	StuManager[] test=new StuManager[100];	
	Student[] test=new Student[100];
	Scanner input=new Scanner(System.in);
//	����ѧ��
	public void add(Student a){
		for(int i=0;i<test.length;i++){
				if(test[i]==null){
					System.out.print("������������");
					a.name=input.nextLine();
					System.out.print("������ѧ�ţ�");
					a.id=input.nextLine();
					System.out.print("�������Ա�");
					a.sex=input.nextLine();
					System.out.print("���������䣺");
					a.age=input.nextInt();
					test[i]=a;
					System.out.println("��ӳɹ���");
					break;
				}
			
		}
	}
//	ɾ��ѧ��
	public void remove(String name){
		for(int i=0;i<test.length;i++){
			if(test[i].name.equals(name)){
				test[i]=null;
				System.out.println("ɾ���ɹ���");
				break;
			}
		}
	}
//	����ѧ�����������֣�
	public void getbyName(String name){
			for(int i=0;i<test.length;i++){
			if(test[i].name.equals(name)){
				System.out.println("ѧ�ţ�"+test[i].getId()+"������"+test[i].getName()+"���䣺"+test[i].getAge()+"�Ա�"+test[i].getSex());
				
				break;
			}
		}
	}
//	չʾ����ѧ��		
	public void showAll(){
		for(int i=0;i<test.length;i++){
			Student c=test[i];
			if(c!=null){
				System.out.println("ѧ�ţ�"+test[i].getId()+"������"+test[i].getName()+"���䣺"+test[i].getAge()+"�Ա�"+test[i].getSex()+"\n");
			}
		}
	}
	

}
