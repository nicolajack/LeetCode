class Solution {
    public boolean isPalindrome(String s) {
        String ans = s.toLowerCase().trim();
        int i = 0;
        int j = ans.length() - 1;
        while (i < j){
            if (!((ans.charAt(i) >= 48 && ans.charAt(i) <= 57) || (ans.charAt(i) >= 97 && ans.charAt(i) <= 122))){
                ++i;
            } else if (!((ans.charAt(j) >= 48 && ans.charAt(j) <= 57) || (ans.charAt(j) >= 97 && ans.charAt(j) <= 122))){
                --j;
            } else {
                if (ans.charAt(i) != ans.charAt(j)){
                    return false;
                }
                ++i;
                --j;
            }
        }
        return true;
    }
}
