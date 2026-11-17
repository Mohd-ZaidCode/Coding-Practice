class Solution {
    public int maxDepth(String s) {
        int n=0;
        int res=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(')n++;
            res=Math.max(n,res);
            if(s.charAt(i)==')')n--;
        }
        return res;
    }
}