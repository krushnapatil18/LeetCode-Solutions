class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();


        for(int i=0;i<n;i++){
            int j = 0;
            for(int k=i;k<n;k++){

                if(haystack.charAt(k)==needle.charAt(j)){
                    j+=1;
                }
                else{
                    break;
                }
                if(j==m){
                    return i;
                }
            }
        }
        return -1;
    }
}