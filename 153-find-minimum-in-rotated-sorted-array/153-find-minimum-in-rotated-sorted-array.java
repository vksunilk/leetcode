class Solution {
    public int findMin(int[] nums) {
        int lo=0;
        int hi=nums.length-1;
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums[hi] > nums[lo]) {
            return nums[lo];
        }
        while(lo<hi) {
            int mid = lo+(hi-lo+1)/2;
            // if the mid element is lesser than its previous element then mid element is the smallest
            if(nums[mid]<nums[mid-1]) {
                return nums[mid];
            }
            // if the mid element is greater than its next element then mid+1 element is the smallest
            // This point would be the point of change. From higher to lower value.
            if(nums[mid]>nums[mid+1]) {
                return nums[mid+1];
            }
            // if the mid elements value is greater than the 0th element this means
            // the least value is still somewhere to the right as we are still dealing with elements
            if(nums[mid]>nums[0]) {
                lo=mid+1;
            } else {
                hi=mid;
            }
        }
        return -1; 
    }
}