//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2022.05.12 um 10:43:24 AM CEST 
//


package sdl.edi.wfxml.oftp2partner;

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
 * generated in the sdl.edi.wfxml.oftp2partner package. 
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
    private final static QName _Oftpversion_QNAME = new QName("", "oftpversion");
    private final static QName _Ocreval_QNAME = new QName("", "ocreval");
    private final static QName _Protocolname_QNAME = new QName("", "protocolname");
    private final static QName _Replace_QNAME = new QName("", "replace");
    private final static QName _Passwordfrom_QNAME = new QName("", "passwordfrom");
    private final static QName _Protocol_QNAME = new QName("", "protocol");
    private final static QName _Odetteid_QNAME = new QName("", "odetteid");
    private final static QName _Eerpout_QNAME = new QName("", "eerpout");
    private final static QName _Periodbetweenprocattempts_QNAME = new QName("", "periodbetweenprocattempts");
    private final static QName _Eerpin_QNAME = new QName("", "eerpin");
    private final static QName _FlowName_QNAME = new QName("", "flow-name");
    private final static QName _TlsPublickeys_QNAME = new QName("", "tls_publickeys");
    private final static QName _CmsCompress_QNAME = new QName("", "cms_compress");
    private final static QName _Active_QNAME = new QName("", "active");
    private final static QName _Messagesmaxtime_QNAME = new QName("", "messagesmaxtime");
    private final static QName _Inputmaxsize_QNAME = new QName("", "inputmaxsize");
    private final static QName _Priority_QNAME = new QName("", "priority");
    private final static QName _Monitoring_QNAME = new QName("", "monitoring");
    private final static QName _Recordmode_QNAME = new QName("", "recordmode");
    private final static QName _Secfeature_QNAME = new QName("", "secfeature");
    private final static QName _Lastmodifthreshold_QNAME = new QName("", "lastmodifthreshold");
    private final static QName _Preserveorder_QNAME = new QName("", "preserveorder");
    private final static QName _Phone_QNAME = new QName("", "phone");
    private final static QName _Port_QNAME = new QName("", "port");
    private final static QName _Name_QNAME = new QName("", "name");
    private final static QName _CmsSign_QNAME = new QName("", "cms_sign");
    private final static QName _Partial_QNAME = new QName("", "partial");
    private final static QName _Ipaddress_QNAME = new QName("", "ipaddress");
    private final static QName _Cronexpression_QNAME = new QName("", "cronexpression");
    private final static QName _Vftype_QNAME = new QName("", "vftype");
    private final static QName _Parallelsessions_QNAME = new QName("", "parallelsessions");
    private final static QName _Destination_QNAME = new QName("", "destination");
    private final static QName _Description_QNAME = new QName("", "description");
    private final static QName _Neighbourpartner_QNAME = new QName("", "neighbourpartner");
    private final static QName _Nrofprocattempts_QNAME = new QName("", "nrofprocattempts");
    private final static QName _Security_QNAME = new QName("", "security");
    private final static QName _Passwordto_QNAME = new QName("", "passwordto");
    private final static QName _Monitoringdelay_QNAME = new QName("", "monitoringdelay");
    private final static QName _Unsavedmsgshandlingmode_QNAME = new QName("", "unsavedmsgshandlingmode");
    private final static QName _Recordhandling_QNAME = new QName("", "recordhandling");
    private final static QName _HashAlgorithm_QNAME = new QName("", "hash_algorithm");
    private final static QName _CmsEncrypt_QNAME = new QName("", "cms_encrypt");
    private final static QName _RoutingPriority_QNAME = new QName("", "routing-priority");
    private final static QName _Recordlength_QNAME = new QName("", "recordlength");
    private final static QName _CmsPublickeys_QNAME = new QName("", "cms_publickeys");
    private final static QName _SolutionName_QNAME = new QName("", "solution-name");
    private final static QName _Email_QNAME = new QName("", "email");
    private final static QName _Authentication_QNAME = new QName("", "authentication");
    private final static QName _Oexbuf_QNAME = new QName("", "oexbuf");
    private final static QName _Dataformat_QNAME = new QName("", "dataformat");
    private final static QName _Encryptionalgorithm_QNAME = new QName("", "encryptionalgorithm");
    private final static QName _Certvalidationtype_QNAME = new QName("", "certvalidationtype");
    private final static QName _Initial_QNAME = new QName("", "initial");
    private final static QName _Transmissionmode_QNAME = new QName("", "transmissionmode");
    private final static QName _Routingmode_QNAME = new QName("", "routingmode");
    private final static QName _Abstract_QNAME = new QName("", "abstract");
    private final static QName _Vdsnchar_QNAME = new QName("", "vdsnchar");
    private final static QName _Providername_QNAME = new QName("", "providername");
    private final static QName _CmsReqsigneerp_QNAME = new QName("", "cms_reqsigneerp");
    private final static QName _Filenamefrom_QNAME = new QName("", "filenamefrom");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: sdl.edi.wfxml.oftp2partner
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Limitingtimeperiod }
     * 
     */
    public Limitingtimeperiod createLimitingtimeperiod() {
        return new Limitingtimeperiod();
    }

    /**
     * Create an instance of {@link Contact }
     * 
     */
    public Contact createContact() {
        return new Contact();
    }

    /**
     * Create an instance of {@link Remarks }
     * 
     */
    public Remarks createRemarks() {
        return new Remarks();
    }

    /**
     * Create an instance of {@link Property }
     * 
     */
    public Property createProperty() {
        return new Property();
    }

    /**
     * Create an instance of {@link Scheduling }
     * 
     */
    public Scheduling createScheduling() {
        return new Scheduling();
    }

    /**
     * Create an instance of {@link Partneroftp2 }
     * 
     */
    public Partneroftp2 createPartneroftp2() {
        return new Partneroftp2();
    }

    /**
     * Create an instance of {@link Conversionout }
     * 
     */
    public Conversionout createConversionout() {
        return new Conversionout();
    }

    /**
     * Create an instance of {@link Conversionin }
     * 
     */
    public Conversionin createConversionin() {
        return new Conversionin();
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
     * Create an instance of {@link Common }
     * 
     */
    public Common createCommon() {
        return new Common();
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
     * Create an instance of {@link Schedulings }
     * 
     */
    public Schedulings createSchedulings() {
        return new Schedulings();
    }

    /**
     * Create an instance of {@link DeciderRule }
     * 
     */
    public DeciderRule createDeciderRule() {
        return new DeciderRule();
    }

    /**
     * Create an instance of {@link Partner }
     * 
     */
    public Partner createPartner() {
        return new Partner();
    }

    /**
     * Create an instance of {@link Contacts }
     * 
     */
    public Contacts createContacts() {
        return new Contacts();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "oftpversion")
    public JAXBElement<BigDecimal> createOftpversion(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Oftpversion_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ocreval")
    public JAXBElement<BigInteger> createOcreval(BigInteger value) {
        return new JAXBElement<BigInteger>(_Ocreval_QNAME, BigInteger.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "replace")
    public JAXBElement<BigInteger> createReplace(BigInteger value) {
        return new JAXBElement<BigInteger>(_Replace_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "passwordfrom")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPasswordfrom(String value) {
        return new JAXBElement<String>(_Passwordfrom_QNAME, String.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "odetteid")
    public JAXBElement<String> createOdetteid(String value) {
        return new JAXBElement<String>(_Odetteid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "eerpout")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createEerpout(String value) {
        return new JAXBElement<String>(_Eerpout_QNAME, String.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "eerpin")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createEerpin(String value) {
        return new JAXBElement<String>(_Eerpin_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "flow-name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createFlowName(String value) {
        return new JAXBElement<String>(_FlowName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "tls_publickeys")
    public JAXBElement<String> createTlsPublickeys(String value) {
        return new JAXBElement<String>(_TlsPublickeys_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "cms_compress")
    public JAXBElement<BigInteger> createCmsCompress(BigInteger value) {
        return new JAXBElement<BigInteger>(_CmsCompress_QNAME, BigInteger.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "messagesmaxtime")
    public JAXBElement<BigInteger> createMessagesmaxtime(BigInteger value) {
        return new JAXBElement<BigInteger>(_Messagesmaxtime_QNAME, BigInteger.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "monitoring")
    public JAXBElement<BigInteger> createMonitoring(BigInteger value) {
        return new JAXBElement<BigInteger>(_Monitoring_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "recordmode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createRecordmode(String value) {
        return new JAXBElement<String>(_Recordmode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "secfeature")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSecfeature(String value) {
        return new JAXBElement<String>(_Secfeature_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "lastmodifthreshold")
    public JAXBElement<BigInteger> createLastmodifthreshold(BigInteger value) {
        return new JAXBElement<BigInteger>(_Lastmodifthreshold_QNAME, BigInteger.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "phone")
    public JAXBElement<String> createPhone(String value) {
        return new JAXBElement<String>(_Phone_QNAME, String.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "name")
    public JAXBElement<String> createName(String value) {
        return new JAXBElement<String>(_Name_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "cms_sign")
    public JAXBElement<BigInteger> createCmsSign(BigInteger value) {
        return new JAXBElement<BigInteger>(_CmsSign_QNAME, BigInteger.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "ipaddress")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createIpaddress(String value) {
        return new JAXBElement<String>(_Ipaddress_QNAME, String.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "vftype")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createVftype(String value) {
        return new JAXBElement<String>(_Vftype_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "parallelsessions")
    public JAXBElement<BigInteger> createParallelsessions(BigInteger value) {
        return new JAXBElement<BigInteger>(_Parallelsessions_QNAME, BigInteger.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "neighbourpartner")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createNeighbourpartner(String value) {
        return new JAXBElement<String>(_Neighbourpartner_QNAME, String.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "security")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSecurity(String value) {
        return new JAXBElement<String>(_Security_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "passwordto")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPasswordto(String value) {
        return new JAXBElement<String>(_Passwordto_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "monitoringdelay")
    public JAXBElement<BigInteger> createMonitoringdelay(BigInteger value) {
        return new JAXBElement<BigInteger>(_Monitoringdelay_QNAME, BigInteger.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "recordhandling")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createRecordhandling(String value) {
        return new JAXBElement<String>(_Recordhandling_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "hash_algorithm")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createHashAlgorithm(String value) {
        return new JAXBElement<String>(_HashAlgorithm_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "cms_encrypt")
    public JAXBElement<BigInteger> createCmsEncrypt(BigInteger value) {
        return new JAXBElement<BigInteger>(_CmsEncrypt_QNAME, BigInteger.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "recordlength")
    public JAXBElement<String> createRecordlength(String value) {
        return new JAXBElement<String>(_Recordlength_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "cms_publickeys")
    public JAXBElement<String> createCmsPublickeys(String value) {
        return new JAXBElement<String>(_CmsPublickeys_QNAME, String.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "authentication")
    public JAXBElement<BigInteger> createAuthentication(BigInteger value) {
        return new JAXBElement<BigInteger>(_Authentication_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "oexbuf")
    public JAXBElement<BigInteger> createOexbuf(BigInteger value) {
        return new JAXBElement<BigInteger>(_Oexbuf_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "dataformat")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDataformat(String value) {
        return new JAXBElement<String>(_Dataformat_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "encryptionalgorithm")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createEncryptionalgorithm(String value) {
        return new JAXBElement<String>(_Encryptionalgorithm_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "certvalidationtype")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCertvalidationtype(String value) {
        return new JAXBElement<String>(_Certvalidationtype_QNAME, String.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "transmissionmode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTransmissionmode(String value) {
        return new JAXBElement<String>(_Transmissionmode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "routingmode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createRoutingmode(String value) {
        return new JAXBElement<String>(_Routingmode_QNAME, String.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "vdsnchar")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createVdsnchar(String value) {
        return new JAXBElement<String>(_Vdsnchar_QNAME, String.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "cms_reqsigneerp")
    public JAXBElement<BigInteger> createCmsReqsigneerp(BigInteger value) {
        return new JAXBElement<BigInteger>(_CmsReqsigneerp_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "filenamefrom")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createFilenamefrom(String value) {
        return new JAXBElement<String>(_Filenamefrom_QNAME, String.class, null, value);
    }

}
