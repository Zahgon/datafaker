package net.datafaker.providers.base;

import net.datafaker.service.RandomService;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;
import java.util.logging.Logger;

/**
 * Creates fake Twitter messages.
 *
 * @since 0.9.0
 */
public class Twitter extends AbstractProvider<BaseProviders> {

    private static final Logger LOGGER = Logger.getLogger(Twitter.class.getName());

    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyyMMddHHmmss").withZone(ZoneId.systemDefault());

    private static final String BASIC_STRING = "QabR0cYdZ1efSg2hi3jNOPkTUM4VLlmXK5nJo6WIpHGqF7rEs8tDuC9vwBxAyz";

    /**
     * @param faker used as constructor
     */
    protected Twitter(BaseProviders faker) {
        super(faker);
    }

    /**
     * Used to fake a new Twitter Date.
     *
     * @param forward     to determined if the returned date is later (or before) the given date.
     * @param base        the base date given as a start point.
     * @param constraints used to constrain the returned date range.
     * @return a new date later (or before) the base date with respect to the constraint (no later/earlier than the constraint).
     * @deprecated better to use TimeAndDate for more flexibility
     */
    @Deprecated(since = "2.3.0", forRemoval = true)
    public Date createdTime(boolean forward, Date base, Date constraints) {
        final RandomService random = faker.random();
        final long time = base.getTime();
        if (forward) {
            return new Date(time + (long) (random.nextDouble() * (constraints.getTime() - time)));
        } else {
            return new Date(time - (long) (random.nextDouble() * (time - constraints.getTime())));
        }
    }

    /**
     * Used to fake a new Twitter ID without collision using both current time and uuid as seeds.
     *
     * @param expectedLength the expected length of the twitter id. Should be greater or equals to 6 and
     *                       less than or equals to 25.
     * @return a new Twitter ID consists of purely numbers.
     */
    public String twitterId(int expectedLength) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * To fake a new text context for the Twitter.
     *
     * @param keywords          the keywords that you wish to appear in the text.
     * @param sentenceMaxLength the text should be in range of the sentence max length.
     * @param wordMaxLength     each word should be in range of the word max length.
     * @return a new fake text for the Twitter.
     */
    public String text(String[] keywords, int sentenceMaxLength, int wordMaxLength) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return Return a user name using the twitter.user_name.
     */
    public String userName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return Return a user id using the twitter.user_name.
     */
    public String userId() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * return a fake link to a Twitter message. The extra length is expected to be larger than 4.
     *
     * @param username    the username will be used in the link.
     * @param extraLength the expected length of the extra link part.
     * @return return a fake link to a Twitter message.
     */
    public String getLink(String username, int extraLength) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
