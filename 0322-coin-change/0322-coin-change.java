class Solution {
    public int coinChange(int[] coins, int amount) {
        return coin(coins,amount,new HashMap<>());

    }
    public int coin(int[]coins,int amount,HashMap<Integer,Integer>memo){
        if(amount==0)return 0;
        if(amount<0)return -1;
        if(memo.containsKey(amount))return memo.get(amount);
        int minCoin=-1;
        for(int n:coins){
            int subamount=amount-n;    
            int subCoin=coin(coins,subamount,memo);
            if(subCoin!=-1){
                int num=subCoin+1;
                if(num<minCoin || minCoin==-1){
                    minCoin=num;
                }
            }          
        }
        memo.put(amount,minCoin);
        return minCoin;
    }
    
    
}