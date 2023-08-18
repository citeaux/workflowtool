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
 *         &lt;element ref="{}inputpath"/>
 *         &lt;element ref="{}inputtmppathmode"/>
 *         &lt;element ref="{}inputtmpdir"/>
 *         &lt;element ref="{}outputpath"/>
 *         &lt;element ref="{}tmpmode"/>
 *         &lt;element ref="{}tmppathmode"/>
 *         &lt;element ref="{}tmpdir"/>
 *         &lt;element ref="{}tmpprefix"/>
 *         &lt;element ref="{}monitoringmode"/>
 *         &lt;element ref="{}monitoringdelay"/>
 *         &lt;element ref="{}inputmaxmsgs"/>
 *         &lt;element ref="{}inputmaxsize"/>
 *         &lt;element ref="{}includefilemask"/>
 *         &lt;element ref="{}excludefilemask"/>
 *         &lt;element ref="{}lastmodifthreshold"/>
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
    "inputpath",
    "inputtmppathmode",
    "inputtmpdir",
    "outputpath",
    "tmpmode",
    "tmppathmode",
    "tmpdir",
    "tmpprefix",
    "monitoringmode",
    "monitoringdelay",
    "inputmaxmsgs",
    "inputmaxsize",
    "includefilemask",
    "excludefilemask",
    "lastmodifthreshold"
})
@XmlRootElement(name = "sftpserver")
public class Sftpserver {

    @XmlElement(required = true)
    protected String inputpath;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String inputtmppathmode;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String inputtmpdir;
    @XmlElement(required = true)
    protected String outputpath;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String tmpmode;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String tmppathmode;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String tmpdir;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String tmpprefix;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String monitoringmode;
    @XmlElement(required = true)
    protected String monitoringdelay;
    @XmlElement(required = true)
    protected BigInteger inputmaxmsgs;
    @XmlElement(required = true)
    protected BigInteger inputmaxsize;
    @XmlElement(required = true)
    protected String includefilemask;
    @XmlElement(required = true)
    protected String excludefilemask;
    @XmlElement(required = true)
    protected Lastmodifthreshold lastmodifthreshold;

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
     * Ruft den Wert der inputtmppathmode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputtmppathmode() {
        return inputtmppathmode;
    }

    /**
     * Legt den Wert der inputtmppathmode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputtmppathmode(String value) {
        this.inputtmppathmode = value;
    }

    /**
     * Ruft den Wert der inputtmpdir-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputtmpdir() {
        return inputtmpdir;
    }

    /**
     * Legt den Wert der inputtmpdir-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputtmpdir(String value) {
        this.inputtmpdir = value;
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
     * Ruft den Wert der tmpmode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTmpmode() {
        return tmpmode;
    }

    /**
     * Legt den Wert der tmpmode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTmpmode(String value) {
        this.tmpmode = value;
    }

    /**
     * Ruft den Wert der tmppathmode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTmppathmode() {
        return tmppathmode;
    }

    /**
     * Legt den Wert der tmppathmode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTmppathmode(String value) {
        this.tmppathmode = value;
    }

    /**
     * Ruft den Wert der tmpdir-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTmpdir() {
        return tmpdir;
    }

    /**
     * Legt den Wert der tmpdir-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTmpdir(String value) {
        this.tmpdir = value;
    }

    /**
     * Ruft den Wert der tmpprefix-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTmpprefix() {
        return tmpprefix;
    }

    /**
     * Legt den Wert der tmpprefix-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTmpprefix(String value) {
        this.tmpprefix = value;
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
     * Ruft den Wert der lastmodifthreshold-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Lastmodifthreshold }
     *     
     */
    public Lastmodifthreshold getLastmodifthreshold() {
        return lastmodifthreshold;
    }

    /**
     * Legt den Wert der lastmodifthreshold-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Lastmodifthreshold }
     *     
     */
    public void setLastmodifthreshold(Lastmodifthreshold value) {
        this.lastmodifthreshold = value;
    }

}
