class Solution {
    public int[] findArray(int[] pref) {
        int n = pref[0];
        for (int i = 1; i < pref.length; i++) {
            n = n ^ pref[i];
            int temp=pref[i];
            pref[i] = n;
            n=temp;
        }
        return pref;
    }
}