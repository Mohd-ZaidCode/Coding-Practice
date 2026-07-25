class Solution {
    public int maxProduct(int n) {
        int first=0;
        int sec=0;
        while(n>0){
            if(n%10>=first){
                sec=first;
                first=n%10;
            }
            else if(n%10>sec)sec=n%10;
            n/=10;
        }
        return first*sec;
    }
}