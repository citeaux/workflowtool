//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2022.05.12 um 10:43:24 AM CEST 
//


package sdl.edi.wfxml.oftp2partner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element ref="{}common"/>
 *         &lt;element ref="{}partneroftp2"/>
 *         &lt;element ref="{}schedulings"/>
 *         &lt;element ref="{}contacts" minOccurs="0"/>
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
    "partneroftp2",
    "schedulings",
    "contacts"
})
@XmlRootElement(name = "partner")
public class Partner {

    @XmlElement(required = true)
    protected Common common;
    @XmlElement(required = true)
    protected Partneroftp2 partneroftp2;
    @XmlElement(required = true)
    protected Schedulings schedulings;
    protected Contacts contacts;

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
     * Ruft den Wert der partneroftp2-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Partneroftp2 }
     *     
     */
    public Partneroftp2 getPartneroftp2() {
        return partneroftp2;
    }

    /**
     * Legt den Wert der partneroftp2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Partneroftp2 }
     *     
     */
    public void setPartneroftp2(Partneroftp2 value) {
        this.partneroftp2 = value;
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

}
