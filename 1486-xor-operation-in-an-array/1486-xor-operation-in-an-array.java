class Solution {

    int fn(int x) {
        if (x < 0) return 0;
        if (x % 4 == 0) return x;
        if (x % 4 == 1) return 1;
        if (x % 4 == 2) return x + 1;
        
        return 0;
    }

    public int xorOperation(int n, int start) {
        int s = start >> 1;
        int xor = fn(s + n - 1) ^ fn(s - 1);
        return (xor << 1) | (n & start & 1);
    }
}
