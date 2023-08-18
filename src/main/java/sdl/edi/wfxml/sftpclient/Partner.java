//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2022.04.12 um 02:23:15 PM CEST 
//


package sdl.edi.wfxml.sftpclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{}common"/>
 *         &lt;element ref="{}sftpclient"/>
 *         &lt;element ref="{}schedulings"/>
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
    "sftpclient",
    "schedulings"
})
@XmlRootElement(name = "partner")
public class Partner {

    @XmlElement(required = true)
    public Common common;
    @XmlElement(required = true)
    public Sftpclient sftpclient;
    @XmlElement(required = true)
    public Schedulings schedulings;

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

}
