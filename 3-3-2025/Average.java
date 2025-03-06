public class Average{
	public static void main(String[] args) {
		int a[]={2,4,6,7};
		int sum=0;
		for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
		int avg=sum/a.length;

           System.out.println("the average of the array is:"+avg);
		
	}
}