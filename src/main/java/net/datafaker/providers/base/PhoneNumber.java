package net.datafaker.providers.base;

import net.datafaker.annotations.Deterministic;
import java.util.Locale;
import static com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.INTERNATIONAL;
import static com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.NATIONAL;
import static com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.FIXED_LINE;
import static com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.MOBILE;
import static java.util.Locale.ROOT;

/**
 * @since 0.8.0
 */
public class PhoneNumber extends AbstractProvider<BaseProviders> {

    private final String countryCodeIso2;

    private final PhoneNumberGenerator generator;

    protected PhoneNumber(BaseProviders faker) {
        super(faker);
        this.countryCodeIso2 = countryCodeIso2(faker.getContext().getLocale());
        this.generator = new PhoneNumberGenerator(faker.fakeValuesService(), faker.getContext());
    }

    @Deterministic
    String countryCodeIso2() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String cellPhone() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String cellPhoneInternational() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Generates locale specific phone number in national format.
     *
     * @return phone number
     */
    public String phoneNumber() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String phoneNumberInternational() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String phoneNumberNational() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String extension() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String subscriberNumber(int length) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String subscriberNumber() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static String countryCodeIso2(Locale locale) {
        String country = locale.getCountry();
        return switch(country) {
            case "" ->
                detectCountryByLanguage(locale.getLanguage());
            case "CAT" ->
                "ES";
            case "NEP" ->
                "NP";
            case "PAK" ->
                "PK";
            // what the hell is BORK?
            case "BORK" ->
                "US";
            default ->
                country;
        };
    }

    /**
     * A hack to detect country when only a language is given.
     * <p>
     * It's not correct because most languages are used in multiple countries.
     * If users need to generate random phone number, they should create locale with country,
     * e.g. {@code new Locale("ta_IN")}, and not just {@code new Locale("ta")}.
     * </p>
     * <p>
     * We keep this mapping here just for backward compatibility.
     * </p>
     */
    private static String detectCountryByLanguage(String language) {
        return switch(language) {
            // Afrikaans language -> South Africa
            case "af" ->
                "ZA";
            // Arabic language -> Saudi Arabia (SA)
            case "ar" ->
                "SA";
            // Amharic language -> Ethiopia (ET)
            case "am" ->
                "ET";
            // Belarus
            case "be" ->
                "BY";
            // Bengali language -> Bangladesh (BD)
            case "bn" ->
                "BD";
            // Bosnian language -> Bosnia & Herzegovina (BA)
            case "bs" ->
                "BA";
            // Catalan language -> Spain (ES)
            case "ca" ->
                "ES";
            // Welsh language -> United Kingdom (GB)
            case "cy" ->
                "GB";
            // Czech Republic
            case "cs" ->
                "CZ";
            // Greece
            case "el" ->
                "GR";
            // Estonian language -> Estonia (EE)
            case "et" ->
                "EE";
            // it has been used by default for English
            case "en" ->
                "US";
            // Basque (Basque Country | Spain)
            case "eu" ->
                "ES";
            // Persian language (Farsi) -> Iran (IR)
            case "fa" ->
                "IR";
            // Irish/Gaelic language -> Ireland (IE)
            case "ga" ->
                "IE";
            // Galician (Spain)
            case "gl" ->
                "ES";
            // Israel
            case "he" ->
                "IL";
            // Hindi language -> India
            case "hi" ->
                "IN";
            // Armenia
            case "hy" ->
                "AM";
            // Japan
            case "ja" ->
                "JP";
            // Georgia
            case "ka" ->
                "GE";
            // Khmer language -> Cambodia (KH)
            case "km" ->
                "KH";
            // Korea
            case "ko" ->
                "KR";
            // Moldavian language -> Moldova
            case "mo" ->
                "MD";
            // Albania
            case "sq" ->
                "AL";
            // Swahili language -> Tanzania (TZ)
            case "sw" ->
                "TZ";
            // Uyghur language -> China (CN)
            case "ug" ->
                "CN";
            // Urdu language -> Pakistan (PK)
            case "ur" ->
                "PK";
            // Tamil language -> India (though, Tamil is used in multiple countries)
            case "ta" ->
                "IN";
            // What the hell is "test" language?
            case "test" ->
                "US";
            // Ukraine
            case "uk" ->
                "UA";
            // Chinese language -> China (CN)
            case "zh" ->
                "CN";
            default ->
                language.toUpperCase(ROOT);
        };
    }
}
