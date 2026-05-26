package net.datafaker.providers.base;

import java.time.Duration;

/**
 * @since 0.8.0
 */
public class FakeDuration extends AbstractProvider<BaseProviders> {

    protected FakeDuration(BaseProviders faker) {
        super(faker);
    }

    /**
     * Returns a random long between 0 and max inclusive
     *
     * @param max: upper bound of number range
     * @return a random long between 0 and max inclusive
     */
    private long getNumberBetween(long max) {
        // nextLong max is exclusive
        return this.faker.random().nextLong(max + 1);
    }

    /**
     * Returns a Duration object representing a random duration of minutes in the given range
     *
     * @param minutesMax: max number of minutes for Duration (inclusive)
     * @return a Duration object representing a number of minutes in the given range
     */
    public Duration atMostMinutes(long minutesMax) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a Duration object representing a random duration of hours in the given range
     *
     * @param hoursMax: max number of hours for Duration (inclusive)
     * @return a Duration object representing a number of hours in the given range
     */
    public Duration atMostHours(long hoursMax) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a Duration object representing a random duration of days in the given range
     *
     * @param daysMax: max number of days for Duration (inclusive)
     * @return a Duration object representing a number of days in the given range
     */
    public Duration atMostDays(long daysMax) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a Duration object representing a random duration of seconds in the given range
     *
     * @param secondsMax: max number of seconds for Duration (inclusive)
     * @return a Duration object representing a number of seconds in the given range
     */
    public Duration atMostSeconds(long secondsMax) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
