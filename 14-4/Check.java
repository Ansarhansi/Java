public class Check
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		String name="Abhishek";
		System.out.println("name:"+name);
		System.out.println(name);
		String uname=name.concat("H");
		System.out.println("uname:"+uname);
		
         String u_name="AbhishekH";
         System.out.println("u_name:"+u_name);
         if(uname==u_name){
         	System.out.println("Matching");}
         	else{
         		System.out.println("Not matching");
         	}
		
	}
}