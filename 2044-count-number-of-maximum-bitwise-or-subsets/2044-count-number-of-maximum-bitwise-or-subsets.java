class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int cnt=0;
        List<List<Integer>>ls=new ArrayList<>();
        List<Integer>temp=new ArrayList<>();
        ls.add(temp);
        for(int j=0;j<nums.length;j++){
            int len=ls.size();
            for(int i=0;i<len;i++){
                temp=new ArrayList<>(ls.get(i));
                temp.add(nums[j]);
                ls.add(temp);
            }
        }
        int max=Integer.MIN_VALUE;
        for(List<Integer>t:ls){
            int l=t.size();
            if(l==0)continue;
            int sum=0;
            for(int i=0;i<l;i++){
                sum=sum |t.get(i);
            }
            
            if(sum==max)cnt++;
            else if(sum>max){
                cnt=1;
                max=sum;
            }
        }
        return cnt;
    }
}