package donghobamgio;

public class StopWatch {
    private long startTime;
    private long endTime;

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public StopWatch() {
    }
    public void start(long startTime){
        this.startTime=startTime;
    }
    public void stop(long endTime){
        this.endTime=endTime;
    }
    public long getElapsedTime(){
        return getEndTime()-getStartTime();
    }
}
