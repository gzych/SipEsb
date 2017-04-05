
package pl.gov.epuap.wsdl.obiekty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OdpowiedzPullOczekujaceTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OdpowiedzPullOczekujaceTyp">
 *   &lt;complexContent>
 *     &lt;extension base="{http://wsdl.epuap.gov.pl/obiekty/}OdpowiedzPullTyp">
 *       &lt;sequence>
 *         &lt;element name="oczekujace" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OdpowiedzPullOczekujaceTyp", propOrder = {
    "oczekujace"
})
public class OdpowiedzPullOczekujaceTyp
    extends OdpowiedzPullTyp
{

    protected int oczekujace;

    /**
     * Gets the value of the oczekujace property.
     * 
     */
    public int getOczekujace() {
        return oczekujace;
    }

    /**
     * Sets the value of the oczekujace property.
     * 
     */
    public void setOczekujace(int value) {
        this.oczekujace = value;
    }

}
