package com.example;
public class StepTracker{
    private int minstep;
    private int activeDays;
    private int numOfDays;
    private int totalstep;

    public StepTracker(int minstep){
        this.minstep=minstep;
        this.activeDays=0;
        this.numOfDays=0;
        this.totalstep=0;
    }
    public int getMinstep(){
        return minstep;
    }
    public int activeDays(){
        return this.activeDays;
    }
    public int numOfDays(){
        return this.numOfDays;
    }
    public double averageSteps(){
        if (numOfDays>0){
            return (double) totalstep/numOfDays;
        }
        return 0;
    }
    public void addDailySteps(int todaystep){
        if (todaystep>minstep){
            activeDays++;
        }
        totalstep+=todaystep;
        numOfDays++;
    }
}





//write your class implementation here
