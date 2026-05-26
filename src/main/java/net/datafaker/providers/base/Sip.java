package net.datafaker.providers.base;

import static java.nio.charset.StandardCharsets.UTF_8;

/**
 * Faker class for generating Session Initiation Protocol (SIP) related data.
 *
 * @author TomerFi
 * @since 0.8.0
 */
public class Sip extends AbstractProvider<BaseProviders> {

    private final int[] portPool = new int[5001];

    public Sip(final BaseProviders faker) {
        super(faker);
        for (int i = 0; i < portPool.length; i++) {
            portPool[i] = 40000 + 2 * i;
        }
    }

    /**
     * The various SIP methods are listed in <a href="https://en.wikipedia.org/wiki/Session_Initiation_Protocol">https://en.wikipedia.org/wiki/Session_Initiation_Protocol</a>.
     *
     * @return a SIP method String, e.g. {@code INVITE}.
     */
    public String method() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Content types are based on <a href="https://tools.ietf.org/html/rfc5621">https://tools.ietf.org/html/rfc5621</a> and
     * <a href="https://tools.ietf.org/html/rfc3261">https://tools.ietf.org/html/rfc3261</a>.
     *
     * @return a SIP content-type declaration String, e.g. {@code application/sdp}
     */
    public String contentType() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Get a 4 digit random port for SIP messaging.
     *
     * @return a SIP messaging port int, e.g. 5060.
     */
    public int messagingPort() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Get a 5 digit positive even port for rtp udp communication.
     *
     * @return an RTP UDP 5 digit port int, e.g. 40002.
     */
    public int rtpPort() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Provisional code, the various response codes are listed in
     * <a href="https://en.wikipedia.org/wiki/List_of_SIP_response_codes">https://en.wikipedia.org/wiki/List_of_SIP_response_codes</a>.
     *
     * @return a 3 digit SIP provision response code between 100 and 199 int, e.g. {@code 180}.
     */
    public int provisionalResponseCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Success code, the various response codes are listed in
     * <a href="https://en.wikipedia.org/wiki/List_of_SIP_response_codes">https://en.wikipedia.org/wiki/List_of_SIP_response_codes</a>.
     *
     * @return a 3 digit SIP success response code between 200 and 299 int, e.g. {@code 200}.
     */
    public int successResponseCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Redirection code, the various response codes are listed in
     * <a href="https://en.wikipedia.org/wiki/List_of_SIP_response_codes">https://en.wikipedia.org/wiki/List_of_SIP_response_codes</a>.
     *
     * @return a 3 digit SIP redirection response code between 300 and 399 int, e.g. {@code 301}.
     */
    public int redirectResponseCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Client error code, the various response codes are listed in
     * <a href="https://en.wikipedia.org/wiki/List_of_SIP_response_codes">https://en.wikipedia.org/wiki/List_of_SIP_response_codes</a>.
     *
     * @return a 3 digit SIP client error response code between 400 and 499 int, e.g. {@code 486}.
     */
    public int clientErrorResponseCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Server error code, the various response codes are listed in
     * <a href="https://en.wikipedia.org/wiki/List_of_SIP_response_codes">https://en.wikipedia.org/wiki/List_of_SIP_response_codes</a>.
     *
     * @return a 3 digit SIP server error response code between 500 and 599 int, e.g. {@code 503}.
     */
    public int serverErrorResponseCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Global error code, the various response codes are listed in
     * <a href="https://en.wikipedia.org/wiki/List_of_SIP_response_codes">https://en.wikipedia.org/wiki/List_of_SIP_response_codes</a>.
     *
     * @return a 3 digit SIP global error response code between 600 and 699 int, e.g. {@code 608}.
     */
    public int globalErrorResponseCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Provisional phrase, the various response phrases are listed in
     * <a href="https://en.wikipedia.org/wiki/List_of_SIP_response_codes">https://en.wikipedia.org/wiki/List_of_SIP_response_codes</a>.
     *
     * @return a SIP provisional response phrase String, e.g. {@code Ringing}.
     */
    public String provisionalResponsePhrase() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Success phrase, the various response phrases are listed in
     * <a href="https://en.wikipedia.org/wiki/List_of_SIP_response_codes">https://en.wikipedia.org/wiki/List_of_SIP_response_codes</a>.
     *
     * @return a SIP success response phrase String, e.g. {@code OK}.
     */
    public String successResponsePhrase() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Redirection phrase, the various response phrases are listed in
     * <a href="https://en.wikipedia.org/wiki/List_of_SIP_response_codes">https://en.wikipedia.org/wiki/List_of_SIP_response_codes</a>.
     *
     * @return a SIP redirection response phrase String, e.g. {@code Moved Permanently}.
     */
    public String redirectResponsePhrase() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Client error phrase, the various response phrases are listed in
     * <a href="https://en.wikipedia.org/wiki/List_of_SIP_response_codes">https://en.wikipedia.org/wiki/List_of_SIP_response_codes</a>.
     *
     * @return a SIP client error response phrase String, e.g. {@code Busy Here}.
     */
    public String clientErrorResponsePhrase() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Server error phrase, the various response phrases are listed in
     * <a href="https://en.wikipedia.org/wiki/List_of_SIP_response_codes">https://en.wikipedia.org/wiki/List_of_SIP_response_codes</a>.
     *
     * @return a SIP server error response phrase String, e.g. {@code Service Unavailable}.
     */
    public String serverErrorResponsePhrase() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Server error phrase, the various response phrases are listed in
     * <a href="https://en.wikipedia.org/wiki/List_of_SIP_response_codes">https://en.wikipedia.org/wiki/List_of_SIP_response_codes</a>.
     *
     * @return a SIP global error response phrase String, e.g. {@code Rejected}.
     */
    public String globalErrorResponsePhrase() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Body example of SDP type can be found in <a href="https://tools.ietf.org/html/rfc5621">https://tools.ietf.org/html/rfc5621</a>.
     *
     * @return a fake SDP type SIP body String.
     */
    public String bodyString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Body example of SDP type can be found in <a href="https://tools.ietf.org/html/rfc5621">https://tools.ietf.org/html/rfc5621</a>.
     *
     * @return a fake SDP type SIP body byte array.
     */
    public byte[] bodyBytes() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Return a valid name address to use with {@code to/from} headers.
     *
     * @return a valid name address String, e.g. {@code <sip:fakeName@10.1.2.3:5060>}.
     */
    public String nameAddress() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
