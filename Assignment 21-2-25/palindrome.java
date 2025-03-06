import java.util.Scanner;
public class Palindrome{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
			System.out.println("enter a number to check palindrome: ");
			
		int num=sc.nextInt();
		int Onum=num;
		int rem;
		int rev=0;
		System.out.println("checking whether the given number is palidrome or not");

		
		

		while(num > 0){
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(Onum == rev){
			System.out.println("the number is palindrome:");
		}
			else{
				System.out.println("not palindrome");
			}
		}


	}
