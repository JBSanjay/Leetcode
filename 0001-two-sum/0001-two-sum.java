class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        int len=nums.length;
         int[] l=new int[2];
        // int m=0;
        // for(int i=0;i<len;i++)
        // {
        //     for(int j=0;j<len;j++)
        //     {
        //         if(i!=j)
        //         {
        //             if(nums[i]+nums[j]==target)
        //             {
        //                 l[0]=i;
        //                 l[1]=j;
        //                 m=1;
        //                 break;
        //             }
        //         }
        //     }
        //     if(m==1)
        //     {
        //         break;
        //     }
        // }
        // return l;
        HashMap<Integer,Integer> hell=new HashMap<>();
        for(int i=0;i<len;i++)
        {
            if(hell.containsKey(target-nums[i]))
            {
                l[1]=i;
                l[0]=hell.get(target-nums[i]);
            }
            else
            {
              hell.put(nums[i],i);
            }
        }
        return l;
    }
}