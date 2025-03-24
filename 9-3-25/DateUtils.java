public class DateUtils {
    public String formatDate(int day, int month, int year) {
        return day + "/" + month + "/" + year;
    }

    public String formatDate(String month, int year) {
        return month + " " + year;
    }
}
