class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int len=nums.length;
        int count=0;
        for(int i=0;i<len;i++)
        {
            if(nums[i]==1)
            {
                int temp=1;
                
                while((i+temp)<len && nums[i+temp]==1)
                {
                    temp++;
                }
            count=Math.max(temp,count);
            }
            }
        
        return count;
    }
}