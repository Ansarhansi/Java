import java.util.Scanner;
public class Cube{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
			System.out.println("enter a number to find cube: ");
			
		int num=sc.nextInt();
		int cube=num*num*num;
		System.out.println("the cube of the number is:"+cube);

}
}