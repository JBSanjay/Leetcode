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
// class Solution {
//     public int search(int[] nums, int target) {
        
//         return bSearch(0, nums.length - 1, nums, target);
    
//     }
    
//     public int bSearch (int lo, int hi, int[] nums, int target){
        
//         if(nums == null) return -1;
        
//         if(lo > hi) return -1;
        
//         int midpoint = (lo + hi) / 2;
        
//         if (nums[midpoint] == target) return midpoint;
        
//         if (nums[midpoint] > target) return bSearch(lo, midpoint - 1, nums, target);
        
//         return bSearch(midpoint + 1, hi, nums, target);
         
//     }
// }