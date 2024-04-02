package xmltransformer;

import java.time. * ;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

/**
 * A class for transforming dates, manipulating dates and times, and handling errors.
 */
public class DateTransformation {

    /**
     * Transform date from one format to another.
     *
     * @param originalDateString The original date string.
     * @param originalFormatStr  The format of the original date string.
     * @param desiredFormatStr  The desired output format for the transformed date.
     * @return The transformed date string in the desired format, or "Invalid date format" if the input format is invalid.
     */
    public static String transformDate(String originalDateString, String originalFormatStr, String desiredFormatStr) {
        DateTimeFormatter originalFormat = DateTimeFormatter.ofPattern(originalFormatStr);
        DateTimeFormatter desiredFormat = DateTimeFormatter.ofPattern(desiredFormatStr);

        if (!isValidFormat(originalDateString, originalFormatStr)) {
            return "Invalid date format";
        }

        LocalDate originalDate = LocalDate.parse(originalDateString, originalFormat);
        return originalDate.format(desiredFormat);
    }

    /**
     * Transform Unix timestamp to a given format.
     *
     * @param unixTimestamp      The Unix timestamp.
     * @param desiredFormatStr   The desired output format.
     * @return The transformed Unix timestamp string in the desired format, or "Invalid Unix timestamp" if the timestamp is invalid.
     */
    public static String transformUnix(long unixTimestamp, String desiredFormatStr) {
        if (unixTimestamp < 0) {
            return "Invalid Unix timestamp";
        }

        Instant instant = Instant.ofEpochSecond(unixTimestamp);
        LocalDateTime dateTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(desiredFormatStr);
        return dateTime.format(formatter);
    }

    /**
     * Add days to a given date.
     *
     * @param originalDateString    The original date string.
     * @param originalFormatStr     The format of the original date string.
     * @param daysToAdd             The number of days to add.
     * @param desiredFormatStr      The desired output format.
     * @return The modified date string after adding days, or "Invalid date format" if the input format is invalid.
     */
    public static String addDays(String originalDateString, String originalFormatStr, long daysToAdd, String desiredFormatStr) {
        DateTimeFormatter originalFormat = DateTimeFormatter.ofPattern(originalFormatStr);
        DateTimeFormatter desiredFormat = DateTimeFormatter.ofPattern(desiredFormatStr);

        if (!isValidFormat(originalDateString, originalFormatStr)) {
            return "Invalid date format";
        }

        LocalDate originalDate = LocalDate.parse(originalDateString, originalFormat);
        LocalDate modifiedDate = originalDate.plusDays(daysToAdd);
        return modifiedDate.format(desiredFormat);
    }

    /**
     * Add hours to a given time.
     *
     * @param originalTimeString   The original time string.
     * @param originalFormatStr    The format of the original time string.
     * @param hoursToAdd           The number of hours to add.
     * @param desiredFormatStr     The desired output format.
     * @return The modified time string after adding hours, or "Invalid time format" if the input format is invalid.
     */
    public static String addHours(String originalTimeString, String originalFormatStr, long hoursToAdd, String desiredFormatStr) {
        DateTimeFormatter originalFormat = DateTimeFormatter.ofPattern(originalFormatStr);
        DateTimeFormatter desiredFormat = DateTimeFormatter.ofPattern(desiredFormatStr);

        if (!isValidFormat(originalTimeString, originalFormatStr)) {
            return "Invalid time format";
        }

        LocalTime originalTime = LocalTime.parse(originalTimeString, originalFormat);
        LocalTime modifiedTime = originalTime.plusHours(hoursToAdd);
        return modifiedTime.format(desiredFormat);
    }

