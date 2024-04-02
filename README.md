# DateTransformation

The `DateTransformation` class provides methods for transforming dates, manipulating dates and times, and handling errors using the `java.time` package in Java.
 - `Helper-Java` Repo to make easier transformation package for Integration purpose

## Methods

- `transformDate`: Transforms a date from one format to another.
- `transformUnix`: Transforms a Unix timestamp to a given format.
- `addDays`: Adds days to a given date.
- `addHours`: Adds hours to a given time.
- `addMinutes`: Adds minutes to a given time.
- `addSeconds`: Adds seconds to a given time.
- `addMonths`: Adds months to a given date.
- `addYears`: Adds years to a given date.
- `isLeapYear`: Checks if a given year is a leap year.

## Usage

1. Create an instance of the `DateTransformation` class.
2. Set the original date or time string, original format, and desired format using setter methods.
3. Call the desired method to perform the transformation or manipulation.

Example usage:

```java
DateTransformation transformation = new DateTransformation();

transformation.setOriginalDateString("02-04-2024");
transformation.setOriginalFormatStr("dd-MM-yyyy");
transformation.setDesiredFormatStr("dd/MM/yyyy");

String transformedDate = transformation.transformDate();
System.out.println("Transformed date (dd-MM-yyyy to dd/MM/yyyy): " + transformedDate);
```
