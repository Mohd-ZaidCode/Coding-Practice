class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=Integer.MIN_VALUE;

        for (int []i:accounts) {
            int temp=0;
            for (int a : i) {
                temp+=a;
            }
            if(temp>max){
                max=temp;
            }
        }
        return max;
    }
}