import java.util.*;
import java.util.stream.IntStream;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] merged = IntStream.concat(Arrays.stream(Arrays.copyOf(nums1, m)), Arrays.stream(nums2))
                                .sorted()
                                .toArray();
        System.arraycopy(merged, 0, nums1, 0, m + n);
    }
}
