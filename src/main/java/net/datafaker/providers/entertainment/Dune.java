package net.datafaker.providers.entertainment;

import net.datafaker.providers.base.AbstractProvider;

/**
 * @since 0.8.0
 */
public class Dune extends AbstractProvider<EntertainmentProviders> {

    protected Dune(EntertainmentProviders faker) {
        super(faker);
    }

    public String character() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String title() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String planet() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String quote() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String quote(Quote quote) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String saying() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String saying(Saying saying) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public enum Quote {

        GUILD_NAVIGATOR("guild_navigator"),
        EMPEROR("emperor"),
        PAUL("paul"),
        THUFIR("thufir"),
        JESSICA("jessica"),
        IRULAN("irulan"),
        MOHIAM("mohiam"),
        GURNEY("gurney"),
        LETO("leto"),
        STILGAR("stilgar"),
        LIET_KYNES("liet_kynes"),
        PARDOT_KYNES("pardot_kynes"),
        BARON_HARKONNEN("baron_harkonnen"),
        PITER("piter"),
        ALIA("alia"),
        MAPES("mapes"),
        DUNCAN("duncan"),
        YUEH("yueh");

        private final String yamlKey;

        Quote(String yamlKey) {
            this.yamlKey = yamlKey;
        }
    }

    public enum Saying {

        BENE_GESSERIT("bene_gesserit"), FREMEN("fremen"), MENTAT("mentat"), MUADDIB("muaddib"), ORANGE_CATHOLIC_BIBLE("orange_catholic_bible");

        private final String yamlKey;

        Saying(String yamlKey) {
            this.yamlKey = yamlKey;
        }
    }
}
