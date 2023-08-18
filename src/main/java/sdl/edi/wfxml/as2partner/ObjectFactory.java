//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2022.05.12 um 10:42:56 AM CEST 
//


package sdl.edi.wfxml.as2partner;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the sdl.edi.wfxml.as2partner package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Inputmaxmsgs_QNAME = new QName("", "inputmaxmsgs");
    private final static QName _Connectiontimeout_QNAME = new QName("", "connectiontimeout");
    private final static QName _Subject_QNAME = new QName("", "subject");
    private final static QName _Protocolname_QNAME = new QName("", "protocolname");
    private final static QName _Requiresignature_QNAME = new QName("", "requiresignature");
    private final static QName _Tmpmode_QNAME = new QName("", "tmpmode");
    private final static QName _Ssl_QNAME = new QName("", "ssl");
    private final static QName _Fingerprintmode_QNAME = new QName("", "fingerprintmode");
    private final static QName _Password_QNAME = new QName("", "password");
    private final static QName _Protocol_QNAME = new QName("", "protocol");
    private final static QName _Sorterclass_QNAME = new QName("", "sorterclass");
    private final static QName _Historylength_QNAME = new QName("", "historylength");
    private final static QName _Host_QNAME = new QName("", "host");
    private final static QName _Periodbetweenprocattempts_QNAME = new QName("", "periodbetweenprocattempts");
    private final static QName _FlowName_QNAME = new QName("", "flow-name");
    private final static QName _Authmode_QNAME = new QName("", "authmode");
    private final static QName _Compressionalgorithm_QNAME = new QName("", "compressionalgorithm");
    private final static QName _Inputpath_QNAME = new QName("", "inputpath");
    private final static QName _Active_QNAME = new QName("", "active");
    private final static QName _Rootdir_QNAME = new QName("", "rootdir");
    private final static QName _Tmppathmode_QNAME = new QName("", "tmppathmode");
    private final static QName _Inputmaxsize_QNAME = new QName("", "inputmaxsize");
    private final static QName _Priority_QNAME = new QName("", "priority");
    private final static QName _Inputtmppathmode_QNAME = new QName("", "inputtmppathmode");
    private final static QName _Tmpdir_QNAME = new QName("", "tmpdir");
    private final static QName _Signaturealgorithm_QNAME = new QName("", "signaturealgorithm");
    private final static QName _Requirecertmatch_QNAME = new QName("", "requirecertmatch");
    private final static QName _Preserveorder_QNAME = new QName("", "preserveorder");
    private final static QName _Port_QNAME = new QName("", "port");
    private final static QName _Phone_QNAME = new QName("", "phone");
    private final static QName _Incomingmdn_QNAME = new QName("", "incomingmdn");
    private final static QName _Name_QNAME = new QName("", "name");
    private final static QName _Outputpath_QNAME = new QName("", "outputpath");
    private final static QName _Partial_QNAME = new QName("", "partial");
    private final static QName _Ownhttppassword_QNAME = new QName("", "ownhttppassword");
    private final static QName _Requirehttpauth_QNAME = new QName("", "requirehttpauth");
    private final static QName _Includefilemask_QNAME = new QName("", "includefilemask");
    private final static QName _Cronexpression_QNAME = new QName("", "cronexpression");
    private final static QName _Verifymic_QNAME = new QName("", "verifymic");
    private final static QName _Signature_QNAME = new QName("", "signature");
    private final static QName _Nrofmonitattempts_QNAME = new QName("", "nrofmonitattempts");
    private final static QName _Destination_QNAME = new QName("", "destination");
    private final static QName _Description_QNAME = new QName("", "description");
    private final static QName _Excludefilemask_QNAME = new QName("", "excludefilemask");
    private final static QName _Nrofprocattempts_QNAME = new QName("", "nrofprocattempts");
    private final static QName _Inputtmpdir_QNAME = new QName("", "inputtmpdir");
    private final static QName _As2Id_QNAME = new QName("", "as2id");
    private final static QName _Ownhttpusername_QNAME = new QName("", "ownhttpusername");
    private final static QName _Ownsignaturecertalias_QNAME = new QName("", "ownsignaturecertalias");
    private final static QName _Monitoringdelay_QNAME = new QName("", "monitoringdelay");
    private final static QName _Encryption_QNAME = new QName("", "encryption");
    private final static QName _Unsavedmsgshandlingmode_QNAME = new QName("", "unsavedmsgshandlingmode");
    private final static QName _Tmpprefix_QNAME = new QName("", "tmpprefix");
    private final static QName _Outputtmppath_QNAME = new QName("", "outputtmppath");
    private final static QName _RoutingPriority_QNAME = new QName("", "routing-priority");
    private final static QName _Outputtmpmode_QNAME = new QName("", "outputtmpmode");
    private final static QName _SolutionName_QNAME = new QName("", "solution-name");
    private final static QName _Email_QNAME = new QName("", "email");
    private final static QName _Outgoingmdn_QNAME = new QName("", "outgoingmdn");
    private final static QName _Encryptionalgorithm_QNAME = new QName("", "encryptionalgorithm");
    private final static QName _Httpprotocolversion_QNAME = new QName("", "httpprotocolversion");
    private final static QName _Initial_QNAME = new QName("", "initial");
    private final static QName _Abstract_QNAME = new QName("", "abstract");
    private final static QName _Providername_QNAME = new QName("", "providername");
    private final static QName _Mdnurl_QNAME = new QName("", "mdnurl");
    private final static QName _Ownencryptioncertalias_QNAME = new QName("", "ownencryptioncertalias");
    private final static QName _Url_QNAME = new QName("", "url");
    private final static QName _Readtimeout_QNAME = new QName("", "readtimeout");
    private final static QName _Contenttype_QNAME = new QName("", "contenttype");
    private final static QName _Inputtmppath_QNAME = new QName("", "inputtmppath");
    private final static QName _Inputtmpmode_QNAME = new QName("", "inputtmpmode");
    private final static QName _Requiressl_QNAME = new QName("", "requiressl");
    private final static QName _Monitoringmode_QNAME = new QName("", "monitoringmode");
    private final static QName _Requestsignedmdn_QNAME = new QName("", "requestsignedmdn");
    private final static QName _Requireencryption_QNAME = new QName("", "requireencryption");
    private final static QName _Ownas2Id_QNAME = new QName("", "ownas2id");
    private final static QName _Requiresignedmdn_QNAME = new QName("", "requiresignedmdn");
    private final static QName _Remarks_QNAME = new QName("", "remarks");
    private final static QName _Username_QNAME = new QName("", "username");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: sdl.edi.wfxml.as2partner
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Privkey }
     * 
     */
    public Privkey createPrivkey() {
        return new Privkey();
    }

    /**
     * Create an instance of {@link Sftpserver }
     * 
     */
    public Sftpserver createSftpserver() {
        return new Sftpserver();
    }

    /**
     * Create an instance of {@link Lastmodifthreshold }
     * 
     */
    public Lastmodifthreshold createLastmodifthreshold() {
        return new Lastmodifthreshold();
    }

    /**
     * Create an instance of {@link Property }
     * 
     */
    public Property createProperty() {
        return new Property();
    }

    /**
     * Create an instance of {@link Outputtmpprefix }
     * 
     */
    public Outputtmpprefix createOutputtmpprefix() {
        return new Outputtmpprefix();
    }

    /**
     * Create an instance of {@link Inputtmpprefix }
     * 
     */
    public Inputtmpprefix createInputtmpprefix() {
        return new Inputtmpprefix();
    }

    /**
     * Create an instance of {@link Certificates }
     * 
     */
    public Certificates createCertificates() {
        return new Certificates();
    }

    /**
     * Create an instance of {@link Partner }
     * 
     */
    public Partner createPartner() {
        return new Partner();
    }

    /**
     * Create an instance of {@link Common }
     * 
     */
    public Common createCommon() {
        return new Common();
    }

    /**
     * Create an instance of {@link Limitingtimeperiod }
     * 
     */
    public Limitingtimeperiod createLimitingtimeperiod() {
        return new Limitingtimeperiod();
    }

    /**
     * Create an instance of {@link Limitsentbytestotal }
     * 
     */
    public Limitsentbytestotal createLimitsentbytestotal() {
        return new Limitsentbytestotal();
    }

    /**
     * Create an instance of {@link Limitsentmessagescount }
     * 
     */
    public Limitsentmessagescount createLimitsentmessagescount() {
        return new Limitsentmessagescount();
    }

    /**
     * Create an instance of {@link Excludeolderthen }
     * 
     */
    public Excludeolderthen createExcludeolderthen() {
        return new Excludeolderthen();
    }

    /**
     * Create an instance of {@link Filesystem }
     * 
     */
    public Filesystem createFilesystem() {
        return new Filesystem();
    }

    /**
     * Create an instance of {@link Sftpclient }
     * 
     */
    public Sftpclient createSftpclient() {
        return new Sftpclient();
    }

    /**
     * Create an instance of {@link Fingerprintvalue }
     * 
     */
    public Fingerprintvalue createFingerprintvalue() {
        return new Fingerprintvalue();
    }

    /**
     * Create an instance of {@link Schedulings }
     * 
     */
    public Schedulings createSchedulings() {
        return new Schedulings();
    }

    /**
     * Create an instance of {@link Scheduling }
     * 
     */
    public Scheduling createScheduling() {
        return new Scheduling();
    }

    /**
     * Create an instance of {@link As2 }
     * 
     */
    public As2 createAs2() {
        return new As2();
    }

    /**
     * Create an instance of {@link Partnerhttpusername }
     * 
     */
    public Partnerhttpusername createPartnerhttpusername() {
        return new Partnerhttpusername();
    }

    /**
     * Create an instance of {@link Partnerhttppassword }
     * 
     */
    public Partnerhttppassword createPartnerhttppassword() {
        return new Partnerhttppassword();
    }

    /**
     * Create an instance of {@link Contacts }
     * 
     */
    public Contacts createContacts() {
        return new Contacts();
    }

    /**
     * Create an instance of {@link Contact }
     * 
     */
    public Contact createContact() {
        return new Contact();
    }

    /**
     * Create an instance of {@link Conditions }
     * 
     */
    public Conditions createConditions() {
        return new Conditions();
    }

    /**
     * Create an instance of {@link NotExists }
     * 
     */
    public NotExists createNotExists() {
        return new NotExists();
    }

    /**
     * Create an instance of {@link Update }
     * 
     */
    public Update createUpdate() {
        return new Update();
    }

    /**
     * Create an instance of {@link Updates }
     * 
     */
    public Updates createUpdates() {
        return new Updates();
    }

    /**
     * Create an instance of {@link Provider }
     * 
     */
    public Provider createProvider() {
        return new Provider();
    }

    /**
     * Create an instance of {@link DeciderRule }
     * 
     */
    public DeciderRule createDeciderRule() {
        return new DeciderRule();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "inputmaxmsgs")
    public JAXBElement<BigInteger> createInputmaxmsgs(BigInteger value) {
        return new JAXBElement<BigInteger>(_Inputmaxmsgs_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "connectiontimeout")
    public JAXBElement<BigInteger> createConnectiontimeout(BigInteger value) {
        return new JAXBElement<BigInteger>(_Connectiontimeout_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "subject")
    public JAXBElement<String> createSubject(String value) {
        return new JAXBElement<String>(_Subject_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "protocolname")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createProtocolname(String value) {
        return new JAXBElement<String>(_Protocolname_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requiresignature")
    public JAXBElement<BigInteger> createRequiresignature(BigInteger value) {
        return new JAXBElement<BigInteger>(_Requiresignature_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "tmpmode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTmpmode(String value) {
        return new JAXBElement<String>(_Tmpmode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ssl")
    public JAXBElement<String> createSsl(String value) {
        return new JAXBElement<String>(_Ssl_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "fingerprintmode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createFingerprintmode(String value) {
        return new JAXBElement<String>(_Fingerprintmode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "password")
    public JAXBElement<String> createPassword(String value) {
        return new JAXBElement<String>(_Password_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "protocol")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createProtocol(String value) {
        return new JAXBElement<String>(_Protocol_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "sorterclass")
    public JAXBElement<String> createSorterclass(String value) {
        return new JAXBElement<String>(_Sorterclass_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "historylength")
    public JAXBElement<BigInteger> createHistorylength(BigInteger value) {
        return new JAXBElement<BigInteger>(_Historylength_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "host")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createHost(String value) {
        return new JAXBElement<String>(_Host_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "periodbetweenprocattempts")
    public JAXBElement<BigInteger> createPeriodbetweenprocattempts(BigInteger value) {
        return new JAXBElement<BigInteger>(_Periodbetweenprocattempts_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "flow-name")
    public JAXBElement<String> createFlowName(String value) {
        return new JAXBElement<String>(_FlowName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "authmode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createAuthmode(String value) {
        return new JAXBElement<String>(_Authmode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "compressionalgorithm")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCompressionalgorithm(String value) {
        return new JAXBElement<String>(_Compressionalgorithm_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "inputpath")
    public JAXBElement<String> createInputpath(String value) {
        return new JAXBElement<String>(_Inputpath_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "active")
    public JAXBElement<BigInteger> createActive(BigInteger value) {
        return new JAXBElement<BigInteger>(_Active_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "rootdir")
    public JAXBElement<String> createRootdir(String value) {
        return new JAXBElement<String>(_Rootdir_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "tmppathmode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTmppathmode(String value) {
        return new JAXBElement<String>(_Tmppathmode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "inputmaxsize")
    public JAXBElement<BigInteger> createInputmaxsize(BigInteger value) {
        return new JAXBElement<BigInteger>(_Inputmaxsize_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "priority")
    public JAXBElement<BigInteger> createPriority(BigInteger value) {
        return new JAXBElement<BigInteger>(_Priority_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "inputtmppathmode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createInputtmppathmode(String value) {
        return new JAXBElement<String>(_Inputtmppathmode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "tmpdir")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTmpdir(String value) {
        return new JAXBElement<String>(_Tmpdir_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "signaturealgorithm")
    public JAXBElement<String> createSignaturealgorithm(String value) {
        return new JAXBElement<String>(_Signaturealgorithm_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requirecertmatch")
    public JAXBElement<BigInteger> createRequirecertmatch(BigInteger value) {
        return new JAXBElement<BigInteger>(_Requirecertmatch_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "preserveorder")
    public JAXBElement<BigInteger> createPreserveorder(BigInteger value) {
        return new JAXBElement<BigInteger>(_Preserveorder_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "port")
    public JAXBElement<BigInteger> createPort(BigInteger value) {
        return new JAXBElement<BigInteger>(_Port_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "phone")
    public JAXBElement<String> createPhone(String value) {
        return new JAXBElement<String>(_Phone_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "incomingmdn")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createIncomingmdn(String value) {
        return new JAXBElement<String>(_Incomingmdn_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "name")
    public JAXBElement<String> createName(String value) {
        return new JAXBElement<String>(_Name_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "outputpath")
    public JAXBElement<String> createOutputpath(String value) {
        return new JAXBElement<String>(_Outputpath_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "partial")
    public JAXBElement<BigInteger> createPartial(BigInteger value) {
        return new JAXBElement<BigInteger>(_Partial_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ownhttppassword")
    public JAXBElement<String> createOwnhttppassword(String value) {
        return new JAXBElement<String>(_Ownhttppassword_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requirehttpauth")
    public JAXBElement<BigInteger> createRequirehttpauth(BigInteger value) {
        return new JAXBElement<BigInteger>(_Requirehttpauth_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "includefilemask")
    public JAXBElement<String> createIncludefilemask(String value) {
        return new JAXBElement<String>(_Includefilemask_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "cronexpression")
    public JAXBElement<String> createCronexpression(String value) {
        return new JAXBElement<String>(_Cronexpression_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "verifymic")
    public JAXBElement<BigInteger> createVerifymic(BigInteger value) {
        return new JAXBElement<BigInteger>(_Verifymic_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "signature")
    public JAXBElement<String> createSignature(String value) {
        return new JAXBElement<String>(_Signature_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "nrofmonitattempts")
    public JAXBElement<String> createNrofmonitattempts(String value) {
        return new JAXBElement<String>(_Nrofmonitattempts_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "destination")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDestination(String value) {
        return new JAXBElement<String>(_Destination_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "description")
    public JAXBElement<String> createDescription(String value) {
        return new JAXBElement<String>(_Description_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "excludefilemask")
    public JAXBElement<String> createExcludefilemask(String value) {
        return new JAXBElement<String>(_Excludefilemask_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "nrofprocattempts")
    public JAXBElement<BigInteger> createNrofprocattempts(BigInteger value) {
        return new JAXBElement<BigInteger>(_Nrofprocattempts_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "inputtmpdir")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createInputtmpdir(String value) {
        return new JAXBElement<String>(_Inputtmpdir_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "as2id")
    public JAXBElement<String> createAs2Id(String value) {
        return new JAXBElement<String>(_As2Id_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ownhttpusername")
    public JAXBElement<String> createOwnhttpusername(String value) {
        return new JAXBElement<String>(_Ownhttpusername_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ownsignaturecertalias")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createOwnsignaturecertalias(String value) {
        return new JAXBElement<String>(_Ownsignaturecertalias_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "monitoringdelay")
    public JAXBElement<String> createMonitoringdelay(String value) {
        return new JAXBElement<String>(_Monitoringdelay_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "encryption")
    public JAXBElement<String> createEncryption(String value) {
        return new JAXBElement<String>(_Encryption_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "unsavedmsgshandlingmode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createUnsavedmsgshandlingmode(String value) {
        return new JAXBElement<String>(_Unsavedmsgshandlingmode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "tmpprefix")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTmpprefix(String value) {
        return new JAXBElement<String>(_Tmpprefix_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "outputtmppath")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createOutputtmppath(String value) {
        return new JAXBElement<String>(_Outputtmppath_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "routing-priority")
    public JAXBElement<BigInteger> createRoutingPriority(BigInteger value) {
        return new JAXBElement<BigInteger>(_RoutingPriority_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "outputtmpmode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createOutputtmpmode(String value) {
        return new JAXBElement<String>(_Outputtmpmode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "solution-name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSolutionName(String value) {
        return new JAXBElement<String>(_SolutionName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "email")
    public JAXBElement<String> createEmail(String value) {
        return new JAXBElement<String>(_Email_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "outgoingmdn")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createOutgoingmdn(String value) {
        return new JAXBElement<String>(_Outgoingmdn_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "encryptionalgorithm")
    public JAXBElement<String> createEncryptionalgorithm(String value) {
        return new JAXBElement<String>(_Encryptionalgorithm_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "httpprotocolversion")
    public JAXBElement<BigDecimal> createHttpprotocolversion(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Httpprotocolversion_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "initial")
    public JAXBElement<BigInteger> createInitial(BigInteger value) {
        return new JAXBElement<BigInteger>(_Initial_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "abstract")
    public JAXBElement<BigInteger> createAbstract(BigInteger value) {
        return new JAXBElement<BigInteger>(_Abstract_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "providername")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createProvidername(String value) {
        return new JAXBElement<String>(_Providername_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "mdnurl")
    public JAXBElement<String> createMdnurl(String value) {
        return new JAXBElement<String>(_Mdnurl_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ownencryptioncertalias")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createOwnencryptioncertalias(String value) {
        return new JAXBElement<String>(_Ownencryptioncertalias_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "url")
    public JAXBElement<String> createUrl(String value) {
        return new JAXBElement<String>(_Url_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "readtimeout")
    public JAXBElement<BigInteger> createReadtimeout(BigInteger value) {
        return new JAXBElement<BigInteger>(_Readtimeout_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "contenttype")
    public JAXBElement<String> createContenttype(String value) {
        return new JAXBElement<String>(_Contenttype_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "inputtmppath")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createInputtmppath(String value) {
        return new JAXBElement<String>(_Inputtmppath_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "inputtmpmode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createInputtmpmode(String value) {
        return new JAXBElement<String>(_Inputtmpmode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requiressl")
    public JAXBElement<BigInteger> createRequiressl(BigInteger value) {
        return new JAXBElement<BigInteger>(_Requiressl_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "monitoringmode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createMonitoringmode(String value) {
        return new JAXBElement<String>(_Monitoringmode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestsignedmdn")
    public JAXBElement<BigInteger> createRequestsignedmdn(BigInteger value) {
        return new JAXBElement<BigInteger>(_Requestsignedmdn_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requireencryption")
    public JAXBElement<BigInteger> createRequireencryption(BigInteger value) {
        return new JAXBElement<BigInteger>(_Requireencryption_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ownas2id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createOwnas2Id(String value) {
        return new JAXBElement<String>(_Ownas2Id_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requiresignedmdn")
    public JAXBElement<BigInteger> createRequiresignedmdn(BigInteger value) {
        return new JAXBElement<BigInteger>(_Requiresignedmdn_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "remarks")
    public JAXBElement<String> createRemarks(String value) {
        return new JAXBElement<String>(_Remarks_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "username")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createUsername(String value) {
        return new JAXBElement<String>(_Username_QNAME, String.class, null, value);
    }

}
