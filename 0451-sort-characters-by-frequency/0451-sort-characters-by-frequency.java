class Solution {
    public String frequencySort(String s) {
        int[] freq = new int[128];

        for (char c : s.toCharArray()) {
            freq[c]++;
        }

        StringBuilder sb = new StringBuilder();

        while (sb.length() < s.length()) {
            int max = 0;
            char ch = ' ';

            for (int i = 0; i < 128; i++) {
                if (freq[i] > max) {
                    max = freq[i];
                    ch = (char) i;
                }
            }

            for (int i = 0; i < max; i++) {
                sb.append(ch);
            }

            freq[ch] = 0;
        }

        return sb.toString();
    }
}
