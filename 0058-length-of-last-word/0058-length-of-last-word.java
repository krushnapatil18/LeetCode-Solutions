class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int end = s.length()-1;
        int start = end;

        while(start >= 0 && s.charAt(start) != ' ' ){
            start--;
        }

        return end-start;
    }
}