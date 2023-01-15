class Solution {
    public int binsearch(int []nums,int target,int low,int high)
    {
        if(nums==null || high>nums.length)
        {
            return -1;
        }
        if(low>high)
        {
            return -1;
        }
        int mid=(low+high)/2;
        if(nums[mid]==target)
        {
            return mid;
        }
        if(nums[mid]>target)
        {
            return binsearch(nums,target,low,mid-1);
        }
        return binsearch(nums,target,mid+1,high);
    }
    public int search(int[] nums, int target) {
        return binsearch(nums,target,0,nums.length-1);
    }
}
