public class Palidomne{
	public static void main(String[] args) {
				if (Pali()) {
            System.out.println("number is a palindrome.");
        } else {
            System.out.println("number  is not a palindrome.");
        }
    }
	
	public static  void Pali(){
		int rem=0;
		int num=620;
		int onum = num;
		int rev=0;

		

		while(num > 0){
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;



		}
		   return onum == rev;
	}

}

