public class TargetValue {
    public static void main(String[] args) {
        int[] a = {2, 4, 3};
        int target = 8;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                System.out.println("Target value is present in the array");
                return;
            }
        }

        System.out.println("Target value is not present in the array");
    }
}
