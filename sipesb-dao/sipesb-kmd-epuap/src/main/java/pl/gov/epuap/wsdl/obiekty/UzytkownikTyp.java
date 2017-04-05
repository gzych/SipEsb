
package pl.gov.epuap.wsdl.obiekty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UzytkownikTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UzytkownikTyp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identyfikator" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="typIdentyfikatora" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nazwa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UzytkownikTyp", propOrder = {
    "identyfikator",
    "typIdentyfikatora",
    "nazwa"
})
public class UzytkownikTyp {

    @XmlElement(required = true)
    protected String identyfikator;
    @XmlElement(required = true)
    protected String typIdentyfikatora;
    @XmlElement(required = true)
    protected String nazwa;

    /**
     * Gets the value of the identyfikator property.
     * 
     * @return
     *     possible objects is
     *     {@link String }
     *     
     */
    public String getIdentyfikator() {
        return identyfikator;
    }

    /**
     * Sets the value of the identyfikator property.
     * 
     * @param value
     *     allowed objects is
     *     {@link String }
     *     
     */
    public void setIdentyfikator(String value) {
        this.identyfikator = value;
    }

    /**
     * Gets the value of the typIdentyfikatora property.
     * 
     * @return
     *     possible objects is
     *     {@link String }
     *     
     */
    public String getTypIdentyfikatora() {
        return typIdentyfikatora;
    }

    /**
     * Sets the value of the typIdentyfikatora property.
     * 
     * @param value
     *     allowed objects is
     *     {@link String }
     *     
     */
    public void setTypIdentyfikatora(String value) {
        this.typIdentyfikatora = value;
    }

    /**
     * Gets the value of the nazwa property.
     * 
     * @return
     *     possible objects is
     *     {@link String }
     *     
     */
    public String getNazwa() {
        return nazwa;
    }

    /**
     * Sets the value of the nazwa property.
     * 
     * @param value
     *     allowed objects is
     *     {@link String }
     *     
     */
    public void setNazwa(String value) {
        this.nazwa = value;
    }

}
