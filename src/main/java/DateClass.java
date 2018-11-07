import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateClass {
    private Date dateNow;
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public DateClass(Date date) {
        this.dateNow = date;
    }

    public String getDate() {
        return simpleDateFormat.format(dateNow);
    }

    public void Increment(int daysAmount) {
        Calendar calender = Calendar.getInstance();
        calender.setTime(this.dateNow);
        calender.add(Calendar.DATE, daysAmount);
        this.dateNow = calender.getTime();
    }
}