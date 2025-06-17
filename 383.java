class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        for (int i=0; i<ransomNote.length(); i++){
            if (magazine.indexOf(ransomNote.charAt(i)) != -1){
                magazine = magazine.replaceFirst(String.valueOf(ransomNote.charAt(i)), "");
            } else {
                return false;
            }
        }
        return true;
    }
}
