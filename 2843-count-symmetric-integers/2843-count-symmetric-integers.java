class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
 

        for(int num=low; num<=high; num++){
            String s = Integer.toString(num);
            int l = s.length();

            if(l%2!=0){
                continue;
            }

            int lefthalf = 0;
            int righthalf = 0;

            for(int i=0; i<l/2; i++){
                lefthalf += s.charAt(i)-'0';
            }
            
            for(int i=l/2; i<l; i++){
                righthalf += s.charAt(i)-'0';
            }
            if(lefthalf == righthalf){
                count++;
            }
        }
        return count;
    }

}