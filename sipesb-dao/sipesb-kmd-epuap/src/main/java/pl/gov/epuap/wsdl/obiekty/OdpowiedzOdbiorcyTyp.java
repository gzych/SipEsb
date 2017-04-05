
package pl.gov.epuap.wsdl.obiekty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OdpowiedzOdbiorcyTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OdpowiedzOdbiorcyTyp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="status" type="{http://wsdl.epuap.gov.pl/obiekty/}StatusTyp"/>
 *         &lt;element name="zalacznik" type="{http://wsdl.epuap.gov.pl/obiekty/}DokumentTyp" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OdpowiedzOdbiorcyTyp", propOrder = {
    "status",
    "zalacznik"
})
public class OdpowiedzOdbiorcyTyp {

    @XmlElement(required = true)
    protected StatusTyp status;
    protected DokumentTyp zalacznik;

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
     * Gets the value of the zalacznik property.
     * 
     * @return
     *     possible objects is
     *     {@link DokumentTyp }
     *     
     */
    public DokumentTyp getZalacznik() {
        return zalacznik;
    }

    /**
     * Sets the value of the zalacznik property.
     * 
     * @param value
     *     allowed objects is
     *     {@link DokumentTyp }
     *     
     */
    public void setZalacznik(DokumentTyp value) {
        this.zalacznik = value;
    }

}
