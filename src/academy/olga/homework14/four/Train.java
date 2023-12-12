package academy.olga.homework14.four;

public class Train {
    private String trainDestination;
    private int trainNum;
    private int startTimeHour;
    private int startTimeMinutes;

    public Train(){

    }

    public Train(String trainDestination, int trainNum, int startTimeHour, int startTimeMinutes) {
        this.trainDestination = trainDestination;
        this.trainNum = trainNum;
        this.startTimeHour = startTimeHour;
        this.startTimeMinutes = startTimeMinutes;
    }

    public String getTrainDestination() {
        return trainDestination;
    }

    public void setTrainDestination(String trainDestination) {
        this.trainDestination = trainDestination;
    }

    public int getTrainNum() {
        return trainNum;
    }

    public void setTrainNum(int trainNum) {
        this.trainNum = trainNum;
    }

    public int getStartTimeHour() {
        return startTimeHour;
    }

    public void setStartTimeHour(int startTimeHour, int timeHour) {
        this.startTimeHour = startTimeHour;
    }

    public int getStartTimeMinutes() {
        return startTimeMinutes;
    }

    public void setStartTimeMinutes(int startTimeMinutes) {
        this.startTimeMinutes = startTimeMinutes;
    }

    @Override
    public String toString() {
        return "Train{" +
                "trainDestination='" + trainDestination + '\'' +
                ", trainNum=" + trainNum +
                ", startTime=" + startTimeHour +
                ":" + startTimeMinutes +
                '}';
    }
}
