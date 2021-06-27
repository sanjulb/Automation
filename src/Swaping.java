import java.util.Scanner;

public class Swaping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the value of a");
		int a=scan.nextInt();
		System.out.println("enter the value of b");
		int b=scan.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a "+a);
		System.out.println("b "+b);
		
		

	}

}
