class Solution {
    public int countNegatives(int[][] grid) {
        int cnt = 0;

        for(int row[] : grid ){
            cnt = cnt + cN(row);
        }
        return cnt;
    }

    public int cN(int[] row){


        int low = 0;
        int high = row.length-1;

        while(low<=high){
            int mid = low+(high-low)/2;

            if(row[mid]<0){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return row.length-low;
    }
}