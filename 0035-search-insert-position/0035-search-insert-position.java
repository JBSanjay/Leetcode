class Solution {
    public int searchInsert(int[] nums, int target) {
        return  search(nums,target,0,nums.length-1);
        
    }
    public int search(int []nums,int target,int low,int high)
    {
        int mid=(low+high)/2;
        if (target < nums[low]) return low;
        if (target > nums[high]) return high + 1;
        if(target==nums[mid])
        {
          return mid; 
        }
        else if(target<nums[mid])
        {
            return search(nums,target,low,mid-1);
        }
        else
        {
            return search(nums,target,mid+1,high);
        }
    }
}
