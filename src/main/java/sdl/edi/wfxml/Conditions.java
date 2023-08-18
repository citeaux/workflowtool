//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.08.27 um 02:13:45 PM CEST 
//


package sdl.edi.wfxml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded"&gt;
 *         &lt;element ref="{}not-exists"/&gt;
 *         &lt;element ref="{}property"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "notExistsOrProperty"
})
@XmlRootElement(name = "conditions")
public class Conditions {

    @XmlElements({
        @XmlElement(name = "not-exists", type = NotExists.class),
        @XmlElement(name = "property", type = Property.class)
    })
    protected List<Object> notExistsOrProperty;

    /**
     * Gets the value of the notExistsOrProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notExistsOrProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotExistsOrProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotExists }
     * {@link Property }
     * 
     * 
     */
    public List<Object> getNotExistsOrProperty() {
        if (notExistsOrProperty == null) {
            notExistsOrProperty = new ArrayList<Object>();
        }
        return this.notExistsOrProperty;
    }

}