    /**
     * Add minutes to a given time.
     *
     * @param originalTimeString   The original time string.
     * @param originalFormatStr    The format of the original time string.
     * @param minutesToAdd         The number of minutes to add.
     * @param desiredFormatStr     The desired output format.
     * @return The modified time string after adding minutes, or "Invalid time format" if the input format is invalid.
     */
    public static String addMinutes(String originalTimeString, String originalFormatStr, long minutesToAdd, String desiredFormatStr) {
        DateTimeFormatter originalFormat = DateTimeFormatter.ofPattern(originalFormatStr);
        DateTimeFormatter desiredFormat = DateTimeFormatter.ofPattern(desiredFormatStr);

        if (!isValidFormat(originalTimeString, originalFormatStr)) {
            return "Invalid time format";
        }

        LocalTime originalTime = LocalTime.parse(originalTimeString, originalFormat);
        LocalTime modifiedTime = originalTime.plusMinutes(minutesToAdd);
        return modifiedTime.format(desiredFormat);
    }

    /**
     * Add seconds to a given time.
     *
     * @param originalTimeString   The original time string.
     * @param originalFormatStr    The format of the original time string.
     * @param secondsToAdd         The number of seconds to add.
     * @param desiredFormatStr     The desired output format.
     * @return The modified time string after adding seconds, or "Invalid time format" if the input format is invalid.
     */
    public static String addSeconds(String originalTimeString, String originalFormatStr, long secondsToAdd, String desiredFormatStr) {
        DateTimeFormatter originalFormat = DateTimeFormatter.ofPattern(originalFormatStr);
        DateTimeFormatter desiredFormat = DateTimeFormatter.ofPattern(desiredFormatStr);

        if (!isValidFormat(originalTimeString, originalFormatStr)) {
            return "Invalid time format";
        }

        LocalTime originalTime = LocalTime.parse(originalTimeString, originalFormat);
        LocalTime modifiedTime = originalTime.plusSeconds(secondsToAdd);
        return modifiedTime.format(desiredFormat);
    }

    /**
     * Add months to a given date.
     *
     * @param originalDateString   The original date string.
     * @param originalFormatStr    The format of the original date string.
     * @param monthsToAdd           The number of months to add.
     * @param desiredFormatStr     The desired output format.
     * @return The modified date string after adding months, or "Invalid date format" if the input format is invalid.
     */
    public static String addMonths(String originalDateString, String originalFormatStr, long monthsToAdd, String desiredFormatStr) {
        DateTimeFormatter originalFormat = DateTimeFormatter.ofPattern(originalFormatStr);
        DateTimeFormatter desiredFormat = DateTimeFormatter.ofPattern(desiredFormatStr);

        if (!isValidFormat(originalDateString, originalFormatStr)) {
            return "Invalid date format";
        }

        LocalDate originalDate = LocalDate.parse(originalDateString, originalFormat);
        LocalDate modifiedDate = originalDate.plusMonths(monthsToAdd);
        return modifiedDate.format(desiredFormat);
    }

    /**
     * Add years to a given date.
     *
     * @param originalDateString   The original date string.
     * @param originalFormatStr    The format of the original date string.
     * @param yearsToAdd           The number of years to add.
     * @param desiredFormatStr     The desired output format.
     * @return The modified date string after adding years, or "Invalid date format" if the input format is invalid.
     */
    public static String addYears(String originalDateString, String originalFormatStr, long yearsToAdd, String desiredFormatStr) {
        DateTimeFormatter originalFormat = DateTimeFormatter.ofPattern(originalFormatStr);
        DateTimeFormatter desiredFormat = DateTimeFormatter.ofPattern(desiredFormatStr);

        if (!isValidFormat(originalDateString, originalFormatStr)) {
            return "Invalid date format";
        }

        LocalDate originalDate = LocalDate.parse(originalDateString, originalFormat);
        LocalDate modifiedDate = originalDate.plusYears(yearsToAdd);
        return modifiedDate.format(desiredFormat);
    }

    /**
     * Check if a year is a leap year.
     *
     * @param year The year to check.
     * @return True if the year is a leap year, false otherwise.
     */
    public static boolean isLeapYear(int year) {
        return Year.of(year).isLeap();
    }

