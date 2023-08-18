//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2022.05.12 um 10:42:06 AM CEST 
//


package sdl.edi.wfxml.mailpartner;

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
 *         &lt;element ref="{}in_pattern_from"/>
 *         &lt;element ref="{}in_pattern_to" minOccurs="0"/>
 *         &lt;element ref="{}in_pattern_cc"/>
 *         &lt;element ref="{}in_copy_from"/>
 *         &lt;element ref="{}in_copy_to"/>
 *         &lt;element ref="{}in_copy_cc"/>
 *         &lt;element ref="{}in_copy_subject"/>
 *         &lt;element ref="{}out_to_address"/>
 *         &lt;element ref="{}out_from_address"/>
 *         &lt;element ref="{}out_cc_address"/>
 *         &lt;element ref="{}out_bcc_address"/>
 *         &lt;element ref="{}out_subject"/>
 *         &lt;element ref="{}out_encoding"/>
 *         &lt;element ref="{}outgoing_mode"/>
 *         &lt;element ref="{}out_copy_from"/>
 *         &lt;element ref="{}out_copy_to"/>
 *         &lt;element ref="{}out_copy_cc"/>
 *         &lt;element ref="{}out_copy_bcc"/>
 *         &lt;element ref="{}out_copy_subject"/>
 *         &lt;element ref="{}out_source_encoding"/>
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
    "inPatternFrom",
    "inPatternTo",
    "inPatternCc",
    "inCopyFrom",
    "inCopyTo",
    "inCopyCc",
    "inCopySubject",
    "outToAddress",
    "outFromAddress",
    "outCcAddress",
    "outBccAddress",
    "outSubject",
    "outEncoding",
    "outgoingMode",
    "outCopyFrom",
    "outCopyTo",
    "outCopyCc",
    "outCopyBcc",
    "outCopySubject",
    "outSourceEncoding"
})
@XmlRootElement(name = "mail")
public class Mail {

