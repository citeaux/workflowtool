//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2022.04.12 um 02:23:15 PM CEST 
//


package sdl.edi.wfxml.sftpclient;

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
 * generated in the sdl.edi.wfxml.sftpclient package. 
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
    private final static QName _Includefilemask_QNAME = new QName("", "includefilemask");
    private final static QName _Cronexpression_QNAME = new QName("", "cronexpression");
    private final static QName _Connectiontimeout_QNAME = new QName("", "connectiontimeout");
    private final static QName _Protocolname_QNAME = new QName("", "protocolname");
    private final static QName _Description_QNAME = new QName("", "description");
    private final static QName _Excludefilemask_QNAME = new QName("", "excludefilemask");
    private final static QName _Nrofprocattempts_QNAME = new QName("", "nrofprocattempts");
    private final static QName _Fingerprintmode_QNAME = new QName("", "fingerprintmode");
    private final static QName _Password_QNAME = new QName("", "password");
    private final static QName _Sorterclass_QNAME = new QName("", "sorterclass");
    private final static QName _Unsavedmsgshandlingmode_QNAME = new QName("", "unsavedmsgshandlingmode");
    private final static QName _Host_QNAME = new QName("", "host");
    private final static QName _Outputtmppath_QNAME = new QName("", "outputtmppath");
    private final static QName _Outputtmpmode_QNAME = new QName("", "outputtmpmode");
    private final static QName _Outputtmpprefix_QNAME = new QName("", "outputtmpprefix");
    private final static QName _Periodbetweenprocattempts_QNAME = new QName("", "periodbetweenprocattempts");
    private final static QName _Authmode_QNAME = new QName("", "authmode");
    private final static QName _Inputpath_QNAME = new QName("", "inputpath");
    private final static QName _Inputtmpprefix_QNAME = new QName("", "inputtmpprefix");
    private final static QName _Active_QNAME = new QName("", "active");
    private final static QName _Inputmaxsize_QNAME = new QName("", "inputmaxsize");
    private final static QName _Priority_QNAME = new QName("", "priority");
    private final static QName _Providername_QNAME = new QName("", "providername");
    private final static QName _Readtimeout_QNAME = new QName("", "readtimeout");
    private final static QName _Inputtmppath_QNAME = new QName("", "inputtmppath");
    private final static QName _Inputtmpmode_QNAME = new QName("", "inputtmpmode");
    private final static QName _Preserveorder_QNAME = new QName("", "preserveorder");
    private final static QName _Port_QNAME = new QName("", "port");
    private final static QName _Name_QNAME = new QName("", "name");
    private final static QName _Outputpath_QNAME = new QName("", "outputpath");
    private final static QName _Username_QNAME = new QName("", "username");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: sdl.edi.wfxml.sftpclient
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
     * Create an instance of {@link Sftpclient }
     * 
     */
    public Sftpclient createSftpclient() {
        return new Sftpclient();
    }

    /**
     * Create an instance of {@link Privkey }
     * 
     */
    public Privkey createPrivkey() {
        return new Privkey();
    }

    /**
     * Create an instance of {@link Fingerprintvalue }
     * 
     */
    public Fingerprintvalue createFingerprintvalue() {
        return new Fingerprintvalue();
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
     * Create an instance of {@link Scheduling }
     * 
     */
    public Scheduling createScheduling() {
        return new Scheduling();
    }

    /**
     * Create an instance of {@link Schedulings }
     * 
     */
    public Schedulings createSchedulings() {
        return new Schedulings();
    }

    /**
     * Create an instance of {@link Partner }
     * 
     */
    public Partner createPartner() {
        return new Partner();
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
    @XmlElementDecl(namespace = "", name = "connectiontimeout")
    public JAXBElement<BigInteger> createConnectiontimeout(BigInteger value) {
        return new JAXBElement<BigInteger>(_Connectiontimeout_QNAME, BigInteger.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "sorterclass")
    public JAXBElement<String> createSorterclass(String value) {
        return new JAXBElement<String>(_Sorterclass_QNAME, String.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "host")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createHost(String value) {
        return new JAXBElement<String>(_Host_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "outputtmppath")
    public JAXBElement<String> createOutputtmppath(String value) {
        return new JAXBElement<String>(_Outputtmppath_QNAME, String.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "outputtmpprefix")
    public JAXBElement<String> createOutputtmpprefix(String value) {
        return new JAXBElement<String>(_Outputtmpprefix_QNAME, String.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "authmode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createAuthmode(String value) {
        return new JAXBElement<String>(_Authmode_QNAME, String.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "inputtmpprefix")
    public JAXBElement<String> createInputtmpprefix(String value) {
        return new JAXBElement<String>(_Inputtmpprefix_QNAME, String.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "providername")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createProvidername(String value) {
        return new JAXBElement<String>(_Providername_QNAME, String.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "inputtmppath")
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
    @XmlElementDecl(namespace = "", name = "name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "username")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createUsername(String value) {
        return new JAXBElement<String>(_Username_QNAME, String.class, null, value);
    }

}
