class Solution {
    public String mergeAlternately(String word1, String word2) {
        String merged = "";
        int word1p = 0;
        int word2p = 0;
        while (word1p < word1.length() && word2p < word2.length()){
            merged += word1.charAt(word1p);
            ++word1p;
            merged += word2.charAt(word2p);
            ++word2p;
        }
        while (word1p < word1.length()){
            merged += word1.charAt(word1p);
            ++word1p;
        }
        while (word2p < word2.length()){
            merged += word2.charAt(word2p);
            ++word2p;
        }
        
        return merged;
    }
}
