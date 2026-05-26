package net.datafaker.providers.entertainment;

import net.datafaker.providers.base.AbstractProvider;

/**
 * Tron is a 1982 American science fiction action-adventure film.
 *
 * @since 1.4.0
 */
public class Tron extends AbstractProvider<EntertainmentProviders> {

    protected Tron(EntertainmentProviders faker) {
        super(faker);
    }

    public String character() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String character(Character character) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String game() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String location() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String quote() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String quote(Tron.Quote quote) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String tagline() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String vehicle() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String alternateCharacterSpelling() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String alternateCharacterSpelling(AlternateCharacterSpelling alternateCharacterSpelling) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public enum AlternateCharacterSpelling {

        ALAN_BRADLEY("alan_bradley"),
        CLU("clu"),
        DR_LORA_BAINES("dr_lora_baines"),
        DR_WALTER_GIBBS("dr_walter_gibbs"),
        ED_DILLINGER("ed_dillinger"),
        KEVIN_FLYNN("kevin_flynn"),
        MCP("mcp"),
        ROY_KLEINBERG("roy_kleinberg");

        private final String yamlKey;

        AlternateCharacterSpelling(String yamlKey) {
            this.yamlKey = yamlKey;
        }
    }

    public enum Quote {

        ALAN_BRADLEY("alan_bradley"),
        BIT("bit"),
        CLU("clu"),
        CROM("crom"),
        DR_LORA_BAINES("dr_lora_baines"),
        DR_WALTER_GIBBS("dr_walter_gibbs"),
        DUMONT("dumont"),
        ED_DILLINGER("ed_dillinger"),
        KEVIN_FLYNN("kevin_flynn"),
        MCP("mcp"),
        PROGRAM("program"),
        RAM("ram"),
        SARK("sark"),
        TRON("tron"),
        YORI("yori");

        private final String yamlKey;

        Quote(String yamlKey) {
            this.yamlKey = yamlKey;
        }
    }

    public enum Character {

        OTHER("other"), PROGRAM("programs"), USER("users");

        private final String yamlKey;

        Character(String yamlKey) {
            this.yamlKey = yamlKey;
        }
    }
}
