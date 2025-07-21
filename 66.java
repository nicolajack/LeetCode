class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--){
            if (digits[i] != 9){
                digits[i] += 1;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        int[] digits2 = new int[digits.length + 1];
        digits2[0] = 1;
        for (int i = 1; i < digits2.length; i++){
            digits2[i] = digits[i - 1];
        }
        return digits2;
    }
}
