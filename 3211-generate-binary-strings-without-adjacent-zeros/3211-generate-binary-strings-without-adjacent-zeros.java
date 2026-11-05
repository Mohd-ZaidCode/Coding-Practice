class Solution {
    List<String>ls=new ArrayList<>();
    public List<String> validStrings(int n) {
        test("",n);
        return ls;
    }
    public void test(String s,int n){
        if(s.length()==n){
            boolean b=true;
            int len=0;
            for(int i=0;i<n;i++){
                if(s.charAt(i)=='0')len++;
                else len=0;
                if(len==2){b=false;System.out.println(s);break;}
            }
            if(b)ls.add(s);
            return;
        }
        if((s.length()>0 && s.charAt(s.length()-1)!=0) || s.length()==0)
        test(s+"0",n);
        test(s+"1",n);
    }
}