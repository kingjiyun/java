public class test0515{
	public static void main(String [] args){
		int a =10;

		//��� ������
		//System.out.println((a=20)==20);		//true
		//System.out.println(!a);			//����
		//System.out.println(a);			//20
		
		//���� ������
		//boolean power = false;			//false
		//System.out.println(power);		//true
		//System.out.println((!!!power));		//true
		//System.out.println(!power);		//20
		//System.out.println(a);			//false
		//System.out.println(false);			//false

		//�� ������
		//System.out.println((1>2)&(1<(a=20)));	//false
		//System.out.println((1>2)&&(1<(a=20)));	//false
		//System.out.println((1<2) | (1>2));		//true
		//System.out.println((1<2) ||(1>2));		//true
		//System.out.println(!(1<2));		//false

		//���� ������
		//int b=++a+10;
		//System.out.println(a);			//11
		//System.out.println(b);			//21

		//int b= a++ +10;
		//System.out.println(a);			//11
		//System.out.println(b);			//20

		//int b= --a+ 10;
		//System.out.println(a);			//9	
		//System.out.println(b);			//19

		//int b= a-- +10;
		//System.out.println(a);			//9
		//System.out.println(b);			//20
	}
}