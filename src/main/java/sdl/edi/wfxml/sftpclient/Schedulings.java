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
 *         &lt;element ref="{}scheduling"/>
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
    "scheduling"
})
@XmlRootElement(name = "schedulings")
public class Schedulings {

    @XmlElement(required = true)
    public Scheduling scheduling;

    /**
     * Ruft den Wert der scheduling-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Scheduling }
     *     
     */
    public Scheduling getScheduling() {
        return scheduling;
    }

    /**
     * Legt den Wert der scheduling-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Scheduling }
     *     
     */
    public void setScheduling(Scheduling value) {
        this.scheduling = value;
    }

}