    @XmlElement(name = "in_pattern_from", required = true)
    public String inPatternFrom;
    @XmlElement(name = "in_pattern_to")
    public String inPatternTo;
    @XmlElement(name = "in_pattern_cc", required = true)
    public InPatternCc inPatternCc;
    @XmlElement(name = "in_copy_from", required = true)
    public String inCopyFrom;
    @XmlElement(name = "in_copy_to", required = true)
    public String inCopyTo;
    @XmlElement(name = "in_copy_cc", required = true)
    public String inCopyCc;
    @XmlElement(name = "in_copy_subject", required = true)
    public String inCopySubject;
    @XmlElement(name = "out_to_address", required = true)
    public String outToAddress;
    @XmlElement(name = "out_from_address", required = true)
    public String outFromAddress;
    @XmlElement(name = "out_cc_address", required = true)
    public OutCcAddress outCcAddress;
    @XmlElement(name = "out_bcc_address", required = true)
    public OutBccAddress outBccAddress;
    @XmlElement(name = "out_subject", required = true)
    public OutSubject outSubject;
    @XmlElement(name = "out_encoding", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    public String outEncoding;
    @XmlElement(name = "outgoing_mode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    public String outgoingMode;
    @XmlElement(name = "out_copy_from", required = true)
    public OutCopyFrom outCopyFrom;
    @XmlElement(name = "out_copy_to", required = true)
    public String outCopyTo;
    @XmlElement(name = "out_copy_cc", required = true)
    public OutCopyCc outCopyCc;
    @XmlElement(name = "out_copy_bcc", required = true)
    public OutCopyBcc outCopyBcc;
    @XmlElement(name = "out_copy_subject", required = true)
    public String outCopySubject;
    @XmlElement(name = "out_source_encoding", required = true)
    public OutSourceEncoding outSourceEncoding;

    /**
     * Ruft den Wert der inPatternFrom-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInPatternFrom() {
        return inPatternFrom;
    }

    /**
     * Legt den Wert der inPatternFrom-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInPatternFrom(String value) {
        this.inPatternFrom = value;
    }

    /**
     * Ruft den Wert der inPatternTo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInPatternTo() {
        return inPatternTo;
    }

    /**
     * Legt den Wert der inPatternTo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInPatternTo(String value) {
        this.inPatternTo = value;
    }

    /**
     * Ruft den Wert der inPatternCc-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InPatternCc }
     *     
     */
    public InPatternCc getInPatternCc() {
        return inPatternCc;
    }

    /**
     * Legt den Wert der inPatternCc-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InPatternCc }
     *     
     */
    public void setInPatternCc(InPatternCc value) {
        this.inPatternCc = value;
    }

    /**
     * Ruft den Wert der inCopyFrom-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCopyFrom() {
        return inCopyFrom;
    }

    /**
     * Legt den Wert der inCopyFrom-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCopyFrom(String value) {
        this.inCopyFrom = value;
    }

    /**
     * Ruft den Wert der inCopyTo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCopyTo() {
        return inCopyTo;
    }

    /**
     * Legt den Wert der inCopyTo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCopyTo(String value) {
        this.inCopyTo = value;
    }

    /**
     * Ruft den Wert der inCopyCc-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCopyCc() {
        return inCopyCc;
    }

    /**
     * Legt den Wert der inCopyCc-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCopyCc(String value) {
        this.inCopyCc = value;
    }

    /**
     * Ruft den Wert der inCopySubject-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCopySubject() {
        return inCopySubject;
    }

    /**
     * Legt den Wert der inCopySubject-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCopySubject(String value) {
        this.inCopySubject = value;
    }

    /**
     * Ruft den Wert der outToAddress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutToAddress() {
        return outToAddress;
    }

    /**
     * Legt den Wert der outToAddress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutToAddress(String value) {
        this.outToAddress = value;
    }

    /**
     * Ruft den Wert der outFromAddress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFromAddress() {
        return outFromAddress;
    }

    /**
     * Legt den Wert der outFromAddress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFromAddress(String value) {
        this.outFromAddress = value;
    }

    /**
     * Ruft den Wert der outCcAddress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OutCcAddress }
     *     
     */
    public OutCcAddress getOutCcAddress() {
        return outCcAddress;
    }

    /**
     * Legt den Wert der outCcAddress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OutCcAddress }
     *     
     */
    public void setOutCcAddress(OutCcAddress value) {
        this.outCcAddress = value;
    }

    /**
     * Ruft den Wert der outBccAddress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OutBccAddress }
     *     
     */
    public OutBccAddress getOutBccAddress() {
        return outBccAddress;
    }

    /**
     * Legt den Wert der outBccAddress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OutBccAddress }
     *     
     */
    public void setOutBccAddress(OutBccAddress value) {
        this.outBccAddress = value;
    }

    /**
     * Ruft den Wert der outSubject-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OutSubject }
     *     
     */
    public OutSubject getOutSubject() {
        return outSubject;
    }

    /**
     * Legt den Wert der outSubject-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OutSubject }
     *     
     */
    public void setOutSubject(OutSubject value) {
        this.outSubject = value;
    }

    /**
     * Ruft den Wert der outEncoding-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEncoding() {
        return outEncoding;
    }

    /**
     * Legt den Wert der outEncoding-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEncoding(String value) {
        this.outEncoding = value;
    }

    /**
     * Ruft den Wert der outgoingMode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutgoingMode() {
        return outgoingMode;
    }

    /**
     * Legt den Wert der outgoingMode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutgoingMode(String value) {
        this.outgoingMode = value;
    }

    /**
     * Ruft den Wert der outCopyFrom-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OutCopyFrom }
     *     
     */
    public OutCopyFrom getOutCopyFrom() {
        return outCopyFrom;
    }

    /**
     * Legt den Wert der outCopyFrom-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OutCopyFrom }
     *     
     */
    public void setOutCopyFrom(OutCopyFrom value) {
        this.outCopyFrom = value;
    }

    /**
     * Ruft den Wert der outCopyTo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCopyTo() {
        return outCopyTo;
    }

    /**
     * Legt den Wert der outCopyTo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCopyTo(String value) {
        this.outCopyTo = value;
    }

    /**
     * Ruft den Wert der outCopyCc-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OutCopyCc }
     *     
     */
    public OutCopyCc getOutCopyCc() {
        return outCopyCc;
    }

    /**
     * Legt den Wert der outCopyCc-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OutCopyCc }
     *     
     */
    public void setOutCopyCc(OutCopyCc value) {
        this.outCopyCc = value;
    }

    /**
     * Ruft den Wert der outCopyBcc-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OutCopyBcc }
     *     
     */
    public OutCopyBcc getOutCopyBcc() {
        return outCopyBcc;
    }

    /**
     * Legt den Wert der outCopyBcc-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OutCopyBcc }
     *     
     */
    public void setOutCopyBcc(OutCopyBcc value) {
        this.outCopyBcc = value;
    }

    /**
     * Ruft den Wert der outCopySubject-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCopySubject() {
        return outCopySubject;
    }

    /**
     * Legt den Wert der outCopySubject-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCopySubject(String value) {
        this.outCopySubject = value;
    }

    /**
     * Ruft den Wert der outSourceEncoding-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OutSourceEncoding }
     *     
     */
    public OutSourceEncoding getOutSourceEncoding() {
        return outSourceEncoding;
    }

    /**
     * Legt den Wert der outSourceEncoding-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OutSourceEncoding }
     *     
     */
    public void setOutSourceEncoding(OutSourceEncoding value) {
        this.outSourceEncoding = value;
    }

}
