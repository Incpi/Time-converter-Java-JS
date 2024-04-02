class DateTransformation {
    /**
     * Transform date from one format to another.
     * @param {string} originalDateString - The original date string.
     * @param {string} originalFormatStr - The format of the original date string.
     * @param {string} desiredFormatStr - The desired output format for the transformed date.
     * @returns {string} The transformed date string in the desired format, or "Invalid date format" if the input format is invalid.
     */
    static transformDate(originalDateString, originalFormatStr, desiredFormatStr) {
        try {
            const originalDate = new Date(originalDateString);
            if (isNaN(originalDate.getTime())) {
                return "Invalid date format";
            }
            return originalDate.toLocaleDateString(undefined, {
                'year': 'numeric',
                'month': '2-digit',
                'day': '2-digit'
            });
        } catch (error) {
            return "Invalid date format";
        }
    }

    /**
     * Transform Unix timestamp to a given format.
     * @param {number} unixTimestamp - The Unix timestamp.
     * @param {string} desiredFormatStr - The desired output format.
     * @returns {string} The transformed Unix timestamp string in the desired format, or "Invalid Unix timestamp" if the timestamp is invalid.
     */
    static transformUnix(unixTimestamp, desiredFormatStr) {
        const date = new Date(unixTimestamp * 1000);
        if (isNaN(date.getTime())) {
            return "Invalid Unix timestamp";
        }
        return date.toLocaleDateString(undefined, {
            'year': 'numeric',
            'month': '2-digit',
            'day': '2-digit'
        });
    }

    /**
     * Add days to a given date.
     * @param {string} originalDateString - The original date string.
     * @param {number} daysToAdd - The number of days to add.
     * @returns {string} The modified date string after adding days, or "Invalid date format" if the input format is invalid.
     */
    static addDays(originalDateString, daysToAdd) {
        try {
            const originalDate = new Date(originalDateString);
            if (isNaN(originalDate.getTime())) {
                return "Invalid date format";
            }
            originalDate.setDate(originalDate.getDate() + daysToAdd);
            return originalDate.toLocaleDateString(undefined, {
                'year': 'numeric',
                'month': '2-digit',
                'day': '2-digit'
            });
        } catch (error) {
            return "Invalid date format";
        }
    }

    /**
     * Add hours to a given time.
     * @param {string} originalTimeString - The original time string.
     * @param {number} hoursToAdd - The number of hours to add.
     * @returns {string} The modified time string after adding hours, or "Invalid time format" if the input format is invalid.
     */
    static addHours(originalTimeString, hoursToAdd) {
        try {
            const originalTime = new Date(`2000-01-01T${originalTimeString}`);
            if (isNaN(originalTime.getTime())) {
                return "Invalid time format";
            }
            originalTime.setHours(originalTime.getHours() + hoursToAdd);
            return originalTime.toLocaleTimeString([], {
                hour: '2-digit',
                minute: '2-digit'
            });
        } catch (error) {
            return "Invalid time format";
        }
    }

    /**
     * Add minutes to a given time.
     * @param {string} originalTimeString - The original time string.
     * @param {number} minutesToAdd - The number of minutes to add.
     * @returns {string} The modified time string after adding minutes, or "Invalid time format" if the input format is invalid.
     */
    static addMinutes(originalTimeString, minutesToAdd) {
        try {
            const originalTime = new Date(`2000-01-01T${originalTimeString}`);
            if (isNaN(originalTime.getTime())) {
                return "Invalid time format";
            }
            originalTime.setMinutes(originalTime.getMinutes() + minutesToAdd);
            return originalTime.toLocaleTimeString([], {
                hour: '2-digit',
                minute: '2-digit'
            });
        } catch (error) {
            return "Invalid time format";
        }
    }

    /**
     * Add seconds to a given time.
     * @param {string} originalTimeString - The original time string.
     * @param {number} secondsToAdd - The number of seconds to add.
     * @returns {string} The modified time string after adding seconds, or "Invalid time format" if the input format is invalid.
     */
    static addSeconds(originalTimeString, secondsToAdd) {
        try {
            const originalTime = new Date(`2000-01-01T${originalTimeString}`);
            if (isNaN(originalTime.getTime())) {
                return "Invalid time format";
            }
            originalTime.setSeconds(originalTime.getSeconds() + secondsToAdd);
            return originalTime.toLocaleTimeString([], {
                hour: '2-digit',
                minute: '2-digit',
                second: '2-digit'
            });
        } catch (error) {
            return "Invalid time format";
        }
    }

    /**
     * Add months to a given date.
     * @param {string} originalDateString - The original date string.
     * @param {number} monthsToAdd - The number of months to add.
     * @returns {string} The modified date string after adding months, or "Invalid date format" if the input format is invalid.
     */
    static addMonths(originalDateString, monthsToAdd) {
        try {
            const originalDate = new Date(originalDateString);
            if (isNaN(originalDate.getTime())) {
                return "Invalid date format";
            }
            originalDate.setMonth(originalDate.getMonth() + monthsToAdd);
            return originalDate.toLocaleDateString(undefined, {
                'year': 'numeric',
                'month': '2-digit',
                'day': '2-digit'
            });
        } catch (error) {
            return "Invalid date format";
        }
    }

    /**
     * Add years to a given date.
     * @param {string} originalDateString - The original date string.
     * @param {number} yearsToAdd - The number of years to add.
     * @returns {string} The modified date string after adding years, or "Invalid date format" if the input format is invalid.
     */
    static addYears(originalDateString, yearsToAdd) {
        try {
            const originalDate = new Date(originalDateString);
            if (isNaN(originalDate.getTime())) {
                return "Invalid date format";
            }
            originalDate.setFullYear(originalDate.getFullYear() + yearsToAdd);
            return originalDate.toLocaleDateString(undefined, {
                'year': 'numeric',
                'month': '2-digit',
                'day': '2-digit'
            });
        } catch (error) {
            return "Invalid date format";
        }
    }

    /**
     * Subtract days from a given date.
     * @param {string} originalDateString - The original date string.
     * @param {number} daysToSubtract - The number of days to subtract.
     * @returns {string} The modified date string after subtracting days, or "Invalid date format" if the input format is invalid.
     */
    static subtractDays(originalDateString, daysToSubtract) {
        try {
            const originalDate = new Date(originalDateString);
            if (isNaN(originalDate.getTime())) {
                return "Invalid date format";
            }
            originalDate.setDate(originalDate.getDate() - daysToSubtract);
            return originalDate.toLocaleDateString(undefined, {
                'year': 'numeric',
                'month': '2-digit',
                'day': '2-digit'
            });
        } catch (error) {
            return "Invalid date format";
        }
    }

    /**
     * Subtract hours from a given time.
     * @param {string} originalTimeString - The original time string.
     * @param {number} hoursToSubtract - The number of hours to subtract.
     * @returns {string} The modified time string after subtracting hours, or "Invalid time format" if the input format is invalid.
     */
    static subtractHours(originalTimeString, hoursToSubtract) {
        try {
            const originalTime = new Date(`2000-01-01T${originalTimeString}`);
            if (isNaN(originalTime.getTime())) {
                return "Invalid time format";
            }
            originalTime.setHours(originalTime.getHours() - hoursToSubtract);
            return originalTime.toLocaleTimeString([], {
                hour: '2-digit',
                minute: '2-digit'
            });
        } catch (error) {
            return "Invalid time format";
        }
    }

    /**
     * Subtract minutes from a given time.
     * @param {string} originalTimeString - The original time string.
     * @param {number} minutesToSubtract - The number of minutes to subtract.
     * @returns {string} The modified time string after subtracting minutes, or "Invalid time format" if the input format is invalid.
     */
    static subtractMinutes(originalTimeString, minutesToSubtract) {
        try {
            const originalTime = new Date(`2000-01-01T${originalTimeString}`);
            if (isNaN(originalTime.getTime())) {
                return "Invalid time format";
            }
            originalTime.setMinutes(originalTime.getMinutes() - minutesToSubtract);
            return originalTime.toLocaleTimeString([], {
                hour: '2-digit',
                minute: '2-digit'
            });
        } catch (error) {
            return "Invalid time format";
        }
    }

    /**
     * Subtract seconds from a given time.
     * @param {string} originalTimeString - The original time string.
     * @param {number} secondsToSubtract - The number of seconds to subtract.
     * @returns {string} The modified time string after subtracting seconds, or "Invalid time format" if the input format is invalid.
     */
    static subtractSeconds(originalTimeString, secondsToSubtract) {
        try {
            const originalTime = new Date(`2000-01-01T${originalTimeString}`);
            if (isNaN(originalTime.getTime())) {
                return "Invalid time format";
            }
            originalTime.setSeconds(originalTime.getSeconds() - secondsToSubtract);
            return originalTime.toLocaleTimeString([], {
                hour: '2-digit',
                minute: '2-digit',
                second: '2-digit'
            });
        } catch (error) {
            return "Invalid time format";
        }
    }

    /**
     * Check if a year is a leap year.
     *
     * @param {number} year The year to check.
     * @returns {boolean} True if the year is a leap year, false otherwise.
     */
    static isLeapYear(year) {
        return new Date(year, 1, 29).getDate() === 29;
    }

    /**
     * Get the week number of the year for a given date.
     *
     * @param {string} dateString The date string.
     * @param {string} formatStr The format of the date string.
     * @returns {number} The week number of the year as an integer, or -1 if the input format is invalid.
     */
    static getWeekNumber(dateString) {
        try {
            const date = new Date(dateString);
            if (isNaN(date.getTime())) {
                return -1;
            }
            const firstDayOfYear = new Date(date.getFullYear(), 0, 1);
            const pastDaysOfYear = (date - firstDayOfYear) / 86400000;
            return Math.ceil((pastDaysOfYear + firstDayOfYear.getDay() + 1) / 7);
        } catch (error) {
            return -1;
        }
    }
    /**
     * Get the number of days in a given month and year.
     *
     * @param {number} year The year.
     * @param {number} month The month.
     * @returns {number} The number of days in the specified month and year.
     */
    static getDaysInMonth(year, month) {
        return new Date(year, month, 0).getDate();
    }
    /**
     * Get the number of days remaining in the current month from a given date.
     *
     * @param {string} dateString The date string.
     * @param {string} formatStr The format of the date string.
     * @returns {number} The number of days remaining in the current month, or -1 if the input format is invalid.
     */
    static getDaysRemainingInMonth(dateString) {
        try {
            const date = new Date(dateString);
            if (isNaN(date.getTime())) {
                return -1;
            }
            const lastDayOfMonth = new Date(date.getFullYear(), date.getMonth() + 1, 0);
            return lastDayOfMonth.getDate() - date.getDate();
        } catch (error) {
            return -1;
        }
    }
    /**
     * Get the age in years based on the given date of birth and the current date.
     *
     * @param {string} birthDateString The date of birth string.
     * @param {string} formatStr The format of the date string.
     * @returns {number} The age in years, or -1 if the input format is invalid.
     */
    static getAge(birthDateString) {
        try {
            const birthDate = new Date(birthDateString);
            if (isNaN(birthDate.getTime())) {
                return -1;
            }
            const ageDifMs = Date.now() - birthDate.getTime();
            const ageDate = new Date(ageDifMs);
            return Math.abs(ageDate.getUTCFullYear() - 1970);
        } catch (error) {
            return -1;
        }
    }
    /**
     * Get the number of days between the current date and a specified future date.
     *
     * @param {string} futureDateString The future date string.
     * @param {string} formatStr The format of the date string.
     * @returns {number} The number of days between the current date and the future date, or -1 if the input format is invalid.
     */
    static getDaysUntilFutureDate(futureDateString) {
        try {
            const futureDate = new Date(futureDateString);
            if (isNaN(futureDate.getTime())) {
                return -1;
            }
            const currentDate = new Date();
            const timeDifference = futureDate.getTime() - currentDate.getTime();
            return Math.ceil(timeDifference / (1000 * 3600 * 24));
        } catch (error) {
            return -1;
        }
    }
    /**
     * Calculate the number of days between two dates.
     *
     * @param {string} startDateString The start date string.
     * @param {string} endDateString The end date string.
     * @returns {number} The number of days between the start and end dates, or -1 if the input format is invalid.
     */
    static calculateDaysDifference(startDateString, endDateString) {
        try {
            const startDate = new Date(startDateString);
            const endDate = new Date(endDateString);
            if (isNaN(startDate.getTime()) || isNaN(endDate.getTime())) {
                return -1;
            }
            const timeDifference = endDate.getTime() - startDate.getTime();
            return Math.ceil(timeDifference / (1000 * 3600 * 24));
        } catch (error) {
            return -1;
        }
    }

    /**
     * Get the quarter of the year for a given date.
     *
     * @param {string} dateString The date string.
     * @returns {number} The quarter of the year as an integer (1, 2, 3, or 4), or -1 if the input format is invalid.
     */
    static getQuarterOfYear(dateString) {
        try {
            const date = new Date(dateString);
            if (isNaN(date.getTime())) {
                return -1;
            }
            return Math.floor((date.getMonth() + 3) / 3);
        } catch (error) {
            return -1;
        }
    }

    /**
     * Get the current date in the format "YYYY-MM-DD".
     *
     * @returns {string} The current date string in "YYYY-MM-DD" format.
     */
    static getCurrentDate() {
        const currentDate = new Date();
        const year = currentDate.getFullYear();
        const month = String(currentDate.getMonth() + 1).padStart(2, '0');
        const day = String(currentDate.getDate()).padStart(2, '0');
        return `${year}-${month}-${day}`;
    }

    /**
     * Get the current time in the format "HH:MM:SS".
     *
     * @returns {string} The current time string in "HH:MM:SS" format.
     */
    static getCurrentTime() {
        const currentTime = new Date();
        const hours = String(currentTime.getHours()).padStart(2, '0');
        const minutes = String(currentTime.getMinutes()).padStart(2, '0');
        const seconds = String(currentTime.getSeconds()).padStart(2, '0');
        return `${hours}:${minutes}:${seconds}`;
    }

    /**
     * Get the current date and time in the format "YYYY-MM-DD HH:MM:SS".
     *
     * @returns {string} The current date and time string in "YYYY-MM-DD HH:MM:SS" format.
     */
    static getCurrentDateTime() {
        const currentDate = new Date();
        const year = currentDate.getFullYear();
        const month = String(currentDate.getMonth() + 1).padStart(2, '0');
        const day = String(currentDate.getDate()).padStart(2, '0');
        const hours = String(currentDate.getHours()).padStart(2, '0');
        const minutes = String(currentDate.getMinutes()).padStart(2, '0');
        const seconds = String(currentDate.getSeconds()).padStart(2, '0');
        return `${year}-${month}-${day} ${hours}:${minutes}:${seconds}`;
    }
}
