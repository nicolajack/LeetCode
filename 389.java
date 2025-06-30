class Solution {
    public char findTheDifference(String s, String t) {
        int sTotal = 0;
        for (int i = 0; i < s.length(); i++){
            sTotal += s.charAt(i);
        }
        int tTotal = 0;
        for (int i = 0; i < t.length(); i++){
            tTotal += t.charAt(i);
        }
        int total = tTotal-sTotal;
        return (char) total;
    }
}
