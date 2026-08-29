class Solution {
    public int numberOfBeams(String[] bank) {
        int ans=0;
        int prev=0;
        int next=0;
        for(String s:bank){
            String temp=s.replace("0","");
            System.out.println(temp);
            next=temp.length();
            ans+=next*prev;
            if(next!=0)prev=next;
        }
        return ans;
    }
}