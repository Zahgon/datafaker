package net.datafaker.providers.entertainment;

import net.datafaker.providers.base.AbstractProvider;

/**
 * @since 1.6.0
 */
public class StarWars extends AbstractProvider<EntertainmentProviders> {

    private static final String[] CHARACTERS = { "admiral_ackbar", "ahsoka_tano", "anakin_skywalker", "asajj_ventress", "bendu", "boba_fett", "c_3po", "count_dooku", "darth_caedus", "darth_vader", "din_djarin", "emperor_palpatine", "finn", "general_hux", "grand_admiral_thrawn", "grand_moff_tarkin", "greedo", "grogu", "han_solo", "jabba_the_hutt", "jar_jar_binks", "k_2so", "kuiil", "kylo_ren", "lando_calrissian", "leia_organa", "luke_skywalker", "mace_windu", "maz_kanata", "moff_gideon", "obi_wan_kenobi", "padme_amidala", "qui_gon_jinn", "rey", "shmi_skywalker", "yoda" };

    protected StarWars(EntertainmentProviders faker) {
        super(faker);
    }

    public String character() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String callSign() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String quotes() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String vehicles() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String droids() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String planets() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String species() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String wookieWords() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String alternateCharacterSpelling() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
