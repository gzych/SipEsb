
package pl.gov.epuap.wsdl.obiekty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OdpowiedzDoreczycielaTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OdpowiedzDoreczycielaTyp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="status" type="{http://wsdl.epuap.gov.pl/obiekty/}StatusTyp"/>
 *         &lt;element name="identyfikatorDokumentu" type="{http://wsdl.epuap.gov.pl/obiekty/}IdentyfikatorDokumentuTyp"/>
 *         &lt;element name="identyfikatorZlecenia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OdpowiedzDoreczycielaTyp", propOrder = {
    "status",
    "identyfikatorDokumentu",
    "identyfikatorZlecenia"
})
public class OdpowiedzDoreczycielaTyp {

    @XmlElement(required = true)
    protected StatusTyp status;
    @XmlElement(required = true, nillable = true)
    protected String identyfikatorDokumentu;
    @XmlElement(required = true, nillable = true)
    protected String identyfikatorZlecenia;

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

    /**
     * Gets the value of the identyfikatorDokumentu property.
     * 
     * @return
     *     possible objects is
     *     {@link String }
     *     
     */
    public String getIdentyfikatorDokumentu() {
        return identyfikatorDokumentu;
    }

    /**
     * Sets the value of the identyfikatorDokumentu property.
     * 
     * @param value
     *     allowed objects is
     *     {@link String }
     *     
     */
    public void setIdentyfikatorDokumentu(String value) {
        this.identyfikatorDokumentu = value;
    }

    /**
     * Gets the value of the identyfikatorZlecenia property.
     * 
     * @return
     *     possible objects is
     *     {@link String }
     *     
     */
    public String getIdentyfikatorZlecenia() {
        return identyfikatorZlecenia;
    }

    /**
     * Sets the value of the identyfikatorZlecenia property.
     * 
     * @param value
     *     allowed objects is
     *     {@link String }
     *     
     */
    public void setIdentyfikatorZlecenia(String value) {
        this.identyfikatorZlecenia = value;
    }

}
