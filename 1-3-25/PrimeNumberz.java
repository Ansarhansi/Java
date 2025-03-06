public class PrimeNumberz {
    public static void main(String[] args) {
        int a[]={12,51,43,77,5};
       
        
        for(int i=0;i<a.length;i++)
        {
        	boolean isPrime = true;
        
        
        if (a[i] <= 1) {
            isPrime = false;
        } else {
            for (int j = 2; j*j<a[i]; j++) {
                if (a[i] % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
            System.out.println(a[i] + " is a prime number.");
        } else {
            System.out.println(a[i]+ " is not a prime number.");
        }
        }
         }
     }
 }


       
    

