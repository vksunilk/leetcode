class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] alphabet = new char[26];
        for(int i =0;i<s.length();i++) {
            alphabet['z'-s.charAt(i)]++;
        }
        for(int i =0;i<t.length();i++) {
            alphabet['z'-t.charAt(i)]--;
        }
        for(int i =0;i<alphabet.length;i++) {
            if(alphabet[i]!=0)return false;
        }
        return true;
    }
}