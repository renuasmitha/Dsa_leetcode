class Solution {
    public boolean isPalindrome(String s) {

        s = s.toLowerCase();

        String str2 = "";

        for(int i = 0; i < s.length(); i++) {
            if(Character.isLetterOrDigit(s.charAt(i))) {
                str2 += s.charAt(i);
            }
        }

        String rev = "";

        for(int j = str2.length() - 1; j >= 0; j--) {
            rev += str2.charAt(j);
        }

        if(rev.equals(str2)) {
            return true;
        }
        else {
            return false;
        }
    }
}