//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.07.21 at 11:54:12 � EEST 
//


package telecom.sudparis.eu.paas.core.server.xml.manifest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for paas_environment_relationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paas_environment_relationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paas_environment_link" type="{}paas_environment_linkType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paas_environment_relationType", propOrder = {
    "paasEnvironmentLink"
})
public class PaasEnvironmentRelationType {

    @XmlElement(name = "paas_environment_link", required = true)
    protected PaasEnvironmentLinkType paasEnvironmentLink;

    /**
     * Gets the value of the paasEnvironmentLink property.
     * 
     * @return
     *     possible object is
     *     {@link PaasEnvironmentLinkType }
     *     
     */
    public PaasEnvironmentLinkType getPaasEnvironmentLink() {
        return paasEnvironmentLink;
    }

    /**
     * Sets the value of the paasEnvironmentLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaasEnvironmentLinkType }
     *     
     */
    public void setPaasEnvironmentLink(PaasEnvironmentLinkType value) {
        this.paasEnvironmentLink = value;
    }

}
