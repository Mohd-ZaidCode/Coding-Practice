class Solution {
    public int longestPalindrome(String s) {
        int res=0;
        Map<Character,Integer>map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c:map.keySet()){
            res+=map.get(c)-map.get(c)%2;
        }
        if(res!=s.length())return res+1;
        return res;
    }
}