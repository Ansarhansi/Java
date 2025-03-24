public class ProductName1{
	 
		static int index=0;
		static String[] pName={null,null,null,null};

		public static void displayName(){
			for(int i=0;i<pName.length;i++){
				System.out.println(pName[i]);
			}
		}
		
	

     public static void productDetails(String Name){
     		if(pName!=null){
			if(index<pName.length){
				pName[index]=Name;
				index++;
				System.out.println("element added succesfully");
				
			}
			else{
				System.out.println("List is full cannot add");
			}

       }
		else{
			System.out.println("pName is null");
		}
	}
}
