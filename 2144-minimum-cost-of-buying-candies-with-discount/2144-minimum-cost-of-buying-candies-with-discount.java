class Solution {
    public int minimumCost(int[] cost) {
        int price=0;
        Arrays.sort(cost);
        int len=cost.length;
        while(len-->0){
            price+=cost[len--];
            if(len<0)return price;
            price+=cost[len--];
        }
        return price;
    }
}