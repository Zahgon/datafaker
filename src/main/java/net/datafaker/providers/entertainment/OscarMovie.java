package net.datafaker.providers.entertainment;

import net.datafaker.providers.base.AbstractProvider;
import java.util.function.Supplier;

/**
 * The Academy Awards, popularly known as the Oscars, are awards for artistic and technical merit in the film industry.
 *
 * @author ak-maker
 * @since 1.4.0
 */
public class OscarMovie extends AbstractProvider<EntertainmentProviders> {

    private final Supplier<String> year;

    private final Supplier<String> choice;

    private final Supplier<String> str;

    /**
     * This is the constructor initialize faker and two other
     * variable for random generation.
     *
     * @param faker faker The Faker instance for generating random names of things.
     */
    protected OscarMovie(final EntertainmentProviders faker) {
        super(faker);
        this.year = () -> this.faker.resolve("oscar_movie.year.years");
        this.choice = () -> this.faker.resolve("oscar_movie.year.choice");
        this.str = () -> "oscar_movie." + year.get() + "." + choice.get();
    }

    /**
     * @return year
     */
    public String getYear() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return choice
     */
    public String getChoice() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * This method generates random actor
     *
     * @return random actor
     */
    public String actor() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * This method generates a random movie name
     *
     * @return random movieName
     */
    public String movieName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * This method generates a random quote
     *
     * @return random quote
     */
    public String quote() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * This method generates a random character
     *
     * @return random character
     */
    public String character() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * This method generates a random release date
     *
     * @return random releaseDate
     */
    public String releaseDate() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
