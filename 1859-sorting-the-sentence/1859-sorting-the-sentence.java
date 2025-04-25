class Solution {
    public String sortSentence(String s) {
        
        String[] w = s.split(" ");

        String[] sw = new String[w.length];

        for (int i = 0;i<w.length; i++) {
            String word = w[i];
            int idx = word.charAt(word.length()-1)-'0';
            sw[idx - 1] = word.substring(0, word.length() - 1);
        }
        return String.join(" ", sw);
    }
}
