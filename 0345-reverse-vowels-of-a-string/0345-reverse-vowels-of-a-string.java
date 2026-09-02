class Solution {
    public String reverseVowels(String s) {
        StringBuilder res=new  StringBuilder();
        StringBuilder temp=new  StringBuilder();
        String con="AEIUOaeiou";
        for(char c:s.toCharArray()){
            if(con.contains(c+"")){
                temp.append(c);
            }
        }
        temp.reverse();
        int i=0;
        for(char c:s.toCharArray()){
            if(con.contains(c+"")){
                res.append(temp.charAt(i));
                i++;
            }
            else res.append(c);
        }
        return res.toString();
    }
}