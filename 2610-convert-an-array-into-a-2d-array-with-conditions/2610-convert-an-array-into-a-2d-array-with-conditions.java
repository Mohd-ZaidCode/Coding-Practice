class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>>res=new ArrayList<>();
        for(int n:nums){
            boolean added=false;
            for(List<Integer> ls:res){
                if(!ls.contains(n)){
                    ls.add(n);
                    added=true;
                    break;
                }
            }
            if(!added){
                List<Integer>temp=new ArrayList<>();
                temp.add(n);
                res.add(temp);
            }
        }return res;
    }
}