class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int a=0;
        int ans=0;
        if(ruleKey.equals("color"))a=1;
        else if(ruleKey.equals("name"))a=2;
        for(List<String> ls:items){
            if(ls.get(a).equals(ruleValue))ans++;
        }
        return ans;
        
    }
}