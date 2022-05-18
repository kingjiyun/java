import java.util.Scanner;
public class Constant2_1101{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);

	System.out.print("반지름: ");
	int r= sc.nextInt();
	final double PI=3.14;

	System.out.println("반지름 "+r+"인 원의 둘레:"+(2*PI*r));
	System.out.println("반지름 "+r+"인 원의 넓이:"+(PI*r*r));
		}
}