public class MinMax{
	public static void main(String[] args) {
		int a[]={12,4,7,54};
		int max=a[0];
		int min=a[0];
		for(int i=0;i<a.length;i++){
			if(a[i]>max){
				max=a[i];
			}
			if(a[i]<min){
				min=a[i];
			}
		}
		System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);


		
	}
	
}
