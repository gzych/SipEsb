
package pl.gov.epuap.wsdl.obiekty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WyjatekTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WyjatekTyp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kod" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="komunikat" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WyjatekTyp", propOrder = {
    "kod",
    "komunikat"
})
public class WyjatekTyp {

    protected int kod;
    @XmlElement(required = true)
    protected String komunikat;

    /**
     * Gets the value of the kod property.
     * 
     */
    public int getKod() {
        return kod;
    }

    /**
     * Sets the value of the kod property.
     * 
     */
    public void setKod(int value) {
        this.kod = value;
    }

    /**
     * Gets the value of the komunikat property.
     * 
     * @return
     *     possible objects is
     *     {@link String }
     *     
     */
    public String getKomunikat() {
        return komunikat;
    }

    /**
     * Sets the value of the komunikat property.
     * 
     * @param value
     *     allowed objects is
     *     {@link String }
     *     
     */
    public void setKomunikat(String value) {
        this.komunikat = value;
    }

}
