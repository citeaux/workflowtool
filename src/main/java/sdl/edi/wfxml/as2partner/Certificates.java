//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2022.05.12 um 10:42:56 AM CEST 
//


package sdl.edi.wfxml.as2partner;

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
 *         &lt;element ref="{}partner"/>
 *         &lt;element ref="{}ssl"/>
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
    "partner",
    "ssl"
})
@XmlRootElement(name = "certificates")
public class Certificates {

    @XmlElement(required = true)
    protected Partner partner;
    @XmlElement(required = true)
    protected String ssl;

    /**
     * Ruft den Wert der partner-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Partner }
     *     
     */
    public Partner getPartner() {
        return partner;
    }

    /**
     * Legt den Wert der partner-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Partner }
     *     
     */
    public void setPartner(Partner value) {
        this.partner = value;
    }

    /**
     * Ruft den Wert der ssl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsl() {
        return ssl;
    }

    /**
     * Legt den Wert der ssl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsl(String value) {
        this.ssl = value;
    }

}
