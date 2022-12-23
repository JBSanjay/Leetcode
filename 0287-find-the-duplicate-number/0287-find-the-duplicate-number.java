class Solution {
    public int findDuplicate(int[] nums) {
        int len=nums.length;
        // Map<Integer> fi=new HashMap<>();
        Arrays.sort(nums);
        int temp=0;
        for(int i=0;i<len;i++)
        {
            if(nums[i]==nums[i+1])
            {
                // return nums[i];
                // brea
             temp=nums[i];
                break;
            }
        }
        return temp;
    }
}