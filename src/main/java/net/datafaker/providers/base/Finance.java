package net.datafaker.providers.base;

import net.datafaker.annotations.Deterministic;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/**
 * @since 0.8.0
 */
public class Finance extends AbstractProvider<BaseProviders> {

    public static final BigInteger A_CODE = BigInteger.valueOf(97L);

    public enum CreditCardType {

        VISA,
        MASTERCARD,
        DISCOVER,
        AMERICAN_EXPRESS,
        DINERS_CLUB,
        JCB,
        DANKORT,
        FORBRUGSFORENINGEN,
        LASER,
        UNIONPAY
    }

    protected Finance(BaseProviders faker) {
        super(faker);
    }

    /**
     * @deprecated since 2.2.0. For removal in 3.0.0 version. Use {@link Stock#nsdqSymbol} instead.
     */
    @Deprecated(since = "2.2.0", forRemoval = true)
    public String nasdaqTicker() {
        return resolve("finance.ticker.nasdaq");
    }

    /**
     * @deprecated since 2.2.0. For removal in 3.0.0 version. Use {@link Stock#nyseSymbol} instead.
     */
    @Deprecated(since = "2.2.0", forRemoval = true)
    public String nyseTicker() {
        return resolve("finance.ticker.nyse");
    }

    /**
     * @deprecated since 2.2.0. For removal in 3.0.0 version. Use {@link Stock#exchanges} instead.
     */
    @Deprecated(since = "2.2.0", forRemoval = true)
    public String stockMarket() {
        return resolve("finance.stock_market");
    }

    private static final Map<String, String> countryCodeToBasicBankAccountNumberPattern = createCountryCodeToBasicBankAccountNumberPatternMap();

    /**
     * Get the set of country codes supported for IBAN generation
     */
    @Deterministic
    public static Set<String> ibanSupportedCountries() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Generates a random credit card number of the specified type.
     * The number will pass the LUHN check.
     *
     * @param creditCardType the type of credit card to generate (see {@link CreditCardType} for options)
     * @return a valid credit card number of the specified type
     */
    public String creditCard(CreditCardType creditCardType) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private int sumOfDigits(int value) {
        int res = 0;
        while (value > 0) {
            res += value % 10;
            value /= 10;
        }
        return res;
    }

    /**
     * Generate a random credit card number of a random type.
     * The number will pass the LUHN check.
     *
     * @return a valid credit card number of a random type. Likely 16 digits, but could be 14-19.
     */
    public String creditCard() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Generates a random Business Identifier Code (BIC).
     * The country code is retrieved from the {@link Country} provider to ensure consistency.
     * <p>
     * A BIC consists of 8 or 11 characters: 4 letters (bank), 2 letters (ISO country code),
     * 2 characters (location), and an optional 3-character branch code (whereas {@code XXX} refers to Head Office).
     *
     * @return a valid-formatted BIC
     */
    public String bic() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Generates a random IBAN (International Bank Account Number).
     * The country code is chosen randomly from the supported countries.
     * The generated IBAN will pass the checksum test.
     * @return a valid IBAN
     */
    public String iban() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Generates an IBAN for the given country code.
     * The generated IBAN will pass the checksum test.
     * @param countryCode the 2-letter country code for the IBAN.
     * @return a valid IBAN
     */
    public String iban(String countryCode) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Generates a random US bank routing number of 9 characters.
     * The number will pass the checksum test.
     * @return a valid US bank routing number
     */
    public String usRoutingNumber() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private CreditCardType randomCreditCardType() {
        return faker.random().nextEnum(CreditCardType.class);
    }

    private static String calculateIbanChecksum(String countryCode, String basicBankAccountNumber) {
        String basis = (basicBankAccountNumber + countryCode).toLowerCase(Locale.ROOT) + "00";
        final StringBuilder sb = new StringBuilder(basis.length());
        for (int i = 0; i < basis.length(); i++) {
            final char c = basis.charAt(i);
            if (Character.isLetter(c)) {
                sb.append((c - 'a') + 10);
            } else {
                sb.append(c);
            }
        }
        int mod97 = new BigInteger(sb.toString()).mod(A_CODE).intValue();
        return padLeftZeros(String.valueOf(98 - mod97), 2);
    }

