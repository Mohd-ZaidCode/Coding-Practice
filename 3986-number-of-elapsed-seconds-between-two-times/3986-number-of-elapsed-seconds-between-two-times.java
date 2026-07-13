class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        String[]start=startTime.split(":");
        String[]end=endTime.split(":");
        int ans=0;
        ans+=(Integer.parseInt(end[0])-Integer.parseInt(start[0]))*3600;
        ans+=(Integer.parseInt(end[1])-Integer.parseInt(start[1]))*60;
        ans+=(Integer.parseInt(end[2])-Integer.parseInt(start[2]));
        return ans;
    }
}