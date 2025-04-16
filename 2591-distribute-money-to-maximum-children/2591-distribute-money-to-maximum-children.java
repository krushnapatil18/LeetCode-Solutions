class Solution {
    public int distMoney(int money, int children) {
        if(money < children) return -1;

        int moneyleft = money - children;
        int count = 0;

        for(int i = 0; i < children; i++){
            if(moneyleft >= 7){
                moneyleft -= 7;
                count++;
            } else {
                break;
            }
        }

        if(count == children - 1 && moneyleft == 3){
            count--;
        }

        if(count == children && moneyleft > 0){
            count--;
        }

        return count;
    }
}
