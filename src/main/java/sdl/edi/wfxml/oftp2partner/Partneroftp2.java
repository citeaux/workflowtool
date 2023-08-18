//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2022.05.12 um 10:43:24 AM CEST 
//


package sdl.edi.wfxml.oftp2partner;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}odetteid"/>
 *         &lt;element ref="{}passwordfrom"/>
 *         &lt;element ref="{}passwordto"/>
 *         &lt;element ref="{}protocol"/>
 *         &lt;element ref="{}ipaddress"/>
 *         &lt;element ref="{}port"/>
 *         &lt;element ref="{}neighbourpartner" minOccurs="0"/>
 *         &lt;element ref="{}eerpin"/>
 *         &lt;element ref="{}eerpout"/>
 *         &lt;element ref="{}oftpversion"/>
 *         &lt;element ref="{}parallelsessions" minOccurs="0"/>
 *         &lt;element ref="{}transmissionmode"/>
 *         &lt;element ref="{}routingmode" minOccurs="0"/>
 *         &lt;element ref="{}lastmodifthreshold" minOccurs="0"/>
 *         &lt;element ref="{}inputmaxmsgs"/>
 *         &lt;element ref="{}inputmaxsize"/>
 *         &lt;element ref="{}monitoring"/>
 *         &lt;element ref="{}monitoringdelay" minOccurs="0"/>
 *         &lt;element ref="{}dataformat"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{}recordlength"/>
 *           &lt;sequence>
 *             &lt;element ref="{}recordmode"/>
 *             &lt;element ref="{}recordhandling"/>
 *             &lt;element ref="{}conversionout"/>
 *             &lt;element ref="{}conversionin"/>
 *             &lt;element ref="{}replace"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{}vftype"/>
 *           &lt;element ref="{}oexbuf"/>
 *           &lt;element ref="{}ocreval"/>
 *         &lt;/sequence>
 *         &lt;element ref="{}filenamefrom"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{}messagesmaxtime"/>
 *           &lt;sequence>
 *             &lt;element ref="{}vdsnchar"/>
 *             &lt;element ref="{}certvalidationtype"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;element ref="{}authentication"/>
 *         &lt;element ref="{}security"/>
 *         &lt;element ref="{}hash_algorithm" minOccurs="0"/>
 *         &lt;element ref="{}secfeature" minOccurs="0"/>
 *         &lt;element ref="{}cms_compress" minOccurs="0"/>
 *         &lt;element ref="{}cms_encrypt" minOccurs="0"/>
 *         &lt;element ref="{}encryptionalgorithm" minOccurs="0"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{}cms_sign"/>
 *           &lt;element ref="{}cms_reqsigneerp"/>
 *         &lt;/sequence>
 *         &lt;element ref="{}cms_publickeys" minOccurs="0"/>
 *         &lt;element ref="{}tls_publickeys" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "odetteid",
    "passwordfrom",
    "passwordto",
    "protocol",
    "ipaddress",
    "port",
    "neighbourpartner",
    "eerpin",
    "eerpout",
    "oftpversion",
    "parallelsessions",
    "transmissionmode",
    "routingmode",
    "lastmodifthreshold",
    "inputmaxmsgs",
    "inputmaxsize",
    "monitoring",
    "monitoringdelay",
    "dataformat",
    "recordlength",
    "recordmode",
    "recordhandling",
    "conversionout",
    "conversionin",
    "replace",
    "vftype",
    "oexbuf",
    "ocreval",
    "filenamefrom",
    "messagesmaxtime",
    "vdsnchar",
    "certvalidationtype",
    "authentication",
    "security",
    "hashAlgorithm",
    "secfeature",
    "cmsCompress",
    "cmsEncrypt",
    "encryptionalgorithm",
    "cmsSign",
    "cmsReqsigneerp",
    "cmsPublickeys",
    "tlsPublickeys"
})
@XmlRootElement(name = "partneroftp2")
public class Partneroftp2 {

