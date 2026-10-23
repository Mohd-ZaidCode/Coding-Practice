class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int res=0;
        for(int key:map.keySet()){
            if(map.get(key)%k==0)res+=(key*map.get(key));
        }
        return res;
    }
}