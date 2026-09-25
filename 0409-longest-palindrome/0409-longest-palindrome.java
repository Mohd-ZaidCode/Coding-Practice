class Solution {
    public int longestPalindrome(String s) {
        int res=0;
        Map<Character,Integer>map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
            if(map.get(c)%2==0)res+=2;
        }
        
        if(res!=s.length())return res+1;
        return res;
    }
}