    @XmlElement(required = true)
    protected String odetteid;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String passwordfrom;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String passwordto;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String protocol;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String ipaddress;
    @XmlElement(required = true)
    protected BigInteger port;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String neighbourpartner;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String eerpin;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String eerpout;
    @XmlElement(required = true)
    protected BigDecimal oftpversion;
    protected BigInteger parallelsessions;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String transmissionmode;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String routingmode;
    protected BigInteger lastmodifthreshold;
    @XmlElement(required = true)
    protected BigInteger inputmaxmsgs;
    @XmlElement(required = true)
    protected BigInteger inputmaxsize;
    @XmlElement(required = true)
    protected BigInteger monitoring;
    protected BigInteger monitoringdelay;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String dataformat;
    protected String recordlength;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String recordmode;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String recordhandling;
    protected Conversionout conversionout;
    protected Conversionin conversionin;
    protected BigInteger replace;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String vftype;
    protected BigInteger oexbuf;
    protected BigInteger ocreval;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String filenamefrom;
    protected BigInteger messagesmaxtime;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String vdsnchar;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String certvalidationtype;
    @XmlElement(required = true)
    protected BigInteger authentication;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String security;
    @XmlElement(name = "hash_algorithm")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String hashAlgorithm;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String secfeature;
    @XmlElement(name = "cms_compress")
    protected BigInteger cmsCompress;
    @XmlElement(name = "cms_encrypt")
    protected BigInteger cmsEncrypt;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String encryptionalgorithm;
    @XmlElement(name = "cms_sign")
    protected BigInteger cmsSign;
    @XmlElement(name = "cms_reqsigneerp")
    protected BigInteger cmsReqsigneerp;
    @XmlElement(name = "cms_publickeys")
    protected String cmsPublickeys;
    @XmlElement(name = "tls_publickeys")
    protected String tlsPublickeys;

