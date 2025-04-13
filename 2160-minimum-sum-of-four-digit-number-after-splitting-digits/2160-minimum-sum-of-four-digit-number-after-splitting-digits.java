class Solution {
    public int minimumSum(int num) {
        int arrd[]  = new int[4];
        int i = 0;

        while(num>0){

            arrd[i++] = num %10;
            num/=10;
        }
        Arrays.sort(arrd);

        int n1 = arrd[0]*10 + arrd[2];
        int n2 = arrd[1]*10 + arrd[3];
        
        return n1+n2;
        
    }
}