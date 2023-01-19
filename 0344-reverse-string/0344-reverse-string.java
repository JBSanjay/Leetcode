class Solution {
    public void reverseString(char[] s) {
        revstr(s,0,s.length-1);
    }
    public void revstr(char[] s,int high,int low)
    {
        if(high>low) return;
        char m=s[low];
        s[low]=s[high];
        s[high]=m;
        revstr(s,high+1,low-1);
    }
}
