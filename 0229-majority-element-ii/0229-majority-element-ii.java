import java.util.*;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> result = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();

        for (int i = 0; i < n; i++) {
            if (seen.contains(nums[i])) continue;
            int c = 0;
            for (int j = 0; j < n; j++) {
                if (nums[j] == nums[i]) c++;
            }
            if (c > n / 3) {
                result.add(nums[i]);
                seen.add(nums[i]);
            }
        }
        return result;
    }
}
