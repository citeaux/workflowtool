//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2022.04.12 um 02:23:15 PM CEST 
//


package sdl.edi.wfxml.sftpclient;

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
 * <p>Java-Klasse f�r anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}providername"/>
 *         &lt;element ref="{}protocolname"/>
 *         &lt;element ref="{}name"/>
 *         &lt;element ref="{}description"/>
 *         &lt;element ref="{}unsavedmsgshandlingmode"/>
 *         &lt;element ref="{}preserveorder"/>
 *         &lt;element ref="{}nrofprocattempts"/>
 *         &lt;element ref="{}periodbetweenprocattempts"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{}limitingtimeperiod"/>
 *           &lt;element ref="{}limitsentbytestotal"/>
 *           &lt;element ref="{}limitsentmessagescount"/>
 *         &lt;/sequence>
 *         &lt;element ref="{}excludeolderthen" minOccurs="0"/>
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
    "providername",
    "protocolname",
    "name",
    "description",
    "unsavedmsgshandlingmode",
    "preserveorder",
    "nrofprocattempts",
    "periodbetweenprocattempts",
    "limitingtimeperiod",
    "limitsentbytestotal",
    "limitsentmessagescount",
    "excludeolderthen"
})
@XmlRootElement(name = "common")
public class Common {

    @XmlElement(required = false)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    public String providername;
    @XmlElement(required = false)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    public String protocolname;
    @XmlElement(required = false)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    public String name;
    @XmlElement(required = false)
    public String description;
    @XmlElement(required = false)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    public String unsavedmsgshandlingmode;
    @XmlElement(required = false)
    public BigInteger preserveorder;
    @XmlElement(required = false)
    public BigInteger nrofprocattempts;
    @XmlElement(required = false)
    public BigInteger periodbetweenprocattempts;
    public Limitingtimeperiod limitingtimeperiod;
    public Limitsentbytestotal limitsentbytestotal;
    public Limitsentmessagescount limitsentmessagescount;
    public Excludeolderthen excludeolderthen;

    /**
     * Ruft den Wert der providername-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvidername() {
        return providername;
    }

    /**
     * Legt den Wert der providername-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvidername(String value) {
        this.providername = value;
    }

    /**
     * Ruft den Wert der protocolname-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocolname() {
        return protocolname;
    }

    /**
     * Legt den Wert der protocolname-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocolname(String value) {
        this.protocolname = value;
    }

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der description-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Ruft den Wert der unsavedmsgshandlingmode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnsavedmsgshandlingmode() {
        return unsavedmsgshandlingmode;
    }

    /**
     * Legt den Wert der unsavedmsgshandlingmode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnsavedmsgshandlingmode(String value) {
        this.unsavedmsgshandlingmode = value;
    }

    /**
     * Ruft den Wert der preserveorder-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPreserveorder() {
        return preserveorder;
    }

    /**
     * Legt den Wert der preserveorder-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPreserveorder(BigInteger value) {
        this.preserveorder = value;
    }

    /**
     * Ruft den Wert der nrofprocattempts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNrofprocattempts() {
        return nrofprocattempts;
    }

    /**
     * Legt den Wert der nrofprocattempts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNrofprocattempts(BigInteger value) {
        this.nrofprocattempts = value;
    }

    /**
     * Ruft den Wert der periodbetweenprocattempts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPeriodbetweenprocattempts() {
        return periodbetweenprocattempts;
    }

    /**
     * Legt den Wert der periodbetweenprocattempts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPeriodbetweenprocattempts(BigInteger value) {
        this.periodbetweenprocattempts = value;
    }

    /**
     * Ruft den Wert der limitingtimeperiod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Limitingtimeperiod }
     *     
     */
    public Limitingtimeperiod getLimitingtimeperiod() {
        return limitingtimeperiod;
    }

    /**
     * Legt den Wert der limitingtimeperiod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Limitingtimeperiod }
     *     
     */
    public void setLimitingtimeperiod(Limitingtimeperiod value) {
        this.limitingtimeperiod = value;
    }

    /**
     * Ruft den Wert der limitsentbytestotal-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Limitsentbytestotal }
     *     
     */
    public Limitsentbytestotal getLimitsentbytestotal() {
        return limitsentbytestotal;
    }

    /**
     * Legt den Wert der limitsentbytestotal-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Limitsentbytestotal }
     *     
     */
    public void setLimitsentbytestotal(Limitsentbytestotal value) {
        this.limitsentbytestotal = value;
    }

    /**
     * Ruft den Wert der limitsentmessagescount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Limitsentmessagescount }
     *     
     */
    public Limitsentmessagescount getLimitsentmessagescount() {
        return limitsentmessagescount;
    }

    /**
     * Legt den Wert der limitsentmessagescount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Limitsentmessagescount }
     *     
     */
    public void setLimitsentmessagescount(Limitsentmessagescount value) {
        this.limitsentmessagescount = value;
    }

    /**
     * Ruft den Wert der excludeolderthen-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Excludeolderthen }
     *     
     */
    public Excludeolderthen getExcludeolderthen() {
        return excludeolderthen;
    }

    /**
     * Legt den Wert der excludeolderthen-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Excludeolderthen }
     *     
     */
    public void setExcludeolderthen(Excludeolderthen value) {
        this.excludeolderthen = value;
    }

}
