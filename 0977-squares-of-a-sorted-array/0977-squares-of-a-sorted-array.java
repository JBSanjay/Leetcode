class Solution {
    public int[] sortedSquares(int[] nums) {
     int [] arr=new int[nums.length];
     for(int i=0;i<nums.length;i++)
     {
         arr[i]=nums[i]*nums[i];
     }
     return mergeSort(arr);
    }
    public int[] mergeSort(int [] nums)
    {
        int n=nums.length;
        if(nums.length==1)
        {
            return nums;
        }
        int mid=n/2;
        int[] left=mergeSort(Arrays.copyOfRange(nums,0,mid));
        int [] right=mergeSort(Arrays.copyOfRange(nums,mid,n));
        return merge(left,right);
    }
    public int[] merge(int[] first,int[] second)
    {
        int i=0,j=0,k=0;
        int join[] =new int[first.length+second.length];
        while(i<first.length && j<second.length)
        {
            if(first[i]<second[j])
            {
              join[k++]=first[i++];  
            }
            else
            {
                join[k++]=second[j++];
            }
        }
        while(i<first.length)
        {
            join[k++]=first[i++];
        }
        while(j<second.length)
        {
            join[k++]=second[j++];
        }
        return join;
    }
}