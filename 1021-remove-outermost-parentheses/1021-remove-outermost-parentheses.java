class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder str = new StringBuilder();
        char[] arr = s.toCharArray();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(') {
                if (count > 0)
                    str.append(arr[i]);
                count++;
            } else {
                count--;
                if (count > 0)
                    str.append(arr[i]);
            }
        }
        return str.toString();

    }
}