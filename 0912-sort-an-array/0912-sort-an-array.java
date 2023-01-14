class Solution {
     public int[] merge(int[] first,int[] third)
     {
         int join[]=new int[first.length+third.length];
         int i=0,j=0,k=0;
        //  for(int m=0;m<first.length;m++)
        //  System.out.println(first[m]);
         while(i<first.length && j<third.length)
         {
             if(first[i]<third[j])
             {
                 join[k++]=first[i++];
             }
             else
             {
                 join[k++]=third[j++];
             }
         }
         while(i<first.length)
         {
             join[k++]=first[i++];
         }
         while(j<third.length)
         {
             join[k++]=third[j++];
         }
         return join;
     }
    public int[] sortArray(int[] nums) {
        if(nums.length==1)
        {
            return nums;
        }
        int mid=nums.length/2;
        int[] left=sortArray(Arrays.copyOfRange(nums,0,mid));
        int[] right=sortArray(Arrays.copyOfRange(nums,mid,nums.length));
        return merge(left,right);
    }
}