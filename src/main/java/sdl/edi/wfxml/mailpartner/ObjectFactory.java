//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2022.05.12 um 10:42:06 AM CEST 
//


package sdl.edi.wfxml.mailpartner;

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
 * generated in the sdl.edi.wfxml.mailpartner package. 
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

    private final static QName _InCopyFrom_QNAME = new QName("", "in_copy_from");
    private final static QName _InPatternFrom_QNAME = new QName("", "in_pattern_from");
    private final static QName _OutgoingMode_QNAME = new QName("", "outgoing_mode");
    private final static QName _OutToAddress_QNAME = new QName("", "out_to_address");
    private final static QName _OutCopySubject_QNAME = new QName("", "out_copy_subject");
    private final static QName _InCopyTo_QNAME = new QName("", "in_copy_to");
    private final static QName _InCopySubject_QNAME = new QName("", "in_copy_subject");
    private final static QName _Protocolname_QNAME = new QName("", "protocolname");
    private final static QName _Description_QNAME = new QName("", "description");
    private final static QName _InPatternTo_QNAME = new QName("", "in_pattern_to");
    private final static QName _Nrofprocattempts_QNAME = new QName("", "nrofprocattempts");
    private final static QName _Providername_QNAME = new QName("", "providername");
    private final static QName _Preserveorder_QNAME = new QName("", "preserveorder");
    private final static QName _OutCopyTo_QNAME = new QName("", "out_copy_to");
    private final static QName _Unsavedmsgshandlingmode_QNAME = new QName("", "unsavedmsgshandlingmode");
    private final static QName _OutFromAddress_QNAME = new QName("", "out_from_address");
    private final static QName _Name_QNAME = new QName("", "name");
    private final static QName _InCopyCc_QNAME = new QName("", "in_copy_cc");
    private final static QName _OutEncoding_QNAME = new QName("", "out_encoding");
    private final static QName _Periodbetweenprocattempts_QNAME = new QName("", "periodbetweenprocattempts");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: sdl.edi.wfxml.mailpartner
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Mail }
     * 
     */
    public Mail createMail() {
        return new Mail();
    }

    /**
     * Create an instance of {@link InPatternCc }
     * 
     */
    public InPatternCc createInPatternCc() {
        return new InPatternCc();
    }

    /**
     * Create an instance of {@link OutCcAddress }
     * 
     */
    public OutCcAddress createOutCcAddress() {
        return new OutCcAddress();
    }

    /**
     * Create an instance of {@link OutBccAddress }
     * 
     */
    public OutBccAddress createOutBccAddress() {
        return new OutBccAddress();
    }

    /**
     * Create an instance of {@link OutSubject }
     * 
     */
    public OutSubject createOutSubject() {
        return new OutSubject();
    }

    /**
     * Create an instance of {@link OutCopyFrom }
     * 
     */
    public OutCopyFrom createOutCopyFrom() {
        return new OutCopyFrom();
    }

    /**
     * Create an instance of {@link OutCopyCc }
     * 
     */
    public OutCopyCc createOutCopyCc() {
        return new OutCopyCc();
    }

    /**
     * Create an instance of {@link OutCopyBcc }
     * 
     */
    public OutCopyBcc createOutCopyBcc() {
        return new OutCopyBcc();
    }

    /**
     * Create an instance of {@link OutSourceEncoding }
     * 
     */
    public OutSourceEncoding createOutSourceEncoding() {
        return new OutSourceEncoding();
    }

    /**
     * Create an instance of {@link Limitingtimeperiod }
     * 
     */
    public Limitingtimeperiod createLimitingtimeperiod() {
        return new Limitingtimeperiod();
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
     * Create an instance of {@link Partner }
     * 
     */
    public Partner createPartner() {
        return new Partner();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "in_copy_from")
    public JAXBElement<String> createInCopyFrom(String value) {
        return new JAXBElement<String>(_InCopyFrom_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "in_pattern_from")
    public JAXBElement<String> createInPatternFrom(String value) {
        return new JAXBElement<String>(_InPatternFrom_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "outgoing_mode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createOutgoingMode(String value) {
        return new JAXBElement<String>(_OutgoingMode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "out_to_address")
    public JAXBElement<String> createOutToAddress(String value) {
        return new JAXBElement<String>(_OutToAddress_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "out_copy_subject")
    public JAXBElement<String> createOutCopySubject(String value) {
        return new JAXBElement<String>(_OutCopySubject_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "in_copy_to")
    public JAXBElement<String> createInCopyTo(String value) {
        return new JAXBElement<String>(_InCopyTo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "in_copy_subject")
    public JAXBElement<String> createInCopySubject(String value) {
        return new JAXBElement<String>(_InCopySubject_QNAME, String.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "in_pattern_to")
    public JAXBElement<String> createInPatternTo(String value) {
        return new JAXBElement<String>(_InPatternTo_QNAME, String.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "providername")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createProvidername(String value) {
        return new JAXBElement<String>(_Providername_QNAME, String.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "out_copy_to")
    public JAXBElement<String> createOutCopyTo(String value) {
        return new JAXBElement<String>(_OutCopyTo_QNAME, String.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "out_from_address")
    public JAXBElement<String> createOutFromAddress(String value) {
        return new JAXBElement<String>(_OutFromAddress_QNAME, String.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "in_copy_cc")
    public JAXBElement<String> createInCopyCc(String value) {
        return new JAXBElement<String>(_InCopyCc_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "out_encoding")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createOutEncoding(String value) {
        return new JAXBElement<String>(_OutEncoding_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "periodbetweenprocattempts")
    public JAXBElement<BigInteger> createPeriodbetweenprocattempts(BigInteger value) {
        return new JAXBElement<BigInteger>(_Periodbetweenprocattempts_QNAME, BigInteger.class, null, value);
    }

}
