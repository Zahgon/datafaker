package net.datafaker.providers.base;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAccessor;
import java.util.concurrent.TimeUnit;
import static java.util.concurrent.TimeUnit.MILLISECONDS;

/**
 * A generator of random times and dates.
 * <p>
 * This class is similar to {@link DateAndTime}, but migrated to the newer Java 8+ Time API.
 *
 * @since 2.3.0
 */
@SuppressWarnings("removal")
public class TimeAndDate extends AbstractProvider<BaseProviders> {

    static final int DEFAULT_MIN_AGE = 18;

    static final int DEFAULT_MAX_AGE = 65;

    protected TimeAndDate(BaseProviders faker) {
        super(faker);
    }

    /**
     * Generates a future date from now.
     */
    public Instant future() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Generates a future date from now.
     *
     * @param atMost at most this amount of time ahead from now exclusive.
     * @param unit   the time unit.
     * @return a future date from now.
     */
    public Instant future(long atMost, TimeUnit unit) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Generates and converts to string representation a future date from now.
     *
     * @param atMost  at most this amount of time ahead from now exclusive.
     * @param unit    the time unit.
     * @param pattern date time pattern to convert to string.
     * @return a string representation of a future date from now.
     */
    public String future(long atMost, TimeUnit unit, String pattern) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Generates a future date from now, with a minimum time.
     *
     * @param atMost  at most this amount of time ahead from now exclusive.
     * @param minimum the minimum amount of time in the future from now.
     * @param unit    the time unit.
     * @return a future date from now, with a minimum time.
     */
    public Instant future(long atMost, long minimum, TimeUnit unit) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Generates and converts to string representation
     * of a future date from now, with a minimum time.
     *
     * @param atMost  at most this amount of time ahead from now exclusive.
     * @param minimum the minimum amount of time in the future from now.
     * @param unit    the time unit.
     * @param pattern date time pattern to convert to string.
     * @return a string representation of a future date from now, with a minimum time.
     */
    public String future(long atMost, long minimum, TimeUnit unit, String pattern) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Generates a future date relative to the {@code referenceDate}.
     *
     * @param atMost        at most this amount of time ahead to the {@code referenceDate} exclusive.
     * @param unit          the time unit.
     * @param referenceDate the future date relative to this date.
     * @return a future date relative to {@code referenceDate}.
     */
    public Instant future(long atMost, TimeUnit unit, Instant referenceDate) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Generates and converts to string representation
     * a future date relative to the {@code referenceDate}.
     *
     * @param atMost        at most this amount of time ahead to the {@code referenceDate} exclusive.
     * @param unit          the time unit.
     * @param referenceDate the future date relative to this date.
     * @param pattern       date time pattern to convert to string.
     * @return a string representation of a future date relative to {@code referenceDate}.
     */
    public String future(long atMost, TimeUnit unit, Instant referenceDate, String pattern) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Generates a past date from now.
     */
    public Instant past() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Generates a past date from now.
     *
     * @param atMost at most this amount of time earlier from now exclusive.
     * @param unit   the time unit.
     * @return a past date from now.
     */
    public Instant past(long atMost, TimeUnit unit) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Generates a string representation of a past date from now.
     *
     * @param atMost  at most this amount of time earlier from now exclusive.
     * @param unit    the time unit.
     * @param pattern date time pattern to convert to string.
     * @return a string representation of a past date from now.
     */
    public String past(long atMost, TimeUnit unit, String pattern) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Generates a past date from now, with a minimum time.
     *
     * @param atMost  at most this amount of time earlier from now exclusive.
     * @param minimum the minimum amount of time in the past from now.
     * @param unit    the time unit.
     * @return a past date from now.
     */
    public Instant past(long atMost, long minimum, TimeUnit unit) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Generates and converts to string representation a past date from now, with a minimum time.
     *
     * @param atMost  at most this amount of time earlier from now exclusive.
     * @param minimum the minimum amount of time in the past from now.
     * @param unit    the time unit.
     * @param pattern date time pattern to convert to string.
     * @return a string representation of a past date from now, with a minimum time.
     */
    public String past(long atMost, long minimum, TimeUnit unit, String pattern) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Generates a past date relative to the {@code referenceDate}.
     *
     * @param atMost        at most this amount of time past to the {@code referenceDate} exclusive.
     * @param unit          the time unit.
     * @param referenceDate the past date relative to this date.
     * @return a past date relative to {@code referenceDate}.
     */
    public Instant past(long atMost, TimeUnit unit, Instant referenceDate) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Generates a string representation of a past date relative to the {@code referenceDate}.
     *
     * @param atMost        at most this amount of time past to the {@code referenceDate} exclusive.
     * @param unit          the time unit.
     * @param referenceDate the past date relative to this date.
     * @param pattern       date time pattern to convert to string.
     * @return a string representation of a past date relative to {@code referenceDate}.
     */
    public String past(long atMost, TimeUnit unit, Instant referenceDate, String pattern) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Generates a random date between two dates.
     *
     * @param from the lower bound inclusive
     * @param to   the upper bound exclusive
     * @return a random date between {@code from} and {@code to}.
     * @throws IllegalArgumentException if the {@code to} date represents an earlier date than {@code from} date.
     */
    public Instant between(Instant from, Instant to) throws IllegalArgumentException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Generates a string representation of a random date between two dates.
     *
     * @param from    the lower bound inclusive
     * @param to      the upper bound exclusive
     * @param pattern date time pattern to convert to string.
     * @return a string representation of a random date between {@code from} and {@code to}.
     * @throws IllegalArgumentException if the {@code to} date represents an earlier date than {@code from} date.
     */
    public String between(Instant from, Instant to, String pattern) throws IllegalArgumentException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Generates a random birthday between 65 and 18 years ago from now.
     *
     * @return a random birthday between 65 and 18 years ago from now.
     */
    public LocalDate birthday() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Generates a string representation of a random birthday between 65 and 18 years ago from now.
     *
     * @param pattern date time pattern to convert to string.
     * @return a string representation of a random birthday between 65 and 18 years ago from now.
     */
    public String birthday(String pattern) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Generates a random birthday between two ages from now.
     *
     * @param minAge the minimal age
     * @param maxAge the maximal age
     * @return a random birthday between {@code minAge} and {@code maxAge} years ago from now.
     * Negative {@code minAge} and {@code maxAge} are supported.
     */
    public LocalDate birthday(int minAge, int maxAge) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Generates and converts to string representation a random birthday between two ages from now.
     *
     * @param minAge  the minimal age
     * @param maxAge  the maximal age
     * @param pattern date time pattern to convert to string.
     * @return a string representation of a random birthday between {@code minAge} and {@code maxAge} years ago from now.
     * @throws IllegalArgumentException if the {@code maxAge} is lower than {@code minAge}.
     */
    public String birthday(int minAge, int maxAge, String pattern) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Generates a random Duration lower than max.
     *
     * @param max  the maximum value
     * @param unit the temporal unit (day or shorter than a day)
     * @return a random Duration lower than {@code max}.
     * @throws IllegalArgumentException if the {@code unit} is invalid.
     */
    public Duration duration(long max, ChronoUnit unit) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Generates a random Duration between min and max.
     *
     * @param min  the minimum value
     * @param max  the maximum value
     * @param unit the temporal unit (day or shorter than a day)
     * @return a random Duration between {@code min} inclusive and {@code max} exclusive if {@code max} greater {@code min}.
     * @throws IllegalArgumentException if the {@code unit} is invalid.
     */
    public Duration duration(long min, long max, ChronoUnit unit) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Generates a random Period between min and max.
     *
     * @param min the minimal value
     * @param max the maximum value
     * @return a random Period between {@code min} inclusive and {@code max} inclusive if {@code max} greater {@code min}.
     * @throws IllegalArgumentException if the {@code min} is greater than {@code max}.
     */
    public Period period(Period min, Period max) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static String formatInstant(TemporalAccessor instant, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern).withZone(ZoneId.systemDefault());
        return formatter.format(instant);
    }
}
