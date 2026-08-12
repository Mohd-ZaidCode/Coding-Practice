class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer>ls=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        for(int n:nums1){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for(int n:nums2){
            if(map.containsKey(n) && map.get(n)>0){
                ls.add(n);
                map.put(n,map.get(n)-1);
            }

        }
        int[]res=new int[ls.size()];
        int i=0;
        for(int n:ls){
            res[i++]=n;
        }
        return res;
    }
}