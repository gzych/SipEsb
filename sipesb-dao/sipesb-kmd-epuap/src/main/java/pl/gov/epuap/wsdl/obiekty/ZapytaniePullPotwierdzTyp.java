
package pl.gov.epuap.wsdl.obiekty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZapytaniePullPotwierdzTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZapytaniePullPotwierdzTyp">
 *   &lt;complexContent>
 *     &lt;extension base="{http://wsdl.epuap.gov.pl/obiekty/}ZapytaniePullTyp">
 *       &lt;sequence>
 *         &lt;element name="skrot" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZapytaniePullPotwierdzTyp", propOrder = {
    "skrot"
})
public class ZapytaniePullPotwierdzTyp
    extends ZapytaniePullTyp
{

    @XmlElement(required = true)
    protected String skrot;

    /**
     * Gets the value of the skrot property.
     * 
     * @return
     *     possible objects is
     *     {@link String }
     *     
     */
    public String getSkrot() {
        return skrot;
    }

    /**
     * Sets the value of the skrot property.
     * 
     * @param value
     *     allowed objects is
     *     {@link String }
     *     
     */
    public void setSkrot(String value) {
        this.skrot = value;
    }

}
