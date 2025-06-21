class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        float s1 = 0;
        float s2 = 0;
        int n1= nums1.length;
        int n2 = nums2.length;

        for(int i = 0; i<n1;i++){
            s1 = s1 + nums1[i];
        }
        for(int i = 0; i<n2;i++){
            s2 = s2 + nums2[i];
        }  

        return (s1+s2)/(n1 + n2);      
        
    }
}