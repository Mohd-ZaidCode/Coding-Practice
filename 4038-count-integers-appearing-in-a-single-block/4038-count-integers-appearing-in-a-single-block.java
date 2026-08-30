class Solution {
    public int countSpecialIntegers(int[] nums) {
        Set<Integer>s=new HashSet<>();
        Set<Integer>prev=new HashSet<>();

        int n=nums.length;
        int i=0;
        while(i<n){
            int val=nums[i];
            if(s.contains(val)){
                prev.add(val);
            }else s.add(val);
            while(i<n && nums[i]==val)i++;
        }
        return s.size()-prev.size();
        
    }
}