
package pl.gov.epuap.wsdl.obiekty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         		Ogolny, abstrakcyjny typ odpowiedzi metod PULL
 *         		Poszczegolne odpowiedzi metod PULL dziedzicza z	tego typu.
 *         	
 * 
 * <p>Java class for OdpowiedzPullTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OdpowiedzPullTyp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="status" type="{http://wsdl.epuap.gov.pl/obiekty/}StatusTyp"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OdpowiedzPullTyp", propOrder = {
    "status"
})
@XmlSeeAlso({
    OdpowiedzPullPobierzTyp.class,
    OdpowiedzPullOczekujaceTyp.class,
    OdpowiedzPullPotwierdzTyp.class
})
public class OdpowiedzPullTyp {

    @XmlElement(required = true)
    protected StatusTyp status;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible objects is
     *     {@link StatusTyp }
     *     
     */
    public StatusTyp getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed objects is
     *     {@link StatusTyp }
     *     
     */
    public void setStatus(StatusTyp value) {
        this.status = value;
    }

}
