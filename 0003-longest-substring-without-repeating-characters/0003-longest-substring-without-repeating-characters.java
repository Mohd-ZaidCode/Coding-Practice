class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        int left = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (map.containsKey(c)) {
            
                left = Math.max(left, map.get(c) + 1);
            }
            
            map.put(c, i); 
            ans = Math.max(ans, i - left + 1); 
        }
        
        return ans;
    }
}