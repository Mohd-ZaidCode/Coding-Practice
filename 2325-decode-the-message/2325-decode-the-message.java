class Solution {
    public String decodeMessage(String key, String message) {
        Map<Character,Character>map=new HashMap<>();
        int i=0;
        for(char c:key.toCharArray()){
            if(c==' '||map.containsKey(c))continue;
            else map.put(c,(char)('a'+i++));
        }
        StringBuilder res=new StringBuilder();
        for(char c: message.toCharArray()){
            if(c==' ')res.append(" ");
            else res.append(map.get(c));
        }
        return res.toString();
    }
}