    /**
     * Get the week number of the year for a given date.
     *
     * @param dateString The date string.
     * @param formatStr The format of the date string.
     * @return The week number of the year as an integer, or -1 if the input format is invalid.
     */
    public static int getWeekNumber(String dateString, String formatStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formatStr);

        if (!isValidFormat(dateString, formatStr)) {
            return -1; // Error: Invalid date format
        }

        LocalDate date = LocalDate.parse(dateString, formatter);
        return date.get(WeekFields.ISO.weekOfWeekBasedYear());
    }

    /**
     * Get the number of days in a given month and year.
     *
     * @param year The year.
     * @param month The month.
     * @return The number of days in the specified month and year.
     */
    public static int getDaysInMonth(int year, int month) {
        return YearMonth.of(year, month).lengthOfMonth();
    }

    /**
     * Get the number of days remaining in the current month from a given date.
     *
     * @param dateString The date string.
     * @param formatStr The format of the date string.
     * @return The number of days remaining in the current month, or -1 if the input format is invalid.
     */
    public static int getDaysRemainingInMonth(String dateString, String formatStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formatStr);

        if (!isValidFormat(dateString, formatStr)) {
            return -1; // Error: Invalid date format
        }

        LocalDate date = LocalDate.parse(dateString, formatter);
        YearMonth yearMonth = YearMonth.from(date);
        return yearMonth.lengthOfMonth() - date.getDayOfMonth();
    }

    /**
     * Get the age in years based on the given date of birth and the current date.
     *
     * @param birthDateString The date of birth string.
     * @param formatStr The format of the date string.
     * @return The age in years, or -1 if the input format is invalid.
     */
    public static int getAge(String birthDateString, String formatStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formatStr);

        if (!isValidFormat(birthDateString, formatStr)) {
            return -1; // Error: Invalid date format
        }

        LocalDate birthDate = LocalDate.parse(birthDateString, formatter);
        LocalDate currentDate = LocalDate.now();
        return Period.between(birthDate, currentDate).getYears();
    }

    /**
     * Get the number of days between the current date and a specified future date.
     *
     * @param futureDateString The future date string.
     * @param formatStr The format of the date string.
     * @return The number of days between the current date and the future date, or -1 if the input format is invalid.
     */
    public static long getDaysUntilFutureDate(String futureDateString, String formatStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formatStr);

        if (!isValidFormat(futureDateString, formatStr)) {
            return -1; // Error: Invalid date format
        }

        LocalDate futureDate = LocalDate.parse(futureDateString, formatter);
        LocalDate currentDate = LocalDate.now();
        return ChronoUnit.DAYS.between(currentDate, futureDate);
    }

    /**
     * Calculate the number of days between two dates.
     *
     * @param startDateString   The start date string.
     * @param endDateString     The end date string.
     * @param formatStr         The format of the date strings.
     * @return The number of days between the start and end dates, or -1 if the input format is invalid.
     */
    public static long calculateDaysDifference(String startDateString, String endDateString, String formatStr) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formatStr);
            LocalDate startDate = LocalDate.parse(startDateString, formatter);
            LocalDate endDate = LocalDate.parse(endDateString, formatter);
            return ChronoUnit.DAYS.between(startDate, endDate);
        } catch (DateTimeParseException e) {
            return -1; // Error: Invalid date format
        }
    }

    /**
     * Get the quarter of the year for a given date.
     *
     * @param dateString The date string.
     * @param formatStr The format of the date string.
     * @return The quarter of the year as an integer (1, 2, 3, or 4), or -1 if the input format is invalid.
     */
    public static int getQuarterOfYear(String dateString, String formatStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formatStr);

        if (!isValidFormat(dateString, formatStr)) {
            return -1; // Error: Invalid date format
        }

        LocalDate date = LocalDate.parse(dateString, formatter);
        int monthValue = date.getMonthValue();
        return (monthValue - 1) / 3 + 1;
    }

    /**
     * Get the current date in a specified format.
     *
     * @param formatStr The desired output format.
     * @return The current date string in the specified format.
     */
    public static String getCurrentDate(String formatStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formatStr);
        LocalDate currentDate = LocalDate.now();
        return currentDate.format(formatter);
    }

    /**
     * Get the current time in a specified format.
     *
     * @param formatStr The desired output format.
     * @return The current time string in the specified format.
     */
    public static String getCurrentTime(String formatStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formatStr);
        LocalTime currentTime = LocalTime.now();
        return currentTime.format(formatter);
    }

    /**
     * Get the current date and time in a specified format.
     *
     * @param formatStr The desired output format.
     * @return The current date and time string in the specified format.
     */
    public static String getCurrentDateTime(String formatStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formatStr);
        LocalDateTime currentDateTime = LocalDateTime.now();
        return currentDateTime.format(formatter);
    }

    /**
     * Get the day of the week for a given date.
     *
     * @param dateString The date string.
     * @param formatStr The format of the date string.
     * @return The day of the week as a string (e.g., "Monday"), or "Invalid date format" if the input format is invalid.
     */
    public static String getDayOfWeek(String dateString, String formatStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formatStr);

        if (!isValidFormat(dateString, formatStr)) {
            return "Invalid date format";
        }

        LocalDate date = LocalDate.parse(dateString, formatter);
        return date.getDayOfWeek().toString();
    }

    /**
     * Get the number of days between two dates.
     *
     * @param startDateString The start date string.
     * @param endDateString The end date string.
     * @param formatStr The format of the date strings.
     * @return The number of days between the two dates, or -1 if the input format is invalid.
     */
    public static long getDaysBetween(String startDateString, String endDateString, String formatStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formatStr);

        if (!isValidFormat(startDateString, formatStr) || !isValidFormat(endDateString, formatStr)) {
            return -1; // Error: Invalid date format
        }

        LocalDate startDate = LocalDate.parse(startDateString, formatter);
        LocalDate endDate = LocalDate.parse(endDateString, formatter);
        return ChronoUnit.DAYS.between(startDate, endDate);
    }

    /**
     * Get the number of months between two dates.
     *
     * @param startDateString The start date string.
     * @param endDateString The end date string.
     * @param formatStr The format of the date strings.
     * @return The number of months between the two dates, or -1 if the input format is invalid.
     */
    public static long getMonthsBetween(String startDateString, String endDateString, String formatStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formatStr);

        if (!isValidFormat(startDateString, formatStr) || !isValidFormat(endDateString, formatStr)) {
            return -1; // Error: Invalid date format
        }

        LocalDate startDate = LocalDate.parse(startDateString, formatter);
        LocalDate endDate = LocalDate.parse(endDateString, formatter);
        return ChronoUnit.MONTHS.between(startDate, endDate);
    }

    /**
     * Get the number of years between two dates.
     *
     * @param startDateString The start date string.
     * @param endDateString The end date string.
     * @param formatStr The format of the date strings.
     * @return The number of years between the two dates, or -1 if the input format is invalid.
     */
    public static long getYearsBetween(String startDateString, String endDateString, String formatStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formatStr);

        if (!isValidFormat(startDateString, formatStr) || !isValidFormat(endDateString, formatStr)) {
            return -1; // Error: Invalid date format
        }

        LocalDate startDate = LocalDate.parse(startDateString, formatter);
        LocalDate endDate = LocalDate.parse(endDateString, formatter);
        return ChronoUnit.YEARS.between(startDate, endDate);
    }

    /**
     * Convert a date string from one timezone to another.
     *
     * @param originalDateString The original date string.
     * @param originalZoneIdStr The timezone of the original date.
     * @param desiredZoneIdStr The desired timezone for the output.
     * @param originalFormatStr The format of the original date string.
     * @param desiredFormatStr The desired output format.
     * @return The transformed date string in the desired timezone and format, or "Invalid date format" if the input format is invalid.
     */
    public static String convertTimeZone(String originalDateString, String originalZoneIdStr, String desiredZoneIdStr, String originalFormatStr, String desiredFormatStr) {
        try {
            ZoneId originalZoneId = ZoneId.of(originalZoneIdStr);
            ZoneId desiredZoneId = ZoneId.of(desiredZoneIdStr);
            DateTimeFormatter originalFormat = DateTimeFormatter.ofPattern(originalFormatStr);
            DateTimeFormatter desiredFormat = DateTimeFormatter.ofPattern(desiredFormatStr);
            ZonedDateTime originalDateTime = ZonedDateTime.of(LocalDateTime.parse(originalDateString, originalFormat), originalZoneId);
            ZonedDateTime desiredDateTime = originalDateTime.withZoneSameInstant(desiredZoneId);
            return desiredDateTime.format(desiredFormat);
        } catch (DateTimeParseException | ZoneRulesException e) {
            return "Invalid date format or timezone";
        }
    }

    /**
     * Get the start of the week for a given date.
     *
     * @param dateString The date string.
     * @param formatStr The format of the date string.
     * @return The start of the week as a LocalDate object, or null if the input format is invalid.
     */
    public static LocalDate getStartOfWeek(String dateString, String formatStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formatStr);

        if (!isValidFormat(dateString, formatStr)) {
            return null; // Error: Invalid date format
        }

        LocalDate date = LocalDate.parse(dateString, formatter);
        return date.with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY));
    }

    /**
     * Get the end of the week for a given date.
     *
     * @param dateString The date string.
     * @param formatStr The format of the date string.
     * @return The end of the week as a LocalDate object, or null if the input format is invalid.
     */
    public static LocalDate getEndOfWeek(String dateString, String formatStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formatStr);

        if (!isValidFormat(dateString, formatStr)) {
            return null; // Error: Invalid date format
        }

        LocalDate date = LocalDate.parse(dateString, formatter);
        return date.with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY));
    }

    /**
     * Check if two date strings represent the same date.
     *
     * @param dateString1 The first date string.
     * @param formatStr1 The format of the first date string.
     * @param dateString2 The second date string.
     * @param formatStr2 The format of the second date string.
     * @return True if the dates are the same, false otherwise.
     */
    public static boolean isSameDate(String dateString1, String formatStr1, String dateString2, String formatStr2) {
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern(formatStr1);
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern(formatStr2);

        if (!isValidFormat(dateString1, formatStr1) || !isValidFormat(dateString2, formatStr2)) {
            return false; // Error: Invalid date format
        }

        LocalDate date1 = LocalDate.parse(dateString1, formatter1);
        LocalDate date2 = LocalDate.parse(dateString2, formatter2);
        return date1.isEqual(date2);
    }

    /**
     * Add a specified time offset to a given time.
     *
     * @param originalTimeString   The original time string.
     * @param originalFormatStr    The format of the original time string.
     * @param offsetToAdd          The time offset to add, in seconds.
     * @param desiredFormatStr     The desired output format.
     * @return The modified time string after adding the offset, or "Invalid time format" if the input format is invalid.
     */
    public static String addTimeOffset(String originalTimeString, String originalFormatStr, long offsetToAdd, String desiredFormatStr) {
        DateTimeFormatter originalFormat = DateTimeFormatter.ofPattern(originalFormatStr);
        DateTimeFormatter desiredFormat = DateTimeFormatter.ofPattern(desiredFormatStr);

        if (!isValidFormat(originalTimeString, originalFormatStr)) {
            return "Invalid time format";
        }

        LocalTime originalTime = LocalTime.parse(originalTimeString, originalFormat);
        LocalTime modifiedTime = originalTime.plusSeconds(offsetToAdd);
        return modifiedTime.format(desiredFormat);
    }

    /**
     * Check if a given string is in a valid format.
     *
     * @param dateString  The date or time string to check.
     * @param formatStr   The expected format of the date or time string.
     * @return True if the string is in the expected format, false otherwise.
     */
    private static boolean isValidFormat(String dateString, String formatStr) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formatStr);
            LocalDate.parse(dateString, formatter);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }
}
