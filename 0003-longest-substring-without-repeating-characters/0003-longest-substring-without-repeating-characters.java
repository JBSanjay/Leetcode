class Solution {
    public int lengthOfLongestSubstring(String s){
        int len=s.length();
        HashMap<Character,Integer> hell=new HashMap<>();
        int start=0;
        int maxi=0;
        for(int i=0;i<len;i++)
        {
            char ch=s.charAt(i);
            if(hell.containsKey(ch))
            {
                start=Math.max(hell.get(ch)+1,start);
            }
            hell.put(ch,i);
            maxi=Math.max(maxi,i-start+1);
        }
        return maxi;
    }
}