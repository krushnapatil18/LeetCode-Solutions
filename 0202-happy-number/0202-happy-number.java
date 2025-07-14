class Solution {
    public boolean isHappy(int n) {
        Set<Integer> done = new HashSet<>();

        while(n!=1){
            if(done.contains(n)){
                return false;
            }
            done.add(n);
            n = sum(n);
        }
     return true;
    }

    private int sum(int num){
        int s = 0;
        while(num>0){

            int digit = num%10;
            s += digit * digit;
            num = num/10;

        }
        return s;
    }
}