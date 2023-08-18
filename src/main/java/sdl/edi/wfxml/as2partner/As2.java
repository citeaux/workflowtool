//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2022.05.12 um 10:42:56 AM CEST 
//


package sdl.edi.wfxml.as2partner;

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
 *         &lt;element ref="{}url" minOccurs="0"/>
 *         &lt;element ref="{}as2id"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{}ownas2id"/>
 *           &lt;element ref="{}outgoingmdn"/>
 *         &lt;/sequence>
 *         &lt;element ref="{}mdnurl" minOccurs="0"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{}incomingmdn"/>
 *           &lt;element ref="{}signaturealgorithm"/>
 *           &lt;element ref="{}encryptionalgorithm"/>
 *           &lt;element ref="{}requiresignature"/>
 *           &lt;element ref="{}requireencryption"/>
 *           &lt;element ref="{}compressionalgorithm"/>
 *           &lt;element ref="{}contenttype"/>
 *           &lt;element ref="{}subject"/>
 *           &lt;element ref="{}httpprotocolversion"/>
 *           &lt;element ref="{}requestsignedmdn"/>
 *           &lt;element ref="{}requiresignedmdn"/>
 *           &lt;element ref="{}verifymic"/>
 *           &lt;element ref="{}requiressl"/>
 *           &lt;element ref="{}requirecertmatch"/>
 *           &lt;element ref="{}requirehttpauth"/>
 *           &lt;element ref="{}partnerhttpusername"/>
 *           &lt;element ref="{}partnerhttppassword"/>
 *           &lt;element ref="{}ownhttpusername"/>
 *           &lt;element ref="{}ownhttppassword"/>
 *           &lt;element ref="{}monitoringmode"/>
 *           &lt;element ref="{}monitoringdelay"/>
 *         &lt;/sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{}historylength"/>
 *           &lt;element ref="{}nrofmonitattempts"/>
 *         &lt;/choice>
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{}ownencryptioncertalias"/>
 *           &lt;element ref="{}ownsignaturecertalias"/>
 *         &lt;/sequence>
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
    "url",
    "as2Id",
    "ownas2Id",
    "outgoingmdn",
    "mdnurl",
    "incomingmdn",
    "signaturealgorithm",
    "encryptionalgorithm",
    "requiresignature",
    "requireencryption",
    "compressionalgorithm",
    "contenttype",
    "subject",
    "httpprotocolversion",
    "requestsignedmdn",
    "requiresignedmdn",
    "verifymic",
    "requiressl",
    "requirecertmatch",
    "requirehttpauth",
    "partnerhttpusername",
    "partnerhttppassword",
    "ownhttpusername",
    "ownhttppassword",
    "monitoringmode",
    "monitoringdelay",
    "historylength",
    "nrofmonitattempts",
    "ownencryptioncertalias",
    "ownsignaturecertalias"
})
@XmlRootElement(name = "as2")
public class As2 {

