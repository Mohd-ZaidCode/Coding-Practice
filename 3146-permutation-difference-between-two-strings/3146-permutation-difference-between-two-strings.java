class Solution {
    public int findPermutationDifference(String s, String t) {
        Map<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),i);
        }
        int res=0;
        for(int i=0;i<t.length();i++){
            res+=Math.abs(map.get(t.charAt(i))-i);
        }
        return res;
    }
}