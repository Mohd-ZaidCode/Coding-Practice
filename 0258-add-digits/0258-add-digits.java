class Solution {
    public int addDigits(int num) {
        int res=Math.abs(num);
        while(res>=10){
            res=sumOfDigits(res);
        }
       return res ;
    }
    public static int sumOfDigits(int a){
        int sum=0;
       while(a>0){
        sum+=a%10;
        a=a/10;
       }
    return sum;
    }
}