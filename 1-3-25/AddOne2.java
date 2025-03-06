public class AddOne2 {
    public static void main(String[] args) {
        int[] digits = {99, 99, 99};

        int n = digits.length;

        
        digits[n - 1] += 1;

        
        for (int i = n - 1; i > 0; i--) {
            if (digits[i] > 9) {
                int carry = digits[i] / 10;
                digits[i] %= 10;
                digits[i - 1] += carry;
            }
        }

        if (digits[0] > 9) {
            int carry = digits[0] / 10;
            digits[0] %= 10;
            int[] newDigits = new int[n + 1];
            newDigits[0] = carry;
            for (int i = 0; i < n; i++) {
                newDigits[i + 1] = digits[i];
            }
            digits = newDigits;
        }

        for (int num : digits) {
            System.out.print(num + " ");
        }
    }
}
