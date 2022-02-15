class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n*(n+1)/2;
        int currSum = 0;
        for(int num: nums) currSum+=num;
        return sum-currSum;
    }
}