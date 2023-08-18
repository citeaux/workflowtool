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
 *         &lt;element ref="{}common"/>
 *         &lt;choice>
 *           &lt;element ref="{}as2"/>
 *           &lt;element ref="{}filesystem"/>
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
    "as2",
    "filesystem"
})
@XmlRootElement(name = "provider")
public class Provider {

    @XmlElement(required = true)
    protected Common common;
    protected As2 as2;
    protected Filesystem filesystem;

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

}
