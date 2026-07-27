class Solution {
    public double average(int[] salary) {
        double res=0;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int num:salary){
            max=Math.max(max,num);
            min=Math.min(min,num);
            res+=num;
        }
        return (res-max-min)/(salary.length-2);
    }
}