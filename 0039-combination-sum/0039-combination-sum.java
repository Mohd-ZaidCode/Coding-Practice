class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();  
        List<Integer> temp = new ArrayList<>(); 
        solve(0,temp,res,target, candidates);
        return res;  
        
    }
    private void solve(int indx, List<Integer> temp, List<List<Integer>> res, int target, int[] candidates){
        if(target == 0){
            res.add(new ArrayList<Integer> (temp));
            return;
        }
        if(target < 0)
            return;
        for(int i = indx; i <candidates.length ; i++){
            temp.add(candidates[i]);
            solve(i,temp,res,target-candidates[i],candidates);
            temp.remove(temp.size()-1);
        }

    }
}