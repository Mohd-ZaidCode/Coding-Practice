class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character,Integer>map=new HashMap<>();
        for(char c:text.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int a=Integer.MAX_VALUE;
        a=Math.min(a,map.getOrDefault('b',0));
        a=Math.min(a,map.getOrDefault('a',0));
        a=Math.min(a,map.getOrDefault('l',0)/2);
        a=Math.min(a,map.getOrDefault('o',0)/2);
        a=Math.min(a,map.getOrDefault('n',0));
        return a;

    }
}