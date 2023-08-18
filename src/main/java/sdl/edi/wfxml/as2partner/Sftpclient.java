//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2022.05.12 um 10:42:56 AM CEST 
//


package sdl.edi.wfxml.as2partner;

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
 *         &lt;element ref="{}host"/>
 *         &lt;element ref="{}port"/>
 *         &lt;element ref="{}authmode"/>
 *         &lt;element ref="{}username"/>
 *         &lt;element ref="{}password"/>
 *         &lt;element ref="{}privkey"/>
 *         &lt;element ref="{}inputpath"/>
 *         &lt;element ref="{}inputtmpmode"/>
 *         &lt;element ref="{}inputtmppath"/>
 *         &lt;element ref="{}inputtmpprefix"/>
 *         &lt;element ref="{}inputmaxmsgs"/>
 *         &lt;element ref="{}inputmaxsize"/>
 *         &lt;element ref="{}includefilemask"/>
 *         &lt;element ref="{}excludefilemask"/>
 *         &lt;element ref="{}sorterclass"/>
 *         &lt;element ref="{}outputpath"/>
 *         &lt;element ref="{}outputtmpmode"/>
 *         &lt;element ref="{}outputtmppath"/>
 *         &lt;element ref="{}outputtmpprefix"/>
 *         &lt;element ref="{}connectiontimeout"/>
 *         &lt;element ref="{}readtimeout"/>
 *         &lt;element ref="{}fingerprintmode"/>
 *         &lt;element ref="{}fingerprintvalue"/>
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
    "host",
    "port",
    "authmode",
    "username",
    "password",
    "privkey",
    "inputpath",
    "inputtmpmode",
    "inputtmppath",
    "inputtmpprefix",
    "inputmaxmsgs",
    "inputmaxsize",
    "includefilemask",
    "excludefilemask",
    "sorterclass",
    "outputpath",
    "outputtmpmode",
    "outputtmppath",
    "outputtmpprefix",
    "connectiontimeout",
    "readtimeout",
    "fingerprintmode",
    "fingerprintvalue"
})
@XmlRootElement(name = "sftpclient")
public class Sftpclient {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String host;
    @XmlElement(required = true)
    protected BigInteger port;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String authmode;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String username;
    @XmlElement(required = true)
    protected String password;
    @XmlElement(required = true)
    protected Privkey privkey;
    @XmlElement(required = true)
    protected String inputpath;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String inputtmpmode;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String inputtmppath;
    @XmlElement(required = true)
    protected Inputtmpprefix inputtmpprefix;
    @XmlElement(required = true)
    protected BigInteger inputmaxmsgs;
    @XmlElement(required = true)
    protected BigInteger inputmaxsize;
    @XmlElement(required = true)
    protected String includefilemask;
    @XmlElement(required = true)
    protected String excludefilemask;
    @XmlElement(required = true)
    protected String sorterclass;
    @XmlElement(required = true)
    protected String outputpath;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String outputtmpmode;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String outputtmppath;
    @XmlElement(required = true)
    protected Outputtmpprefix outputtmpprefix;
    @XmlElement(required = true)
    protected BigInteger connectiontimeout;
    @XmlElement(required = true)
    protected BigInteger readtimeout;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String fingerprintmode;
    @XmlElement(required = true)
    protected Fingerprintvalue fingerprintvalue;

    /**
     * Ruft den Wert der host-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHost() {
        return host;
    }

    /**
     * Legt den Wert der host-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHost(String value) {
        this.host = value;
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
     * Ruft den Wert der authmode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthmode() {
        return authmode;
    }

    /**
     * Legt den Wert der authmode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthmode(String value) {
        this.authmode = value;
    }

    /**
     * Ruft den Wert der username-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Legt den Wert der username-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Ruft den Wert der password-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Legt den Wert der password-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Ruft den Wert der privkey-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Privkey }
     *     
     */
    public Privkey getPrivkey() {
        return privkey;
    }

    /**
     * Legt den Wert der privkey-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Privkey }
     *     
     */
    public void setPrivkey(Privkey value) {
        this.privkey = value;
    }

