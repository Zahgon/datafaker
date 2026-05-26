package net.datafaker.providers.base;

import java.util.List;
import static net.datafaker.providers.base.AviationCodeType.IATA;
import static net.datafaker.providers.base.AviationCodeType.ICAO;

/**
 * Generates aviation related strings.
 *
 * @since 0.8.0
 */
public class Aviation extends AbstractProvider<BaseProviders> {

    protected Aviation(BaseProviders faker) {
        super(faker);
    }

    /**
     * @return one of the 6 types of aircraft:
     * airplane, warplane, general, cargo, army helicopter, civil helicopter.
     */
    public String aircraft() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String airplane() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String warplane() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return general aviation aircraft.
     * See also: <a href="https://www.iaopa.eu/what-is-general-aviation">...ICAO defines general aviation operation by exception: those flight activities not involving commercial air transportation or aerial work.</a>
     */
    public String general() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return a cargo aircraft which is dedicated to transport freight.
     */
    public String cargo() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String armyHelicopter() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String civilHelicopter() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns an airport ICAO code.
     * <p>
     *  Seems that this method can return some local airport codes in addition to official ICAO code.
     *  For example, it returns "CNT3" code for Ogoki Post Airport, but its official ICAO code is "CYKP".
     * </p>
     * @see <a href="https://en.wikipedia.org/wiki/List_of_airports_by_ICAO_code:_A">https://en.wikipedia.org/wiki/List_of_airports_by_ICAO_code:_A</a>
     */
    public String airport() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns either 3-letter IATA code or 4-letter ICAO code of a random airport
     * @see AviationCodeType
     */
    public String airport(AviationCodeType codeType) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return an airport name. Source: <a href="http://www.flugzeuginfo.net/table_airportcodes_country-location_en.php">http://www.flugzeuginfo.net/table_airportcodes_country-location_en.php</a>
     */
    public String airportName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Provides a METAR weather report.
     * Have a look at <a href="https://en.wikipedia.org/wiki/METAR">https://en.wikipedia.org/wiki/METAR</a>
     */
    public String METAR() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Provides a name of an aviation-related manufacturer.
     * Sources: <a href="https://www.icao.int/publications/DOC8643/Pages/Manufacturers.aspx">ICAO publications</a>
     * and <a href="https://www.aviationfanatic.com/ent_list.php?ent=3&pg=1">aviationfanatic.com</a>
     */
    public String manufacturer() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Provides an aircraft special type designator.
     * Source: <a href="https://www.icao.int/publications/DOC8643/Pages/SpecialDesignators.aspx">ICAO publications</a>
     */
    public String specialTypeDesignator() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Provides engine type name.
     * Source: <a href="https://www.icao.int/publications/DOC8643/Pages/Search.aspx">ICAO publications</a>
     */
    public String engineType() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @deprecated use {@link #flight(AviationCodeType)} instead
     */
    @Deprecated
    public String flight(String type) {
        if ("ICAO".equalsIgnoreCase(type)) {
            return flight(ICAO);
        } else {
            return flight(IATA);
        }
    }

    /**
     * Returns a flight number (IATA or ICAO format).
     *
     * @return A random flight number with IATA or ICAO format in a String.
     */
    public String flight(AviationCodeType type) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a flight number without specifying flight number format.
     *
     * @return A random flight number with IATA format in a String.
     */
    public String flight() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a flight status.
     *
     *  @return A randomly selected flight status in a String.
     */
    public String flightStatus() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a gate id.
     *
     *  @return A random airport gate id.
     */
    public String gate() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns an airline name.
     *
     * @return A randomly selected airline name in a String.
     */
    public String airline() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns an ULD type.
     * ULD stands for Unit Load Device (pallet or container).
     * Sources: <a href="https://en.wikipedia.org/wiki/Unit_load_device">Unit load device</a>
     * and <a href="https://www.boeing.com/resources/boeingdotcom/company/about_bca/pdf/CargoPalletsContainers.pdf">Pallets and containers</a>
     *
     * @return A randomly selected ULD type.
     */
    public String uldType() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns an ULD IATA code(prefix).
     * ULD stands for Unit Load Device (pallet or container).
     * Sources: <a href="https://en.wikipedia.org/wiki/Unit_load_device">Unit load device</a>
     * and <a href="https://www.boeing.com/resources/boeingdotcom/company/about_bca/pdf/CargoPalletsContainers.pdf">Pallets and containers</a>
     *
     * @return A randomly selected ULD type.
     */
    public String uldCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
