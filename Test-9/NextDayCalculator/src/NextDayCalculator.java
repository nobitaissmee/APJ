public class NextDayCalculator {

    public static String getNextDay(String thisDate) throws NumberFormatException {
        String[] dateParts = thisDate.split("/");

        if (dateParts.length != 3) {
            throw new NumberFormatException("404 Not Found");
        }

        int day = parseDay(dateParts[0]);
        int month = parseMonth(dateParts[1]);
        int year = parseYear(dateParts[2]);

        int maxDay=maxDayInMonth(month,year);

        if (day >maxDay) throw new NumberFormatException("Day is found");

        if (++day > maxDay) {
            day = 1;
            month++;
            if (month > 12) {
                month = 1;
                year++;
            }
        }
        return String.format("%s/%s/%d", formatNumber(day), formatNumber(month), year);
    }

    private static int parseDayWithLimit(String datePart, int from, int to) throws NumberFormatException {
        int result = Integer.parseInt(datePart);
        if (result >= from && result <= to) {
            return result;
        } else {
            throw new NumberFormatException("Not date");
        }
    }

    private static int parseDay(String day) throws NumberFormatException {
        return parseDayWithLimit(day, 1, 31);
    }

    private static int parseMonth(String month) throws NumberFormatException {
        return parseDayWithLimit(month, 1, 12);
    }

    private static int parseYear(String year) throws NumberFormatException {
        return parseDayWithLimit(year, 0, 9999);
    }

    private static int maxDayInMonth(int month, int year) {
        return switch (month) {
            case 2 -> isLeapYear(year) ? 29 : 28;
            case 1,3,5,7,8,10,12 -> 31;
            case 4,6,9,11 -> 30;
            default -> -1;
        };
    }

    private static boolean isLeapYear(int year) {
        return year % 100 == 0 ? year % 400 == 0 : year % 4 == 0;
    }

    private static String formatNumber(int num) {
        return num < 10 ? "0" + num : String.valueOf(num);
    }
}

