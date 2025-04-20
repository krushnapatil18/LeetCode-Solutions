class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int score = 0;

        for(int [] row : grid){
            Arrays.sort(row);
        }
        
        int n = grid[0].length;
        for (int j = 0; j < n; j++) {
            int max = 0;
            for (int i = 0; i < grid.length; i++) {
                max = Math.max(max, grid[i][j]);
            }
            score += max;
        }
        return score;
    }
}