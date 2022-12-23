class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int len=nums.length;
        int ni[]=new int[len];
        Stack<Integer> st=new Stack<>();
        for(int i=2*len-1;i>=0;i--)
        {
            while(st.isEmpty()==false && st.peek()<=nums[i%len]){
                st.pop();
            }
            if(i<len)
            {
                if(st.isEmpty()==false)
                {
                    ni[i]=st.peek();
                }
                else
                {
                    ni[i]=-1;
                }
            }
            st.push(nums[i%len]);
        }
        return ni;
    }
}