class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> ans = new ArrayList<>();
        int f[] = new int [1001];

        for(int num: nums1){
            f[num]++;
        }

        for(int num: nums2){
            if(f[num]>0){
                ans.add(num);
                f[num]--;
            }
        }
        int k = ans.size();
        int res[] = new int[k];
        for(int i=0; i<k; i++){
            res[i] = ans.get(i);

        }
        return res;
    }
}