/**����if else if else��ѡ��ṹ
 * @author ë�̺�
 * 2020.2.1
 */
public class Open1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age =(int)(100*Math.random());
//		System.out.println(
		System.out.println("������"+age+",����");
		if(age<15){
			System.out.println("��ͯ��ϲ����");
//		
		}else if(age<25){
			System.out.println("���꣬Ҫѧϰ");
		}else if(age<45){
			System.out.println("���꣬Ҫ����");
		}else if(age<65){
			System.out.println("�����꣬Ҫ����");
		}else if(age<85){
			System.out.println("���꣬���˶�");
		}else{
			System.out.println("�����ǣ�����ϡ");
		}
	}
	

}
