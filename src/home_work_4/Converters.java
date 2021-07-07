package src.home_work_4;

public class Converters {
    private long hours;
    private long minutes;
    private long seconds;
    private long milliseconds;
    private String result;
    long sum;

    public  String stringToWeek(int days) {
        return days/7 + " недель.";
    }

    public  void divideByMilis(long millisecond){
        sum = millisecond;
        long halfResult;
            halfResult = sum/3600000;
            hours = halfResult;
            if (halfResult < 10) {
                result = "0" + halfResult + ":";
            } else {
                result = halfResult + ":";
            }
            sum -= halfResult*3600000;
            halfResult = sum / 60000;
            minutes = halfResult;
            if (halfResult < 10) {
                result += "0" + halfResult + ":";
            } else {
                result += halfResult + ":";
            }
            sum -= halfResult*60000;
            halfResult = sum / 1000;
            seconds = halfResult;
            if (halfResult < 10) {
                result += "0" + halfResult + ".";
            } else {
                result += halfResult + ".";
            }
            sum -= halfResult*1000;
            milliseconds = sum;
            if (sum < 100) {
                result += "0" + sum;
            } else { if (sum < 10) {
                result += "00" + sum;
            }
            else {
                result += sum;
            }
            }
    }
    public String toHoursMinuteSecondMillisecond(long millisecond, boolean shortFormat){
        divideByMilis(millisecond);
        if (shortFormat) {
            return result;
        } else {
            if (!shortFormat) {

                return hours + " часов," + minutes + " минут," + seconds + " секунд," + milliseconds + " милисекунд.";

            }
        }
        return "404";
    }

    public static void main(String[] args) {
        Converters conv = new Converters();
        System.out.println(conv.toHoursMinuteSecondMillisecond(7789001,false));
        System.out.println(conv.stringToWeek(177));
    }
}
