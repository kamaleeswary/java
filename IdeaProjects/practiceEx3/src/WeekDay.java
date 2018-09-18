import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class WeekDay {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, 0); // ! clear would not reset the hour of day !
        SimpleDateFormat ft = new SimpleDateFormat("EEEE dd-MM-yyyy");
        Date dt=cal.getTime();
        cal.set(Calendar.DAY_OF_WEEK, cal.getFirstDayOfWeek());
        System.out.println("Start of this week:    "+ft.format(cal.getTime()));
        cal.add(Calendar.DAY_OF_WEEK, 6);
        System.out.println("End of the this week:  " + ft.format(cal.getTime()));
    }
}


