package string.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class WorkingHoursCalculator2 {

    private static final int WORK_START_HOUR = 12;
    private static final int WORK_END_HOUR = 18;
    private static final int LUNCH_START_HOUR = 13;
    private static final int LUNCH_END_HOUR = 14;
    private static final int SECONDS_PER_HOUR = 3600;

    public static void main(String[] args) {
        int totalWorkDurationInSeconds = 10 * SECONDS_PER_HOUR;
        String result = calculateWorkingHours(totalWorkDurationInSeconds);
        System.out.println("Work duration will be completed by: " + result);
    }

    public static String calculateWorkingHours(int totalWorkDurationInSeconds) {
        // Calculate the total lunch break time in seconds
        int lunchBreakInSeconds = (LUNCH_END_HOUR - LUNCH_START_HOUR) * SECONDS_PER_HOUR;

        // Deduct the lunch break time from the total work duration
        totalWorkDurationInSeconds -= lunchBreakInSeconds;

        int workHoursPerDay = WORK_END_HOUR - WORK_START_HOUR;

        int totalWorkDays = totalWorkDurationInSeconds / (workHoursPerDay * SECONDS_PER_HOUR);
        int remainingSeconds = totalWorkDurationInSeconds % (workHoursPerDay * SECONDS_PER_HOUR);

        int remainingHours = remainingSeconds / SECONDS_PER_HOUR;
        remainingSeconds %= SECONDS_PER_HOUR;

        int remainingMinutes = remainingSeconds / 60;
        remainingSeconds %= 60;

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, WORK_START_HOUR);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);

        calendar.add(Calendar.DAY_OF_YEAR, totalWorkDays);
        calendar.add(Calendar.HOUR_OF_DAY, remainingHours);
        calendar.add(Calendar.MINUTE, remainingMinutes);
        calendar.add(Calendar.SECOND, remainingSeconds);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
        return sdf.format(calendar.getTime());
    }
}
