class Solution {
    public int calculateScore(int a, int b) {
        int c1=0;
        int c2=0;
        while(a>0){
            if(a%2!=0)c1++;
            a/=2;
        }   
        while(b>0){
            if(b%2!=0)c2++;
            b/=2;
        }   
        if(c1>=c2)return c1*c2;
        return c2/c1;
    }
}