public class Palindrome1{
		public static void pali(){
			int number=178;
			int originalnum=number;
			int reversenum=0;
			while(number!=0){
				int digit= number%10;
				reversenum = reversenum*10 + digit;
				number=number/10;
			}
				if(reversenum== originalnum){
					System.out.println("The number is a Palindrome number ");
				}
				else {
					System.out.println("The number is not  a Palindrome number ");

				}

			}
			
		public static void main(String[] args) {
			pali();
			
		}	
			}