    /**
     * Ruft den Wert der odetteid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOdetteid() {
        return odetteid;
    }

    /**
     * Legt den Wert der odetteid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOdetteid(String value) {
        this.odetteid = value;
    }

    /**
     * Ruft den Wert der passwordfrom-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPasswordfrom() {
        return passwordfrom;
    }

    /**
     * Legt den Wert der passwordfrom-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPasswordfrom(String value) {
        this.passwordfrom = value;
    }

    /**
     * Ruft den Wert der passwordto-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPasswordto() {
        return passwordto;
    }

    /**
     * Legt den Wert der passwordto-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPasswordto(String value) {
        this.passwordto = value;
    }

    /**
     * Ruft den Wert der protocol-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     * Legt den Wert der protocol-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocol(String value) {
        this.protocol = value;
    }

    /**
     * Ruft den Wert der ipaddress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpaddress() {
        return ipaddress;
    }

    /**
     * Legt den Wert der ipaddress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpaddress(String value) {
        this.ipaddress = value;
    }

    /**
     * Ruft den Wert der port-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPort() {
        return port;
    }

    /**
     * Legt den Wert der port-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPort(BigInteger value) {
        this.port = value;
    }

    /**
     * Ruft den Wert der neighbourpartner-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNeighbourpartner() {
        return neighbourpartner;
    }

    /**
     * Legt den Wert der neighbourpartner-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNeighbourpartner(String value) {
        this.neighbourpartner = value;
    }

    /**
     * Ruft den Wert der eerpin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEerpin() {
        return eerpin;
    }

    /**
     * Legt den Wert der eerpin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEerpin(String value) {
        this.eerpin = value;
    }

    /**
     * Ruft den Wert der eerpout-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEerpout() {
        return eerpout;
    }

    /**
     * Legt den Wert der eerpout-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEerpout(String value) {
        this.eerpout = value;
    }

    /**
     * Ruft den Wert der oftpversion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOftpversion() {
        return oftpversion;
    }

    /**
     * Legt den Wert der oftpversion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOftpversion(BigDecimal value) {
        this.oftpversion = value;
    }

    /**
     * Ruft den Wert der parallelsessions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getParallelsessions() {
        return parallelsessions;
    }

    /**
     * Legt den Wert der parallelsessions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setParallelsessions(BigInteger value) {
        this.parallelsessions = value;
    }

    /**
     * Ruft den Wert der transmissionmode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransmissionmode() {
        return transmissionmode;
    }

    /**
     * Legt den Wert der transmissionmode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransmissionmode(String value) {
        this.transmissionmode = value;
    }

    /**
     * Ruft den Wert der routingmode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutingmode() {
        return routingmode;
    }

    /**
     * Legt den Wert der routingmode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoutingmode(String value) {
        this.routingmode = value;
    }

    /**
     * Ruft den Wert der lastmodifthreshold-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLastmodifthreshold() {
        return lastmodifthreshold;
    }

    /**
     * Legt den Wert der lastmodifthreshold-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLastmodifthreshold(BigInteger value) {
        this.lastmodifthreshold = value;
    }

    /**
     * Ruft den Wert der inputmaxmsgs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInputmaxmsgs() {
        return inputmaxmsgs;
    }

    /**
     * Legt den Wert der inputmaxmsgs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInputmaxmsgs(BigInteger value) {
        this.inputmaxmsgs = value;
    }

    /**
     * Ruft den Wert der inputmaxsize-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInputmaxsize() {
        return inputmaxsize;
    }

    /**
     * Legt den Wert der inputmaxsize-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInputmaxsize(BigInteger value) {
        this.inputmaxsize = value;
    }

    /**
     * Ruft den Wert der monitoring-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMonitoring() {
        return monitoring;
    }

    /**
     * Legt den Wert der monitoring-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMonitoring(BigInteger value) {
        this.monitoring = value;
    }

    /**
     * Ruft den Wert der monitoringdelay-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMonitoringdelay() {
        return monitoringdelay;
    }

    /**
     * Legt den Wert der monitoringdelay-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMonitoringdelay(BigInteger value) {
        this.monitoringdelay = value;
    }

    /**
     * Ruft den Wert der dataformat-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataformat() {
        return dataformat;
    }

    /**
     * Legt den Wert der dataformat-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataformat(String value) {
        this.dataformat = value;
    }

    /**
     * Ruft den Wert der recordlength-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordlength() {
        return recordlength;
    }

    /**
     * Legt den Wert der recordlength-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordlength(String value) {
        this.recordlength = value;
    }

    /**
     * Ruft den Wert der recordmode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordmode() {
        return recordmode;
    }

    /**
     * Legt den Wert der recordmode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordmode(String value) {
        this.recordmode = value;
    }

    /**
     * Ruft den Wert der recordhandling-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordhandling() {
        return recordhandling;
    }

    /**
     * Legt den Wert der recordhandling-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordhandling(String value) {
        this.recordhandling = value;
    }

    /**
     * Ruft den Wert der conversionout-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Conversionout }
     *     
     */
    public Conversionout getConversionout() {
        return conversionout;
    }

    /**
     * Legt den Wert der conversionout-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Conversionout }
     *     
     */
    public void setConversionout(Conversionout value) {
        this.conversionout = value;
    }

    /**
     * Ruft den Wert der conversionin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Conversionin }
     *     
     */
    public Conversionin getConversionin() {
        return conversionin;
    }

    /**
     * Legt den Wert der conversionin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Conversionin }
     *     
     */
    public void setConversionin(Conversionin value) {
        this.conversionin = value;
    }

