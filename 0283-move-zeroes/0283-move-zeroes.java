class Solution {
    public void moveZeroes(int[] nums) {
        int size=0;
       for(int i=0;i<nums.length;i++)
       {
           if(nums[i]==0)
           {
               size++;
           }
           else if(size>0)
           {
               int t=nums[i];
               nums[i]=0;
               nums[i-size]=t;
           }
       }
    }
}