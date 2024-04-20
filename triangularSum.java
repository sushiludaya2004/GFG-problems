//https://leetcode.com/problems/find-triangular-sum-of-an-array/
class Solution {
    public int triangularSum(int[] nums) {
        if(nums.length == 1) return nums[0];
        
        int[] newArray = new int[nums.length - 1];
        for(int i = 0; i < nums.length - 1; i++) {
            newArray[i] = (nums[i] + nums[i + 1]) % 10;
        }
        
        return triangularSum(newArray);
    }
}