    @XmlSchemaType(name = "anyURI")
    protected String url;
    @XmlElement(name = "as2id", required = true)
    protected String as2Id;
    @XmlElement(name = "ownas2id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String ownas2Id;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String outgoingmdn;
    @XmlSchemaType(name = "anyURI")
    protected String mdnurl;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String incomingmdn;
    protected String signaturealgorithm;
    protected String encryptionalgorithm;
    protected BigInteger requiresignature;
    protected BigInteger requireencryption;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String compressionalgorithm;
    protected String contenttype;
    protected String subject;
    protected BigDecimal httpprotocolversion;
    protected BigInteger requestsignedmdn;
    protected BigInteger requiresignedmdn;
    protected BigInteger verifymic;
    protected BigInteger requiressl;
    protected BigInteger requirecertmatch;
    protected BigInteger requirehttpauth;
    protected Partnerhttpusername partnerhttpusername;
    protected Partnerhttppassword partnerhttppassword;
    protected String ownhttpusername;
    protected String ownhttppassword;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String monitoringmode;
    protected String monitoringdelay;
    protected BigInteger historylength;
    protected String nrofmonitattempts;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String ownencryptioncertalias;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String ownsignaturecertalias;

    /**
     * Ruft den Wert der url-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Legt den Wert der url-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Ruft den Wert der as2Id-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAs2Id() {
        return as2Id;
    }

    /**
     * Legt den Wert der as2Id-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAs2Id(String value) {
        this.as2Id = value;
    }

    /**
     * Ruft den Wert der ownas2Id-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnas2Id() {
        return ownas2Id;
    }

    /**
     * Legt den Wert der ownas2Id-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnas2Id(String value) {
        this.ownas2Id = value;
    }

    /**
     * Ruft den Wert der outgoingmdn-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutgoingmdn() {
        return outgoingmdn;
    }

    /**
     * Legt den Wert der outgoingmdn-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutgoingmdn(String value) {
        this.outgoingmdn = value;
    }

    /**
     * Ruft den Wert der mdnurl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMdnurl() {
        return mdnurl;
    }

    /**
     * Legt den Wert der mdnurl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMdnurl(String value) {
        this.mdnurl = value;
    }

    /**
     * Ruft den Wert der incomingmdn-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncomingmdn() {
        return incomingmdn;
    }

    /**
     * Legt den Wert der incomingmdn-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncomingmdn(String value) {
        this.incomingmdn = value;
    }

    /**
     * Ruft den Wert der signaturealgorithm-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignaturealgorithm() {
        return signaturealgorithm;
    }

    /**
     * Legt den Wert der signaturealgorithm-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignaturealgorithm(String value) {
        this.signaturealgorithm = value;
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
     * Ruft den Wert der requiresignature-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRequiresignature() {
        return requiresignature;
    }

    /**
     * Legt den Wert der requiresignature-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRequiresignature(BigInteger value) {
        this.requiresignature = value;
    }

    /**
     * Ruft den Wert der requireencryption-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRequireencryption() {
        return requireencryption;
    }

    /**
     * Legt den Wert der requireencryption-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRequireencryption(BigInteger value) {
        this.requireencryption = value;
    }

    /**
     * Ruft den Wert der compressionalgorithm-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompressionalgorithm() {
        return compressionalgorithm;
    }

    /**
     * Legt den Wert der compressionalgorithm-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompressionalgorithm(String value) {
        this.compressionalgorithm = value;
    }

    /**
     * Ruft den Wert der contenttype-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContenttype() {
        return contenttype;
    }

    /**
     * Legt den Wert der contenttype-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContenttype(String value) {
        this.contenttype = value;
    }

    /**
     * Ruft den Wert der subject-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Legt den Wert der subject-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * Ruft den Wert der httpprotocolversion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHttpprotocolversion() {
        return httpprotocolversion;
    }

    /**
     * Legt den Wert der httpprotocolversion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHttpprotocolversion(BigDecimal value) {
        this.httpprotocolversion = value;
    }

    /**
     * Ruft den Wert der requestsignedmdn-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRequestsignedmdn() {
        return requestsignedmdn;
    }

    /**
     * Legt den Wert der requestsignedmdn-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRequestsignedmdn(BigInteger value) {
        this.requestsignedmdn = value;
    }

    /**
     * Ruft den Wert der requiresignedmdn-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRequiresignedmdn() {
        return requiresignedmdn;
    }

    /**
     * Legt den Wert der requiresignedmdn-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRequiresignedmdn(BigInteger value) {
        this.requiresignedmdn = value;
    }

    /**
     * Ruft den Wert der verifymic-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVerifymic() {
        return verifymic;
    }

    /**
     * Legt den Wert der verifymic-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVerifymic(BigInteger value) {
        this.verifymic = value;
    }

    /**
     * Ruft den Wert der requiressl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRequiressl() {
        return requiressl;
    }

    /**
     * Legt den Wert der requiressl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRequiressl(BigInteger value) {
        this.requiressl = value;
    }

    /**
     * Ruft den Wert der requirecertmatch-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRequirecertmatch() {
        return requirecertmatch;
    }

    /**
     * Legt den Wert der requirecertmatch-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRequirecertmatch(BigInteger value) {
        this.requirecertmatch = value;
    }

    /**
     * Ruft den Wert der requirehttpauth-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRequirehttpauth() {
        return requirehttpauth;
    }

    /**
     * Legt den Wert der requirehttpauth-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRequirehttpauth(BigInteger value) {
        this.requirehttpauth = value;
    }

    /**
     * Ruft den Wert der partnerhttpusername-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Partnerhttpusername }
     *     
     */
    public Partnerhttpusername getPartnerhttpusername() {
        return partnerhttpusername;
    }

    /**
     * Legt den Wert der partnerhttpusername-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Partnerhttpusername }
     *     
     */
    public void setPartnerhttpusername(Partnerhttpusername value) {
        this.partnerhttpusername = value;
    }

    /**
     * Ruft den Wert der partnerhttppassword-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Partnerhttppassword }
     *     
     */
    public Partnerhttppassword getPartnerhttppassword() {
        return partnerhttppassword;
    }

    /**
     * Legt den Wert der partnerhttppassword-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Partnerhttppassword }
     *     
     */
    public void setPartnerhttppassword(Partnerhttppassword value) {
        this.partnerhttppassword = value;
    }

    /**
     * Ruft den Wert der ownhttpusername-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnhttpusername() {
        return ownhttpusername;
    }

    /**
     * Legt den Wert der ownhttpusername-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnhttpusername(String value) {
        this.ownhttpusername = value;
    }

    /**
     * Ruft den Wert der ownhttppassword-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnhttppassword() {
        return ownhttppassword;
    }

    /**
     * Legt den Wert der ownhttppassword-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnhttppassword(String value) {
        this.ownhttppassword = value;
    }

    /**
     * Ruft den Wert der monitoringmode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonitoringmode() {
        return monitoringmode;
    }

    /**
     * Legt den Wert der monitoringmode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonitoringmode(String value) {
        this.monitoringmode = value;
    }

    /**
     * Ruft den Wert der monitoringdelay-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonitoringdelay() {
        return monitoringdelay;
    }

    /**
     * Legt den Wert der monitoringdelay-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonitoringdelay(String value) {
        this.monitoringdelay = value;
    }

    /**
     * Ruft den Wert der historylength-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHistorylength() {
        return historylength;
    }

    /**
     * Legt den Wert der historylength-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHistorylength(BigInteger value) {
        this.historylength = value;
    }

    /**
     * Ruft den Wert der nrofmonitattempts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrofmonitattempts() {
        return nrofmonitattempts;
    }

    /**
     * Legt den Wert der nrofmonitattempts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrofmonitattempts(String value) {
        this.nrofmonitattempts = value;
    }

    /**
     * Ruft den Wert der ownencryptioncertalias-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnencryptioncertalias() {
        return ownencryptioncertalias;
    }

    /**
     * Legt den Wert der ownencryptioncertalias-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnencryptioncertalias(String value) {
        this.ownencryptioncertalias = value;
    }

    /**
     * Ruft den Wert der ownsignaturecertalias-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnsignaturecertalias() {
        return ownsignaturecertalias;
    }

    /**
     * Legt den Wert der ownsignaturecertalias-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnsignaturecertalias(String value) {
        this.ownsignaturecertalias = value;
    }

}
