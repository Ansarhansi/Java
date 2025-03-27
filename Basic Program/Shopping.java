public class Shopping{
	public static void main(String[] args){
		int bill=120;
		if(bill > 100){
			bill=bill-(bill*10)/100;

			System.out.print("you get speacial discount of 10% and your total amount is:" +bill);
		}

		else{
			System.out.print("you are unlucky and  your bill remains same "+bill);
		}
		}

	
}
	
