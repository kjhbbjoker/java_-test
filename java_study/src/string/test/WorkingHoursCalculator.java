package string.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class WorkingHoursCalculator {

    private static final int WORK_START_HOUR = 12;
    private static final int WORK_END_HOUR = 18;
    private static final int SECONDS_PER_HOUR = 3600;

    public static void main(String[] args) {
        int totalWorkDurationInSeconds = 20 * SECONDS_PER_HOUR;
        String result = calculateWorkingHours(45000);
        System.out.println("Work duration will be completed by: " + result);
    }

    public static String calculateWorkingHours(int totalWorkDurationInSeconds) {
        //총 근무시간  끝나는 시간 - 시작 시간
        int workHoursPerDay = WORK_END_HOUR - WORK_START_HOUR;


        int totalWorkDays = totalWorkDurationInSeconds / (workHoursPerDay * SECONDS_PER_HOUR);

        //일수 남은 시간
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
