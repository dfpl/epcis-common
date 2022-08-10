//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.07.04 at 12:30:56 PM KST 
//


package org.oliot.epcis.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EPCISCaptureErrorBehaviourType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EPCISCaptureErrorBehaviourType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="rollback"/>
 *     &lt;enumeration value="proceed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EPCISCaptureErrorBehaviourType")
@XmlEnum
public enum EPCISCaptureErrorBehaviourType {

    @XmlEnumValue("rollback")
    ROLLBACK("rollback"),
    @XmlEnumValue("proceed")
    PROCEED("proceed");
    private final String value;

    EPCISCaptureErrorBehaviourType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EPCISCaptureErrorBehaviourType fromValue(String v) {
        for (EPCISCaptureErrorBehaviourType c: EPCISCaptureErrorBehaviourType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}