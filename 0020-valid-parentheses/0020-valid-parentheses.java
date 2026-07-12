class Solution {
    public boolean isValid(String s) {
    char[] arr= new char[s.length()];
    int top=0;
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
            arr[top]=s.charAt(i);
            top++;}
        else{
           if(top==0) return false;

           if(
            (s.charAt(i)==')'&&arr[top-1]!='(')||
            (s.charAt(i)==']'&&arr[top-1]!='[')||
            (s.charAt(i)=='}'&&arr[top-1]!='{')
           ){return false;}
            top--;
            }
    }if(top!=0)return false;
    return true;

}
    
}