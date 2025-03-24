public class TimeConverter {
    public int toMinutes(int hours) {
        return hours * 60;
    }

    public int toMinutes(int days, boolean convertDays) {
        if (convertDays) {
            return days * 24 * 60;
        }
        return days;
    }
}
