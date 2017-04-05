
package pl.gov.epuap.wsdl.obiekty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DaneNadawcyTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DaneNadawcyTyp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="uzytkownik" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="system" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DaneNadawcyTyp", propOrder = {
    "uzytkownik",
    "system"
})
public class DaneNadawcyTyp {

    protected String uzytkownik;
    protected String system;

    /**
     * Gets the value of the uzytkownik property.
     * 
     * @return
     *     possible objects is
     *     {@link String }
     *     
     */
    public String getUzytkownik() {
        return uzytkownik;
    }

    /**
     * Sets the value of the uzytkownik property.
     * 
     * @param value
     *     allowed objects is
     *     {@link String }
     *     
     */
    public void setUzytkownik(String value) {
        this.uzytkownik = value;
    }

    /**
     * Gets the value of the system property.
     * 
     * @return
     *     possible objects is
     *     {@link String }
     *     
     */
    public String getSystem() {
        return system;
    }

    /**
     * Sets the value of the system property.
     * 
     * @param value
     *     allowed objects is
     *     {@link String }
     *     
     */
    public void setSystem(String value) {
        this.system = value;
    }

}
