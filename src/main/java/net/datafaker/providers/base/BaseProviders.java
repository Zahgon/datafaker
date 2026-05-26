package net.datafaker.providers.base;

import net.datafaker.providers.healthcare.HealthcareFaker;

/**
 * The interface to register providers for {@link BaseFaker}.
 */
public interface BaseProviders extends ProviderRegistration {

    default Address address() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Ancient ancient() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Animal animal() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default App app() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Appliance appliance() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Artist artist() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Australia australia() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Aviation aviation() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Aws aws() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Azure azure() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Barcode barcode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default BloodType bloodtype() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Book book() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Bool bool() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Brand brand() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Business business() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Camera camera() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Cannabis cannabis() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Cat cat() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Chiquito chiquito() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default CNPJ cnpj() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Code code() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Coin coin() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Color color() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Commerce commerce() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Community community() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Company company() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Compass compass() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Computer computer() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Construction construction() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Cosmere cosmere() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Country country() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default CPF cpf() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Credentials credentials() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default CryptoCoin cryptoCoin() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default CultureSeries cultureSeries() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @deprecated Use {@link #money()} instead.
     */
    @Deprecated(since = "2.5.0", forRemoval = true)
    @SuppressWarnings("removal")
    default Currency currency() {
        return getProvider(Currency.class, Currency::new);
    }

    /**
     * @deprecated Use {@link #timeAndDate()} instead.
     */
    @Deprecated(since = "2.5.0", forRemoval = true)
    @SuppressWarnings("removal")
    default DateAndTime date() {
        return getProvider(DateAndTime.class, DateAndTime::new);
    }

    default DcComics dcComics() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Demographic demographic() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Device device() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Dog dog() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Domain domain() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default DrivingLicense drivingLicense() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Drone drone() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default DungeonsAndDragons dungeonsAndDragons() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Educator educator() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default ElectricalComponents electricalComponents() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Emergency emergency() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Emoji emoji() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default FakeDuration duration() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default FamousLastWords famousLastWords() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default File file() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Finance finance() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default FinancialTerms financialTerms() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Fingerprint fingerprint() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default FunnyName funnyName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default GarmentSize garmentSize() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Gender gender() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default GreekPhilosopher greekPhilosopher() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Hacker hacker() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Hashing hashing() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Hipster hipster() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Hobby hobby() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Hololive hololive() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Horse horse() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default House house() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default IdNumber idNumber() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Image image() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default IndustrySegments industrySegments() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Internet internet() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Job job() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Kpop kpop() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default LanguageCode languageCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default LargeLanguageModel largeLanguageModel() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Locality locality() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Location location() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Lorem lorem() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Marketing marketing() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Matz matz() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Mbti mbti() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Measurement measurement() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Use {@link HealthcareFaker} instead
     */
    @Deprecated(since = "2.5.0", forRemoval = true)
    @SuppressWarnings("removal")
    default Medical medical() {
        return getProvider(Medical.class, Medical::new);
    }

    default Military military() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Money money() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Mood mood() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Mountain mountain() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Mountaineering mountaineering() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Music music() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Name name() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Nation nation() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default NatoPhoneticAlphabet natoPhoneticAlphabet() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Nigeria nigeria() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Number number() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default OlympicSport olympicSport() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Passport passport() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default PhoneNumber phoneNumber() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Photography photography() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Planet planet() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default ProgrammingLanguage programmingLanguage() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Relationship relationships() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Restaurant restaurant() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Robin robin() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default RockBand rockBand() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Science science() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default SlackEmoji slackEmoji() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Shakespeare shakespeare() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Sip sip() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Size size() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Space space() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Stock stock() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Subscription subscription() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Superhero superhero() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Team team() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Text text() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Time time() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default TimeAndDate timeAndDate() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Tire tire() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Transport transport() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Twitter twitter() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Unique unique() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default University university() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Vehicle vehicle() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Verb verb() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Weather weather() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Word word() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Yoda yoda() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Zodiac zodiac() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Pronouns pronouns() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
