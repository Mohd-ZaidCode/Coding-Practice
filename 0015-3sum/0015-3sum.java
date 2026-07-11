class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>>ls=new ArrayList<>();
        Set<List<Integer>>set=new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int j=i+1;
            int k=nums.length-1;
            while(k>j){
                if(nums[i]+nums[k]+nums[j]==0){
                    List<Integer>temp=new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    Collections.sort(temp);
                    set.add(temp);
                    k--;
                }
                else if(nums[i]+nums[j]+nums[k]>0)k--;
                else j++;
            }
        }
        for(List<Integer> a:set)ls.add(a);
        return ls;
    }
}