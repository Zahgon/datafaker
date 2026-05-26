package net.datafaker.providers.base;

/**
 * Emojis picked from <a href="http://unicode.org/Public/emoji/1.0/emoji-data.txt">Emoji 1.0</a>.
 *
 * @since 1.7.0
 */
public class Emoji extends AbstractProvider<BaseProviders> {

    protected Emoji(BaseProviders faker) {
        super(faker);
    }

    public String smiley() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String cat() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String vehicle() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
