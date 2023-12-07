package OlgaJava.HomeWork12.Six;

public class Data {
    private static final int HOURS_IN_A_DAY = 23;
    private static final int MINS_IN_A_HOUR = 59;
    private static final int SECUNDS_IN_A_MIN = 59;
    private int hour;
    private int min;
    private int sec;

    public Data(int hour, int min, int sec) {
        setHour(hour);
        setMin(min);
        setSec(sec);
    }

    public void addHour(int value) {
        setHour(hour + value);
    }

    public void addMin(int value) {
        if (value <= MINS_IN_A_HOUR) {
            setMin(min + value);
        } else {
            setMin(min);
        }
    }

    public void addSec(int value) {
        if (value <= SECUNDS_IN_A_MIN) {
            setSec(sec + value);
        } else {
            setSec(sec);
        }
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
        if (hour < 0) {
            this.hour = 0;
        } else if (hour > HOURS_IN_A_DAY) {
            this.hour = hour % 24;
        }
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
        if (min < 0) {
            this.min = 0;
        } else if (min > MINS_IN_A_HOUR) {
            this.min = min % 60;
            this.hour++;
        }
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
        if (sec < 0) {
            this.sec = 0;
        } else if (sec > SECUNDS_IN_A_MIN) {
            this.sec = sec % 60;
            this.min++;
        }
    }

    @Override
    public String toString() {
        return "Time{" + hour + ":" + min + ":" + sec +
                '}';
    }
}
