//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.07.04 at 12:30:56 PM KST 
//


package org.oliot.epcis.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;


/**
 * <p>Java class for ErrorDeclarationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ErrorDeclarationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="declarationTime" type="{urn:epcglobal:epcis:xsd:2}DateTimeStamp"/>
 *           &lt;element name="reason" type="{urn:epcglobal:epcis:xsd:2}ErrorReasonIDType" minOccurs="0"/>
 *           &lt;element name="correctiveEventIDs" type="{urn:epcglobal:epcis:xsd:2}CorrectiveEventIDsType" minOccurs="0"/>
 *           &lt;element name="extension" type="{urn:epcglobal:epcis:xsd:2}ErrorDeclarationExtensionType" minOccurs="0"/>
 *           &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrorDeclarationType", propOrder = {
    "declarationTimeOrReasonOrCorrectiveEventIDs"
})
public class ErrorDeclarationType {

    @XmlElementRefs({
        @XmlElementRef(name = "declarationTime", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "correctiveEventIDs", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "extension", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "reason", type = JAXBElement.class, required = false)
    })
    @XmlAnyElement(lax = true)
    protected List<Object> declarationTimeOrReasonOrCorrectiveEventIDs;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the declarationTimeOrReasonOrCorrectiveEventIDs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the declarationTimeOrReasonOrCorrectiveEventIDs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeclarationTimeOrReasonOrCorrectiveEventIDs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link Element }
     * {@link Object }
     * {@link JAXBElement }{@code <}{@link CorrectiveEventIDsType }{@code >}
     * {@link JAXBElement }{@code <}{@link ErrorDeclarationExtensionType }{@code >}
     * 
     * 
     */
    public List<Object> getDeclarationTimeOrReasonOrCorrectiveEventIDs() {
        if (declarationTimeOrReasonOrCorrectiveEventIDs == null) {
            declarationTimeOrReasonOrCorrectiveEventIDs = new ArrayList<Object>();
        }
        return this.declarationTimeOrReasonOrCorrectiveEventIDs;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
