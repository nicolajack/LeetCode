class Solution {
    public boolean isAnagram(String s, String t) {
        if (t.length() != s.length()){
            return false;
        }
        for (int i = 0; i < s.length(); i++){
            if (t.contains(String.valueOf(s.charAt(i)))){
                t = t.replaceFirst(String.valueOf(s.charAt(i)), "");
            } else {
                return false;
            }
        }
        return true;
    }
}
