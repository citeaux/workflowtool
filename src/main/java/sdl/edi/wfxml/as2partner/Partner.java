//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2022.05.12 um 10:42:56 AM CEST 
//


package sdl.edi.wfxml.as2partner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{}common" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{}filesystem"/>
 *           &lt;element ref="{}sftpclient"/>
 *           &lt;element ref="{}sftpserver"/>
 *         &lt;/choice>
 *         &lt;element ref="{}schedulings" minOccurs="0"/>
 *         &lt;element ref="{}as2" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{}contacts"/>
 *           &lt;sequence>
 *             &lt;element ref="{}certificates"/>
 *             &lt;element ref="{}signature"/>
 *             &lt;element ref="{}encryption"/>
 *           &lt;/sequence>
 *         &lt;/choice>
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
    "common",
    "filesystem",
    "sftpclient",
    "sftpserver",
    "schedulings",
    "as2",
    "contacts",
    "certificates",
    "signature",
    "encryption"
})
@XmlRootElement(name = "partner")
public class Partner {

    protected Common common;
    protected Filesystem filesystem;
    protected Sftpclient sftpclient;
    protected Sftpserver sftpserver;
    protected Schedulings schedulings;
    protected As2 as2;
    protected Contacts contacts;
    protected Certificates certificates;
    protected String signature;
    protected String encryption;

    /**
     * Ruft den Wert der common-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Common }
     *     
     */
    public Common getCommon() {
        return common;
    }

    /**
     * Legt den Wert der common-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Common }
     *     
     */
    public void setCommon(Common value) {
        this.common = value;
    }

    /**
     * Ruft den Wert der filesystem-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Filesystem }
     *     
     */
    public Filesystem getFilesystem() {
        return filesystem;
    }

    /**
     * Legt den Wert der filesystem-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Filesystem }
     *     
     */
    public void setFilesystem(Filesystem value) {
        this.filesystem = value;
    }

    /**
     * Ruft den Wert der sftpclient-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Sftpclient }
     *     
     */
    public Sftpclient getSftpclient() {
        return sftpclient;
    }

    /**
     * Legt den Wert der sftpclient-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Sftpclient }
     *     
     */
    public void setSftpclient(Sftpclient value) {
        this.sftpclient = value;
    }

    /**
     * Ruft den Wert der sftpserver-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Sftpserver }
     *     
     */
    public Sftpserver getSftpserver() {
        return sftpserver;
    }

    /**
     * Legt den Wert der sftpserver-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Sftpserver }
     *     
     */
    public void setSftpserver(Sftpserver value) {
        this.sftpserver = value;
    }

    /**
     * Ruft den Wert der schedulings-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Schedulings }
     *     
     */
    public Schedulings getSchedulings() {
        return schedulings;
    }

    /**
     * Legt den Wert der schedulings-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Schedulings }
     *     
     */
    public void setSchedulings(Schedulings value) {
        this.schedulings = value;
    }

    /**
     * Ruft den Wert der as2-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link As2 }
     *     
     */
    public As2 getAs2() {
        return as2;
    }

    /**
     * Legt den Wert der as2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link As2 }
     *     
     */
    public void setAs2(As2 value) {
        this.as2 = value;
    }

    /**
     * Ruft den Wert der contacts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Contacts }
     *     
     */
    public Contacts getContacts() {
        return contacts;
    }

    /**
     * Legt den Wert der contacts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Contacts }
     *     
     */
    public void setContacts(Contacts value) {
        this.contacts = value;
    }

    /**
     * Ruft den Wert der certificates-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Certificates }
     *     
     */
    public Certificates getCertificates() {
        return certificates;
    }

    /**
     * Legt den Wert der certificates-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Certificates }
     *     
     */
    public void setCertificates(Certificates value) {
        this.certificates = value;
    }

    /**
     * Ruft den Wert der signature-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignature() {
        return signature;
    }

    /**
     * Legt den Wert der signature-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignature(String value) {
        this.signature = value;
    }

    /**
     * Ruft den Wert der encryption-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncryption() {
        return encryption;
    }

    /**
     * Legt den Wert der encryption-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncryption(String value) {
        this.encryption = value;
    }

}
