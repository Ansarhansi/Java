public class AddOne1 {
    public static void main(String[] args) {
        int[] digits = {9, 9, 9};

        int[] result = addOne(digits);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] addOne(int[] digits) {
        int n = digits.length;
        
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] newDigits = new int[n + 1];
        newDigits[0] = 1;

        return newDigits;
    }
}
