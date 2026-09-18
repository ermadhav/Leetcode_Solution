class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {

        // spliting the hr:min:sec using split()
        String[] partOne = startTime.split(":");
        String[] partTwo = endTime.split(":");

        // total seconds in One(StartTime)
        int totalSecondOne = 3600*Integer.parseInt(partOne[0])+60*Integer.parseInt(partOne[1])+Integer.parseInt(partOne[2]);

        // total seconds in Two(TwoTime)
        int totalSecondTwo = 3600*Integer.parseInt(partTwo[0])+60*Integer.parseInt(partTwo[1])+Integer.parseInt(partTwo[2]);

        // return the diff
        return totalSecondTwo-totalSecondOne;
    }
}