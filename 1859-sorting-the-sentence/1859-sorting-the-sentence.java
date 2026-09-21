class Solution {
    public String sortSentence(String s) {
        String[] arr = s.trim().split(" ");
        String[] res = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[arr[i].charAt(arr[i].length() - 1) - '0' - 1] = arr[i].substring(0, arr[i].length() - 1);
        }

        StringBuilder ans = new StringBuilder();
        for (String st : res)
            ans.append(" " + st);
        String r = ans.toString().trim();
        return r;
    }
}