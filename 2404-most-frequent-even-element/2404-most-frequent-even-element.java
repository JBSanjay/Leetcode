class Solution {
    public int mostFrequentEven(int[] nums) {
        int arr[]=new int[100000];
        for(int i=0;i<nums.length;i++)
        {
            arr[nums[i]]+=1;
        }
        int big=0,j=0;
        int indi=1;
        for(int i=0;i<100000;i++)
        {
            if(i%2==0)
            {
           if(arr[i]>big)
           {
               big=arr[i];
               j=i;
               indi=0;
           }
            }
        }
        if(indi==0)
        {
        return j;
        }
        else 
        {
            return -1;
        }
    }
}