    /**
     * Ruft den Wert der replace-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReplace() {
        return replace;
    }

    /**
     * Legt den Wert der replace-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReplace(BigInteger value) {
        this.replace = value;
    }

    /**
     * Ruft den Wert der vftype-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVftype() {
        return vftype;
    }

    /**
     * Legt den Wert der vftype-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVftype(String value) {
        this.vftype = value;
    }

    /**
     * Ruft den Wert der oexbuf-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOexbuf() {
        return oexbuf;
    }

    /**
     * Legt den Wert der oexbuf-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOexbuf(BigInteger value) {
        this.oexbuf = value;
    }

    /**
     * Ruft den Wert der ocreval-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOcreval() {
        return ocreval;
    }

    /**
     * Legt den Wert der ocreval-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOcreval(BigInteger value) {
        this.ocreval = value;
    }

    /**
     * Ruft den Wert der filenamefrom-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilenamefrom() {
        return filenamefrom;
    }

    /**
     * Legt den Wert der filenamefrom-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilenamefrom(String value) {
        this.filenamefrom = value;
    }

    /**
     * Ruft den Wert der messagesmaxtime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMessagesmaxtime() {
        return messagesmaxtime;
    }

    /**
     * Legt den Wert der messagesmaxtime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMessagesmaxtime(BigInteger value) {
        this.messagesmaxtime = value;
    }

    /**
     * Ruft den Wert der vdsnchar-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVdsnchar() {
        return vdsnchar;
    }

    /**
     * Legt den Wert der vdsnchar-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVdsnchar(String value) {
        this.vdsnchar = value;
    }

    /**
     * Ruft den Wert der certvalidationtype-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertvalidationtype() {
        return certvalidationtype;
    }

    /**
     * Legt den Wert der certvalidationtype-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertvalidationtype(String value) {
        this.certvalidationtype = value;
    }

    /**
     * Ruft den Wert der authentication-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAuthentication() {
        return authentication;
    }

    /**
     * Legt den Wert der authentication-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAuthentication(BigInteger value) {
        this.authentication = value;
    }

    /**
     * Ruft den Wert der security-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurity() {
        return security;
    }

    /**
     * Legt den Wert der security-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurity(String value) {
        this.security = value;
    }

    /**
     * Ruft den Wert der hashAlgorithm-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHashAlgorithm() {
        return hashAlgorithm;
    }

    /**
     * Legt den Wert der hashAlgorithm-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHashAlgorithm(String value) {
        this.hashAlgorithm = value;
    }

    /**
     * Ruft den Wert der secfeature-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecfeature() {
        return secfeature;
    }

    /**
     * Legt den Wert der secfeature-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecfeature(String value) {
        this.secfeature = value;
    }

    /**
     * Ruft den Wert der cmsCompress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCmsCompress() {
        return cmsCompress;
    }

    /**
     * Legt den Wert der cmsCompress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCmsCompress(BigInteger value) {
        this.cmsCompress = value;
    }

    /**
     * Ruft den Wert der cmsEncrypt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCmsEncrypt() {
        return cmsEncrypt;
    }

    /**
     * Legt den Wert der cmsEncrypt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCmsEncrypt(BigInteger value) {
        this.cmsEncrypt = value;
    }

    /**
     * Ruft den Wert der encryptionalgorithm-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncryptionalgorithm() {
        return encryptionalgorithm;
    }

    /**
     * Legt den Wert der encryptionalgorithm-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncryptionalgorithm(String value) {
        this.encryptionalgorithm = value;
    }

    /**
     * Ruft den Wert der cmsSign-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCmsSign() {
        return cmsSign;
    }

    /**
     * Legt den Wert der cmsSign-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCmsSign(BigInteger value) {
        this.cmsSign = value;
    }

    /**
     * Ruft den Wert der cmsReqsigneerp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCmsReqsigneerp() {
        return cmsReqsigneerp;
    }

    /**
     * Legt den Wert der cmsReqsigneerp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCmsReqsigneerp(BigInteger value) {
        this.cmsReqsigneerp = value;
    }

    /**
     * Ruft den Wert der cmsPublickeys-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmsPublickeys() {
        return cmsPublickeys;
    }

    /**
     * Legt den Wert der cmsPublickeys-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmsPublickeys(String value) {
        this.cmsPublickeys = value;
    }

    /**
     * Ruft den Wert der tlsPublickeys-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTlsPublickeys() {
        return tlsPublickeys;
    }

    /**
     * Legt den Wert der tlsPublickeys-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTlsPublickeys(String value) {
        this.tlsPublickeys = value;
    }

}
