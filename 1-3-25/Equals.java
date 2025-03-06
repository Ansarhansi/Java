public class Equals{
	public static void main(String[] args) {
		int[] a={1,2,3,4,5,6};
		int target=21;
		int sum=0;
		for(int i=0;i<a.length;i++){
			sum+=a[i];

	}
	System.out.println("sum is: " + sum);
	if(sum==target){
		System.out.println("the total is equals to target");

	}
	else{
		System.out.println("the total is not equals to target");
	}

		}
}