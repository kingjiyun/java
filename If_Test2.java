import java.util.Scanner;
public class If_Test2{
	public static void main(String []args){
		Scanner sc= new Scanner(System.in);
		System.out.print("점수를 입력하시오:");
		int score = sc.nextInt();

		if(score>95)
		System.out.println("A+");

		else if(score>90)
		System.out.println('A');

		else if(score>=85)
		System.out.println("B+");

		else if(score>=80)
		System.out.println('B');

		else
		System.out.println('C');
	}
}
		