package xmltransformer;

import java.time.* ;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * A class for transforming dates, manipulating dates and times, and handling errors.
 */
public class DateTransformation {
    private String originalDateString;
    private String originalFormatStr;
    private String desiredFormatStr;

    public String getOriginalDateString() {
        return originalDateString;
    }

    public void setOriginalDateString(String originalDateString) {
        this.originalDateString = originalDateString;
    }

    public String getOriginalFormatStr() {
        return originalFormatStr;
    }

    public void setOriginalFormatStr(String originalFormatStr) {
        this.originalFormatStr = originalFormatStr;
    }

    public String getDesiredFormatStr() {
        return desiredFormatStr;
    }

    public void setDesiredFormatStr(String desiredFormatStr) {
        this.desiredFormatStr = desiredFormatStr;
    }

    /**
     * Transform date from one format to another.
     *
     * @return The transformed date string in the desired format, or "Invalid date format" if the input format is invalid.
     */
    public String transformDate() {
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
     * @param unixTimestamp The Unix timestamp.
     * @return The transformed Unix timestamp string in the desired format, or "Invalid Unix timestamp" if the timestamp is invalid.
     */
    public String transformUnix(long unixTimestamp) {
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
     * @param daysToAdd The number of days to add.
     * @return The modified date string after adding days, or "Invalid date format" if the input format is invalid.
     */
    public String addDays(long daysToAdd) {
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
     * @param hoursToAdd The number of hours to add.
     * @return The modified time string after adding hours, or "Invalid time format" if the input format is invalid.
     */
    public String addHours(long hoursToAdd) {
        DateTimeFormatter originalFormat = DateTimeFormatter.ofPattern(originalFormatStr);
        DateTimeFormatter desiredFormat = DateTimeFormatter.ofPattern(desiredFormatStr);

        if (!isValidFormat(originalDateString, originalFormatStr)) {
            return "Invalid time format";
        }

        LocalTime originalTime = LocalTime.parse(originalDateString, originalFormat);
        LocalTime modifiedTime = originalTime.plusHours(hoursToAdd);
        return modifiedTime.format(desiredFormat);
    }

    /**
     * Add minutes to a given time.
     *
     * @param minutesToAdd The number of minutes to add.
     * @return The modified time string after adding minutes, or "Invalid time format" if the input format is invalid.
     */
    public String addMinutes(long minutesToAdd) {
        DateTimeFormatter originalFormat = DateTimeFormatter.ofPattern(originalFormatStr);
        DateTimeFormatter desiredFormat = DateTimeFormatter.ofPattern(desiredFormatStr);

        if (!isValidFormat(originalDateString, originalFormatStr)) {
            return "Invalid time format";
        }

        LocalTime originalTime = LocalTime.parse(originalDateString, originalFormat);
        LocalTime modifiedTime = originalTime.plusMinutes(minutesToAdd);
        return modifiedTime.format(desiredFormat);
    }

    /**
     * Add seconds to a given time.
     *
     * @param secondsToAdd The number of seconds to add.
     * @return The modified time string after adding seconds, or "Invalid time format" if the input format is invalid.
     */
    public String addSeconds(long secondsToAdd) {
        DateTimeFormatter originalFormat = DateTimeFormatter.ofPattern(originalFormatStr);
        DateTimeFormatter desiredFormat = DateTimeFormatter.ofPattern(desiredFormatStr);

        if (!isValidFormat(originalDateString, originalFormatStr)) {
            return "Invalid time format";
        }

        LocalTime originalTime = LocalTime.parse(originalDateString, originalFormat);
        LocalTime modifiedTime = originalTime.plusSeconds(secondsToAdd);
        return modifiedTime.format(desiredFormat);
    }

    /**
     * Add months to a given date.
     *
     * @param monthsToAdd The number of months to add.
     * @return The modified date string after adding months, or "Invalid date format" if the input format is invalid.
     */
    public String addMonths(long monthsToAdd) {
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
     * @param yearsToAdd The number of years to add.
     * @return The modified date string after adding years, or "Invalid date format" if the input format is invalid.
     */
    public String addYears(long yearsToAdd) {
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
     * Check if a given string is in a valid format.
     *
     * @param dateString The date or time string to check.
     * @param formatStr  The expected format of the date or time string.
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
