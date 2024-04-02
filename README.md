# XML Transformer Package

## Overview
This package provides functionalities for transforming dates, manipulating dates and times, and handling errors in Java applications.

## Usage 
To use this package in your Java project, you can follow these steps:

1. **Download the Package**: Download the `xmltransformer` package and add it to your project's classpath. (not yet)

2. **Import the Package**: Import the necessary classes from the `xmltransformer` package in your Java code:

    ```java
    import xmltransformer.DateTransformation;
    ```

3. **Use the Functionalities**: You can now use the functionalities provided by the `DateTransformation` class in your code. Here are some examples of what you can do:

    ```java
    // Transform date from one format to another
    String transformedDate = DateTransformation.transformDate("2024-04-02", "yyyy-MM-dd", "dd/MM/yyyy");
    
    // Add days to a date
    String modifiedDate = DateTransformation.addDays("2024-04-02", "yyyy-MM-dd", 5, "dd/MM/yyyy");

    // Calculate the difference between two dates
    long daysDifference = DateTransformation.calculateDaysDifference("2024-04-02", "2024-04-07", "yyyy-MM-dd");
    ```

## Functions
The `DateTransformation` class provides the following functions:

- `transformDate`: Transform date from one format to another.
- `transformUnix`: Transform Unix timestamp to a given format.
- `addDays`: Add days to a given date.
- `addHours`: Add hours to a given time.
- `addMinutes`: Add minutes to a given time.
- `calculateTimeDifference`: Calculate time difference between two times.
- `getWeekNumber`: Get the week number of the year for a given date.
- `getDaysInMonth`: Get the number of days in a given month and year.
- `getDaysRemainingInMonth`: Get the number of days remaining in the current month from a given date.
- `getAge`: Get the age in years based on the given date of birth and the current date.
- `getDaysUntilFutureDate`: Get the number of days between the current date and a specified future date.
- `calculateDaysDifference`: Calculate the number of days between two dates.
- `getQuarterOfYear`: Get the quarter of the year for a given date.
- `getCurrentDate`: Get the current date in a specified format.
- `getCurrentTime`: Get the current time in a specified format.
- `getCurrentDateTime`: Get the current date and time in a specified format.
- `getDayOfWeek`: Get the day of the week for a given date.
- `getDaysBetween`: Get the number of days between two dates.
- `getMonthsBetween`: Get the number of months between two dates.
- `getYearsBetween`: Get the number of years between two dates.
- `convertTimeZone`: Convert a date string from one timezone to another.
- `getStartOfWeek`: Get the start of the week for a given date.
- `getEndOfWeek`: Get the end of the week for a given date.
- `isSameDate`: Check if two date strings represent the same date.
- `addTimeOffset`: Add a specified time offset to a given time.

## License
This package is licensed under the [MIT License](LICENSE).
