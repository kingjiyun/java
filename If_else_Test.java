import java.util.Scanner;
public class If_else_Test{
	public static void main(String []args){
		Scanner sc= new Scanner(System.in);
		System.out.print("���� �Է��Ͻÿ�:");
		int number = sc.nextInt();

		if(number %3==0)
		System.out.println("3�� ����Դϴ�.");

		else
		System.out.println("3�� ����� �ƴմϴ�.");
  	}
}