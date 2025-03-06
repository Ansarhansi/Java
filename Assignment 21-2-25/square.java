import java.util.Scanner;
public class square{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
			System.out.println("enter a number to find Square: ");
			
		int num=sc.nextInt();
		int Square=num*num;
		System.out.println("the Square of the number is:"+Square);

}
}