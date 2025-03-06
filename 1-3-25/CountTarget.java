public class CountTarget{
    public static void main(String[] args) {
        int[] a = {2, 4, 3, 8, 12};
        int target = 4;
        int count = 0;
        System.out.println("multiple of target is:"+target);

        for (int i = 0; i < a.length; i++) {
            if (a[i] % target == 0) {
                System.out.println(a[i]);
                count++;
                
            }
        }

        System.out.println("count of the target is:"+count);
    }
}
