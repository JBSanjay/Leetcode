class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len=nums.length;
        int left=0,right=len-1;
        while(nums[left]+nums[right]!=target)
        {
            if(nums[left]+nums[right]>target)right--;
            else left++;
        }
        return new int[]{left+1,right+1};
    }
}
