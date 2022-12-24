class Solution {
    public int commonFactors(int a, int b) {
       int maxi=Math.max(a,b);
        int count=0;
        for(int i=1;i<=maxi;i++)
        {
            if(a%i==0 && b%i==0)
            {
                count+=1;
            }
        }
        return count;
    }
}