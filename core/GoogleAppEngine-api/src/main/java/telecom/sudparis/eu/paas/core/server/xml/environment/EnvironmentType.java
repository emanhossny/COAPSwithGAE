//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.07.21 at 01:57:44 � EEST 
//


package telecom.sudparis.eu.paas.core.server.xml.environment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import telecom.sudparis.eu.paas.core.server.xml.LinksListType;


/**
 * <p>Java class for environmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="environmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="configuration" type="{}configurationType"/>
 *         &lt;element name="linksList" type="{}linksListType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="envDesc" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="envId" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="envMemory" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="envName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="envOperatingSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="envProgrammingLang" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name = "environment")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "environmentType", propOrder = {
    "configuration",
    "linksList"
})
public class EnvironmentType {

    @XmlElement(required = true)
    protected ConfigurationType configuration;
    @XmlElement(required = true)
    protected LinksListType linksList;
    @XmlAttribute
    protected String envDesc;
    @XmlAttribute
    protected Integer envId;
    @XmlAttribute
    protected Integer envMemory;
    @XmlAttribute
    protected String envName;
    @XmlAttribute
    protected String envOperatingSystem;
    @XmlAttribute
    protected String envProgrammingLang;

    /**
     * Gets the value of the configuration property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigurationType }
     *     
     */
    public ConfigurationType getConfiguration() {
        return configuration;
    }

    /**
     * Sets the value of the configuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigurationType }
     *     
     */
    public void setConfiguration(ConfigurationType value) {
        this.configuration = value;
    }

    /**
     * Gets the value of the linksList property.
     * 
     * @return
     *     possible object is
     *     {@link LinksListType }
     *     
     */
    public LinksListType getLinksList() {
        return linksList;
    }

    /**
     * Sets the value of the linksList property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinksListType }
     *     
     */
    public void setLinksList(LinksListType value) {
        this.linksList = value;
    }

    /**
     * Gets the value of the envDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnvDesc() {
        return envDesc;
    }

    /**
     * Sets the value of the envDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnvDesc(String value) {
        this.envDesc = value;
    }

    /**
     * Gets the value of the envId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEnvId() {
        return envId;
    }

    /**
     * Sets the value of the envId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEnvId(Integer value) {
        this.envId = value;
    }

    /**
     * Gets the value of the envMemory property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEnvMemory() {
        return envMemory;
    }

    /**
     * Sets the value of the envMemory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEnvMemory(Integer value) {
        this.envMemory = value;
    }

    /**
     * Gets the value of the envName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnvName() {
        return envName;
    }

    /**
     * Sets the value of the envName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnvName(String value) {
        this.envName = value;
    }

    /**
     * Gets the value of the envOperatingSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnvOperatingSystem() {
        return envOperatingSystem;
    }

    /**
     * Sets the value of the envOperatingSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnvOperatingSystem(String value) {
        this.envOperatingSystem = value;
    }

    /**
     * Gets the value of the envProgrammingLang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnvProgrammingLang() {
        return envProgrammingLang;
    }

    /**
     * Sets the value of the envProgrammingLang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnvProgrammingLang(String value) {
        this.envProgrammingLang = value;
    }

}
