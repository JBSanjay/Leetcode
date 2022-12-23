class Solution {
    public void sortColors(int[] nums) {
        int len=nums.length;
        for(int i=0;i<len;i++)
        {
            for(int j=0;j<len;j++)
            {
                if(nums[i]<nums[j])
                {
                    int temp=nums[j];
                    nums[j]=nums[i];
                    nums[i]=temp;
                }
            }
        }
    }
}