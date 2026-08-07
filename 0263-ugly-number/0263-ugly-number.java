class Solution {
    public boolean isUgly(int n) {
        if(n<=0)return false;
        while(n%2==0){
            n/=2;
        }System.out.println(n);
         while(n%3==0){
            n/=3;
        }
        while(n%5==0){
            n/=5;
        }
        if(n>5)return false;
        return true;
    }
   
}