    /**
     * Ruft den Wert der inputpath-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputpath() {
        return inputpath;
    }

    /**
     * Legt den Wert der inputpath-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputpath(String value) {
        this.inputpath = value;
    }

    /**
     * Ruft den Wert der inputtmpmode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputtmpmode() {
        return inputtmpmode;
    }

    /**
     * Legt den Wert der inputtmpmode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputtmpmode(String value) {
        this.inputtmpmode = value;
    }

    /**
     * Ruft den Wert der inputtmppath-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputtmppath() {
        return inputtmppath;
    }

    /**
     * Legt den Wert der inputtmppath-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputtmppath(String value) {
        this.inputtmppath = value;
    }

    /**
     * Ruft den Wert der inputtmpprefix-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Inputtmpprefix }
     *     
     */
    public Inputtmpprefix getInputtmpprefix() {
        return inputtmpprefix;
    }

    /**
     * Legt den Wert der inputtmpprefix-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Inputtmpprefix }
     *     
     */
    public void setInputtmpprefix(Inputtmpprefix value) {
        this.inputtmpprefix = value;
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
     * Ruft den Wert der includefilemask-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncludefilemask() {
        return includefilemask;
    }

    /**
     * Legt den Wert der includefilemask-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncludefilemask(String value) {
        this.includefilemask = value;
    }

    /**
     * Ruft den Wert der excludefilemask-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExcludefilemask() {
        return excludefilemask;
    }

    /**
     * Legt den Wert der excludefilemask-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExcludefilemask(String value) {
        this.excludefilemask = value;
    }

    /**
     * Ruft den Wert der sorterclass-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSorterclass() {
        return sorterclass;
    }

    /**
     * Legt den Wert der sorterclass-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSorterclass(String value) {
        this.sorterclass = value;
    }

    /**
     * Ruft den Wert der outputpath-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputpath() {
        return outputpath;
    }

    /**
     * Legt den Wert der outputpath-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputpath(String value) {
        this.outputpath = value;
    }

    /**
     * Ruft den Wert der outputtmpmode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputtmpmode() {
        return outputtmpmode;
    }

    /**
     * Legt den Wert der outputtmpmode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputtmpmode(String value) {
        this.outputtmpmode = value;
    }

    /**
     * Ruft den Wert der outputtmppath-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputtmppath() {
        return outputtmppath;
    }

    /**
     * Legt den Wert der outputtmppath-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputtmppath(String value) {
        this.outputtmppath = value;
    }

    /**
     * Ruft den Wert der outputtmpprefix-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Outputtmpprefix }
     *     
     */
    public Outputtmpprefix getOutputtmpprefix() {
        return outputtmpprefix;
    }

    /**
     * Legt den Wert der outputtmpprefix-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Outputtmpprefix }
     *     
     */
    public void setOutputtmpprefix(Outputtmpprefix value) {
        this.outputtmpprefix = value;
    }

    /**
     * Ruft den Wert der connectiontimeout-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getConnectiontimeout() {
        return connectiontimeout;
    }

    /**
     * Legt den Wert der connectiontimeout-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setConnectiontimeout(BigInteger value) {
        this.connectiontimeout = value;
    }

    /**
     * Ruft den Wert der readtimeout-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReadtimeout() {
        return readtimeout;
    }

    /**
     * Legt den Wert der readtimeout-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReadtimeout(BigInteger value) {
        this.readtimeout = value;
    }

    /**
     * Ruft den Wert der fingerprintmode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFingerprintmode() {
        return fingerprintmode;
    }

    /**
     * Legt den Wert der fingerprintmode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFingerprintmode(String value) {
        this.fingerprintmode = value;
    }

    /**
     * Ruft den Wert der fingerprintvalue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Fingerprintvalue }
     *     
     */
    public Fingerprintvalue getFingerprintvalue() {
        return fingerprintvalue;
    }

    /**
     * Legt den Wert der fingerprintvalue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Fingerprintvalue }
     *     
     */
    public void setFingerprintvalue(Fingerprintvalue value) {
        this.fingerprintvalue = value;
    }

}
