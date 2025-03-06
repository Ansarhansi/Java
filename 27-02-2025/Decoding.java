public class Decoding{
	public static void main(String[] args) {
		long contactNumber=123456789l;
		 String sentence="";
		while(contactNumber !=0){
			long digit = contactNumber%10;

			 contactNumber= contactNumber/10;

			 
			 if(digit==1){
			 	System.out.println(digit+" "+"Hi");
			 	sentence=sentence+"Hi";

			 }
			 else if(digit==2){
			 	System.out.println(digit+" "+"How are you");
                 sentence=sentence+"How are you";
			 }
			 else if(digit==3){
			 	System.out.println(digit+" "+"what up");
			 	sentence=sentence+"what up";
			 }
			 else if(digit==4){
			 	System.out.println(digit+" "+"fine");
			 	sentence=sentence+"fine";
			 }
			 else if(digit==5){
			 	System.out.println(digit+" "+"have a nice day");
			 	sentence=sentence+"have a nice day";
			 }
			 else if(digit==6){
			 	System.out.println(digit+" "+"hope you are doing");
			 	sentence=sentence+"Hope you are doing";
			 }
			 else if(digit==7){
			 	System.out.println(digit+" "+"i will pin");
			 	sentence=sentence+"i will pin";
			 }
			 else if(digit==8){
			 	System.out.println(digit+" "+"you wait for me");
			 	sentence=sentence+"you wait for me";

			 }
			 else{

			 	System.out.println(digit+" "+"Bye");
			 	sentence=sentence+"Bye";
			 	
			 }


		}
	System.out.println(sentence);	
	}

	
}