    private static String padLeftZeros(String inputString, int length) {
        if (inputString.length() >= length) {
            return inputString;
        }
        StringBuilder sb = new StringBuilder(length);
        while (sb.length() < length - inputString.length()) {
            sb.append('0');
        }
        sb.append(inputString);
        return sb.toString();
    }

    /**
     * Creates a map containing the Basic Bank Account Number (BBAN) patterns for supported countries.
     * <p>
     * The BBAN is the country-specific part of an IBAN that follows the country code and checksum.
     *
     * @return a {@link Map} where the key is the ISO 3166-1 alpha-2 country code and the value
     *         is the corresponding BBAN regular expression
     */
    private static Map<String, String> createCountryCodeToBasicBankAccountNumberPatternMap() {
        // source: - https://www.swift.com/standards/data-standards/iban, version 101
        //         - de.speedbanking:iban-commons de.speedbanking.iban.tool.DatafakerFinanceIbanGenerator
        Map<String, String> ibanFormats = new LinkedHashMap<>();
        // 🇦🇩 Andorra                  : 4!n4!n12!c
        ibanFormats.put("AD", "[0-9]{8}[0-9A-Z]{12}");
        // 🇦🇪 United Arab Emirates     : 3!n16!n
        ibanFormats.put("AE", "[0-9]{19}");
        // 🇦🇱 Albania                  : 8!n16!c
        ibanFormats.put("AL", "[0-9]{8}[0-9A-Z]{16}");
        // 🇦🇴 Angola                   : 4!n4!n11!n2!n
        ibanFormats.put("AO", "[0-9]{21}");
        // 🇦🇹 Austria                  : 5!n11!n
        ibanFormats.put("AT", "[0-9]{16}");
        // 🇦🇿 Azerbaijan               : 4!a20!c
        ibanFormats.put("AZ", "[A-Z]{4}[0-9A-Z]{20}");
        // 🇧🇦 Bosnia and Herzegovina   : 3!n3!n8!n2!n
        ibanFormats.put("BA", "[0-9]{16}");
        // 🇧🇪 Belgium                  : 3!n7!n2!n
        ibanFormats.put("BE", "[0-9]{12}");
        // 🇧🇫 Burkina Faso             : 5!c5!n11!n2!n
        ibanFormats.put("BF", "[0-9A-Z]{5}[0-9]{18}");
        // 🇧🇬 Bulgaria                 : 4!a4!n2!n8!c
        ibanFormats.put("BG", "[A-Z]{4}[0-9]{6}[0-9A-Z]{8}");
        // 🇧🇭 Bahrain                  : 4!a14!c
        ibanFormats.put("BH", "[A-Z]{4}[0-9A-Z]{14}");
        // 🇧🇮 Burundi                  : 5!n5!n11!n2!n
        ibanFormats.put("BI", "[0-9]{23}");
        // 🇧🇯 Benin                    : 5!c5!n12!n2!n
        ibanFormats.put("BJ", "[0-9A-Z]{5}[0-9]{19}");
        // 🇧🇷 Brazil                   : 8!n5!n10!n1!a1!c
        ibanFormats.put("BR", "[0-9]{23}[A-Z][0-9A-Z]");
        // 🇧🇾 Belarus                  : 4!c4!n16!c
        ibanFormats.put("BY", "[0-9A-Z]{4}[0-9]{4}[0-9A-Z]{16}");
        // 🇨🇫 Central African Republic : 5!n5!n11!n2!n
        ibanFormats.put("CF", "[0-9]{23}");
        // 🇨🇭 Switzerland              : 5!n12!c
        ibanFormats.put("CH", "[0-9]{5}[0-9A-Z]{12}");
        // 🇨🇲 Cameroon                 : 5!n5!n11!n2!n
        ibanFormats.put("CM", "[0-9]{23}");
        // 🇨🇷 Costa Rica               : 4!n14!n
        ibanFormats.put("CR", "[0-9]{18}");
        // 🇨🇻 Cape Verde               : 4!n4!n13!c
        ibanFormats.put("CV", "[0-9]{8}[0-9A-Z]{13}");
        // 🇨🇾 Cyprus                   : 3!n5!n16!c
        ibanFormats.put("CY", "[0-9]{8}[0-9A-Z]{16}");
        // 🇨🇿 Czechia                  : 4!n6!n10!n
        ibanFormats.put("CZ", "[0-9]{20}");
        // 🇩🇪 Germany                  : 8!n10!n
        ibanFormats.put("DE", "[0-9]{18}");
        // 🇩🇯 Djibouti                 : 5!n5!n11!n2!n
        ibanFormats.put("DJ", "[0-9]{23}");
        // 🇩🇰 Denmark                  : 4!n9!n1!n
        ibanFormats.put("DK", "[0-9]{14}");
        // 🇩🇴 Dominican Republic       : 4!c20!n
        ibanFormats.put("DO", "[0-9A-Z]{4}[0-9]{20}");
        // 🇩🇿 Algeria                  : 3!n5!n10!n2!n
        ibanFormats.put("DZ", "[0-9]{20}");
        // 🇪🇪 Estonia                  : 2!n14!n
        ibanFormats.put("EE", "[0-9]{16}");
        // 🇪🇬 Egypt                    : 4!n4!n17!n
        ibanFormats.put("EG", "[0-9]{25}");
        // 🇪🇸 Spain                    : 4!n4!n1!n1!n10!n
        ibanFormats.put("ES", "[0-9]{20}");
        // 🇫🇮 Finland                  : 3!n11!n
        ibanFormats.put("FI", "[0-9]{14}");
        // 🇫🇰 Falkland Islands         : 2!a12!n
        ibanFormats.put("FK", "[A-Z]{2}[0-9]{12}");
        // 🇫🇴 Faroe Islands            : 4!n9!n1!n
        ibanFormats.put("FO", "[0-9]{14}");
        // 🇫🇷 France                   : 5!n5!n11!c2!n
        ibanFormats.put("FR", "[0-9]{10}[0-9A-Z]{11}[0-9]{2}");
        // 🇬🇦 Gabon                    : 5!n5!n13!c
        ibanFormats.put("GA", "[0-9]{10}[0-9A-Z]{13}");
        // 🇬🇧 United Kingdom           : 4!a6!n8!n
        ibanFormats.put("GB", "[A-Z]{4}[0-9]{14}");
        // 🇬🇪 Georgia                  : 2!a16!n
        ibanFormats.put("GE", "[A-Z]{2}[0-9]{16}");
        // 🇬🇮 Gibraltar                : 4!a15!c
        ibanFormats.put("GI", "[A-Z]{4}[0-9A-Z]{15}");
        // 🇬🇱 Greenland                : 4!n9!n1!n
        ibanFormats.put("GL", "[0-9]{14}");
        // 🇬🇶 Equatorial Guinea        : 5!n5!n11!n2!n
        ibanFormats.put("GQ", "[0-9]{23}");
        // 🇬🇷 Greece                   : 3!n4!n16!c
        ibanFormats.put("GR", "[0-9]{7}[0-9A-Z]{16}");
        // 🇬🇹 Guatemala                : 4!c20!c
        ibanFormats.put("GT", "[0-9A-Z]{24}");
        // 🇭🇳 Honduras                 : 4!a20!n
        ibanFormats.put("HN", "[A-Z]{4}[0-9]{20}");
        // 🇭🇷 Croatia                  : 7!n10!n
        ibanFormats.put("HR", "[0-9]{17}");
        // 🇭🇺 Hungary                  : 3!n4!n1!n15!n1!n
        ibanFormats.put("HU", "[0-9]{24}");
        // 🇮🇪 Ireland                  : 4!a6!n8!n
        ibanFormats.put("IE", "[A-Z]{4}[0-9]{14}");
        // 🇮🇱 Israel                   : 3!n3!n13!n
        ibanFormats.put("IL", "[0-9]{19}");
        // 🇮🇶 Iraq                     : 4!a3!n12!n
        ibanFormats.put("IQ", "[A-Z]{4}[0-9]{15}");
        // 🇮🇷 Islamic Republic of Iran : 3!n19!n
        ibanFormats.put("IR", "[0-9]{22}");
        // 🇮🇸 Iceland                  : 4!n2!n6!n10!n
        ibanFormats.put("IS", "[0-9]{22}");
        // 🇮🇹 Italy                    : 1!a5!n5!n12!c
        ibanFormats.put("IT", "[A-Z][0-9]{10}[0-9A-Z]{12}");
        // 🇯🇴 Jordan                   : 4!a4!n18!c
        ibanFormats.put("JO", "[A-Z]{4}[0-9]{4}[0-9A-Z]{18}");
        // 🇰🇲 Comoros                  : 5!n5!n11!n2!n
        ibanFormats.put("KM", "[0-9]{23}");
        // 🇰🇼 Kuwait                   : 4!a22!c
        ibanFormats.put("KW", "[A-Z]{4}[0-9A-Z]{22}");
        // 🇰🇿 Kazakhstan               : 3!n13!c
        ibanFormats.put("KZ", "[0-9]{3}[0-9A-Z]{13}");
        // 🇱🇧 Lebanon                  : 4!n20!c
        ibanFormats.put("LB", "[0-9]{4}[0-9A-Z]{20}");
        // 🇱🇨 Saint Lucia              : 4!a24!c
        ibanFormats.put("LC", "[A-Z]{4}[0-9A-Z]{24}");
        // 🇱🇮 Liechtenstein            : 5!n12!c
        ibanFormats.put("LI", "[0-9]{5}[0-9A-Z]{12}");
        // 🇱🇹 Lithuania                : 5!n11!n
        ibanFormats.put("LT", "[0-9]{16}");
        // 🇱🇺 Luxembourg               : 3!n13!c
        ibanFormats.put("LU", "[0-9]{3}[0-9A-Z]{13}");
        // 🇱🇻 Latvia                   : 4!a13!c
        ibanFormats.put("LV", "[A-Z]{4}[0-9A-Z]{13}");
        // 🇱🇾 Libya                    : 3!n3!n15!n
        ibanFormats.put("LY", "[0-9]{21}");
        // 🇲🇦 Morocco                  : 3!n5!n16!n
        ibanFormats.put("MA", "[0-9]{24}");
        // 🇲🇨 Monaco                   : 5!n5!n11!c2!n
        ibanFormats.put("MC", "[0-9]{10}[0-9A-Z]{11}[0-9]{2}");
        // 🇲🇩 Moldova                  : 2!c18!c
        ibanFormats.put("MD", "[0-9A-Z]{20}");
        // 🇲🇪 Montenegro               : 3!n13!n2!n
        ibanFormats.put("ME", "[0-9]{18}");
        // 🇲🇰 North Macedonia          : 3!n10!c2!n
        ibanFormats.put("MK", "[0-9]{3}[0-9A-Z]{10}[0-9]{2}");
        // 🇲🇳 Mongolia                 : 4!n12!n
        ibanFormats.put("MN", "[0-9]{16}");
        // 🇲🇷 Mauritania               : 5!n5!n11!n2!n
        ibanFormats.put("MR", "[0-9]{23}");
        // 🇲🇹 Malta                    : 4!a5!n18!c
        ibanFormats.put("MT", "[A-Z]{4}[0-9]{5}[0-9A-Z]{18}");
        // 🇲🇺 Mauritius                : 4!a2!n2!n12!n3!n3!a
        ibanFormats.put("MU", "[A-Z]{4}[0-9]{19}[A-Z]{3}");
        // 🇲🇿 Mozambique               : 4!n4!n11!n2!n
        ibanFormats.put("MZ", "[0-9]{21}");
        // 🇳🇮 Nicaragua                : 4!a20!n
        ibanFormats.put("NI", "[A-Z]{4}[0-9]{20}");
        // 🇳🇱 Netherlands              : 4!a10!n
        ibanFormats.put("NL", "[A-Z]{4}[0-9]{10}");
        // 🇳🇴 Norway                   : 4!n6!n1!n
        ibanFormats.put("NO", "[0-9]{11}");
        // 🇴🇲 Oman                     : 3!n16!c
        ibanFormats.put("OM", "[0-9]{3}[0-9A-Z]{16}");
        // 🇵🇰 Pakistan                 : 4!a16!c
        ibanFormats.put("PK", "[A-Z]{4}[0-9A-Z]{16}");
        // 🇵🇱 Poland                   : 8!n16!n
        ibanFormats.put("PL", "[0-9]{24}");
        // 🇵🇸 Palestine                : 4!a21!c
        ibanFormats.put("PS", "[A-Z]{4}[0-9A-Z]{21}");
        // 🇵🇹 Portugal                 : 4!n4!n11!n2!n
        ibanFormats.put("PT", "[0-9]{21}");
        // 🇶🇦 Qatar                    : 4!a21!c
        ibanFormats.put("QA", "[A-Z]{4}[0-9A-Z]{21}");
        // 🇷🇴 Romania                  : 4!a16!c
        ibanFormats.put("RO", "[A-Z]{4}[0-9A-Z]{16}");
        // 🇷🇸 Serbia                   : 3!n13!n2!n
        ibanFormats.put("RS", "[0-9]{18}");
        // 🇷🇺 Russia                   : 9!n5!n15!c
        ibanFormats.put("RU", "[0-9]{14}[0-9A-Z]{15}");
        // 🇸🇦 Saudi Arabia             : 2!n18!c
        ibanFormats.put("SA", "[0-9]{2}[0-9A-Z]{18}");
        // 🇸🇨 Seychelles               : 4!a2!n2!n16!n3!a
        ibanFormats.put("SC", "[A-Z]{4}[0-9]{20}[A-Z]{3}");
        // 🇸🇩 Sudan                    : 2!n12!n
        ibanFormats.put("SD", "[0-9]{14}");
        // 🇸🇪 Sweden                   : 3!n16!n1!n
        ibanFormats.put("SE", "[0-9]{20}");
        // 🇸🇮 Slovenia                 : 2!n3!n8!n2!n
        ibanFormats.put("SI", "[0-9]{15}");
        // 🇸🇰 Slovakia                 : 4!n6!n10!n
        ibanFormats.put("SK", "[0-9]{20}");
        // 🇸🇲 San Marino               : 1!a5!n5!n12!c
        ibanFormats.put("SM", "[A-Z][0-9]{10}[0-9A-Z]{12}");
        // 🇸🇳 Senegal                  : 5!c5!n12!n2!n
        ibanFormats.put("SN", "[0-9A-Z]{5}[0-9]{19}");
        // 🇸🇴 Somalia                  : 4!n3!n12!n
        ibanFormats.put("SO", "[0-9]{19}");
        // 🇸🇹 Sao Tome and Principe    : 4!n4!n11!n2!n
        ibanFormats.put("ST", "[0-9]{21}");
        // 🇸🇻 El Salvador              : 4!a20!n
        ibanFormats.put("SV", "[A-Z]{4}[0-9]{20}");
        // 🇹🇬 Togo                     : 5!c5!n12!n2!n
        ibanFormats.put("TG", "[0-9A-Z]{5}[0-9]{19}");
        // 🇹🇱 Timor-Leste              : 3!n14!n2!n
        ibanFormats.put("TL", "[0-9]{19}");
        // 🇹🇳 Tunisia                  : 2!n3!n13!n2!n
        ibanFormats.put("TN", "[0-9]{20}");
        // 🇹🇷 Turkey                   : 5!n1!n16!c
        ibanFormats.put("TR", "[0-9]{6}[0-9A-Z]{16}");
        // 🇺🇦 Ukraine                  : 6!n19!c
        ibanFormats.put("UA", "[0-9]{6}[0-9A-Z]{19}");
        // 🇻🇦 Vatican City State       : 3!n15!n
        ibanFormats.put("VA", "[0-9]{18}");
        // 🇻🇬 Virgin Islands           : 4!a16!n
        ibanFormats.put("VG", "[A-Z]{4}[0-9]{16}");
        // 🇽🇰 Kosovo                   : 4!n10!n2!n
        ibanFormats.put("XK", "[0-9]{16}");
        // 🇾🇪 Yemen                    : 4!a4!n18!c
        ibanFormats.put("YE", "[A-Z]{4}[0-9]{4}[0-9A-Z]{18}");
        return ibanFormats;
    }
}
