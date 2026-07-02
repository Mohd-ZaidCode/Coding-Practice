class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>>res= new ArrayList<>();
        Map<String,List<String>>map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] arr=strs[i].toCharArray();
            Arrays.sort(arr);
            String st = new String(arr);
            if(map.containsKey(st)){
               List<String>temp= map.get(st);
               temp.add(strs[i]);
               map.put(st,temp);
            }else{
                 List<String>temp2= new ArrayList<>();
                 temp2.add(strs[i]);
               map.put(st,temp2);
            }
        }
        res.addAll(map.values());
        return res;
    }
}