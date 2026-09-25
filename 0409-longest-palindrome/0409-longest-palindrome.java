class Solution {
    public int longestPalindrome(String s) {
        int res=0;
        int []arr=new int[100];
        for(char c:s.toCharArray()){
            arr[c-'A']++;
            if(arr[c-'A']%2==0)res+=2;
        }
        
        if(res!=s.length())return res+1;
        return res;
    }
}