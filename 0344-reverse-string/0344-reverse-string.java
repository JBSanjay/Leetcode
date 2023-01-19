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
// class Solution {
//     public void reverseString(char[] s) {
//         int start = 0, end = s.length - 1;
//         recStr(s, start, end);
//     }

//     public void recStr(char[] s, int h, int l) {
//         // if(l % 2 == 0)  {
//         //     if(h == l) return;
//         // } else {
//             if(h > l) return; 
//         // }
//         char temp = s[h];
//         s[h] = s[l];
//         s[l] = temp;
//         recStr(s, h+1, l-1);
//     }
// }