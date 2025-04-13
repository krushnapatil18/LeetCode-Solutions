class Solution {
    public int minTimeToType(String word) {
        int time = 0;
        char current = 'a';

        for(int i = 0; i<word.length();i++){

            char c = word.charAt(i);

            int move = Math.abs(c - current);
            int minMove = Math.min(move, 26 - move);

            time += minMove+1;
            current = c;

        }
        return time;
    }
}