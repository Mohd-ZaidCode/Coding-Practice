class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        int start=nums[0];
        List<Integer>ls=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+start){
                while(i+start!=nums[i]){
                    ls.add(i+start);
                    start++;
                }
            }
        }
        return ls;
    }
}