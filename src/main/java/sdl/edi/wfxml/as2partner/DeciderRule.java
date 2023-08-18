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
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element ref="{}solution-name"/>
 *         &lt;element ref="{}flow-name"/>
 *         &lt;element ref="{}destination" minOccurs="0"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{}initial"/>
 *           &lt;element ref="{}abstract"/>
 *           &lt;element ref="{}partial"/>
 *         &lt;/sequence>
 *         &lt;element ref="{}routing-priority"/>
 *         &lt;element ref="{}conditions"/>
 *         &lt;element ref="{}updates"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "solutionName",
    "flowName",
    "destination",
    "initial",
    "_abstract",
    "partial",
    "routingPriority",
    "conditions",
    "updates"
})
@XmlRootElement(name = "deciderRule")
public class DeciderRule {

    @XmlElement(name = "solution-name", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String solutionName;
    @XmlElement(name = "flow-name", required = true)
    protected String flowName;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String destination;
    protected BigInteger initial;
    @XmlElement(name = "abstract")
    protected BigInteger _abstract;
    protected BigInteger partial;
    @XmlElement(name = "routing-priority", required = true)
    protected BigInteger routingPriority;
    @XmlElement(required = true)
    protected Conditions conditions;
    @XmlElement(required = true)
    protected Updates updates;
    @XmlAttribute(name = "name", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String name;

    /**
     * Ruft den Wert der solutionName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSolutionName() {
        return solutionName;
    }

    /**
     * Legt den Wert der solutionName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSolutionName(String value) {
        this.solutionName = value;
    }

    /**
     * Ruft den Wert der flowName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlowName() {
        return flowName;
    }

    /**
     * Legt den Wert der flowName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlowName(String value) {
        this.flowName = value;
    }

    /**
     * Ruft den Wert der destination-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Legt den Wert der destination-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestination(String value) {
        this.destination = value;
    }

    /**
     * Ruft den Wert der initial-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInitial() {
        return initial;
    }

    /**
     * Legt den Wert der initial-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInitial(BigInteger value) {
        this.initial = value;
    }

    /**
     * Ruft den Wert der abstract-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAbstract() {
        return _abstract;
    }

    /**
     * Legt den Wert der abstract-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAbstract(BigInteger value) {
        this._abstract = value;
    }

    /**
     * Ruft den Wert der partial-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPartial() {
        return partial;
    }

    /**
     * Legt den Wert der partial-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPartial(BigInteger value) {
        this.partial = value;
    }

    /**
     * Ruft den Wert der routingPriority-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRoutingPriority() {
        return routingPriority;
    }

    /**
     * Legt den Wert der routingPriority-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRoutingPriority(BigInteger value) {
        this.routingPriority = value;
    }

    /**
     * Ruft den Wert der conditions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Conditions }
     *     
     */
    public Conditions getConditions() {
        return conditions;
    }

    /**
     * Legt den Wert der conditions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Conditions }
     *     
     */
    public void setConditions(Conditions value) {
        this.conditions = value;
    }

    /**
     * Ruft den Wert der updates-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Updates }
     *     
     */
    public Updates getUpdates() {
        return updates;
    }

    /**
     * Legt den Wert der updates-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Updates }
     *     
     */
    public void setUpdates(Updates value) {
        this.updates = value;
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

}
