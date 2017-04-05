
package pl.gov.epuap.wsdl.obiekty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZapytanieDajUppPrzeslijTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZapytanieDajUppPrzeslijTyp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="podmiot" type="{http://wsdl.epuap.gov.pl/obiekty/}IdentyfikatorPodmiotuTyp"/>
 *         &lt;element name="adresSkrytki" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="adresOdpowiedzi" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dokument" type="{http://wsdl.epuap.gov.pl/obiekty/}DokumentTyp"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZapytanieDajUppPrzeslijTyp", propOrder = {
    "podmiot",
    "adresSkrytki",
    "adresOdpowiedzi",
    "dokument"
})
public class ZapytanieDajUppPrzeslijTyp {

    @XmlElement(required = true)
    protected String podmiot;
    @XmlElement(required = true)
    protected String adresSkrytki;
    @XmlElement(required = true)
    protected String adresOdpowiedzi;
    @XmlElement(required = true)
    protected DokumentTyp dokument;

    /**
     * Gets the value of the podmiot property.
     * 
     * @return
     *     possible objects is
     *     {@link String }
     *     
     */
    public String getPodmiot() {
        return podmiot;
    }

    /**
     * Sets the value of the podmiot property.
     * 
     * @param value
     *     allowed objects is
     *     {@link String }
     *     
     */
    public void setPodmiot(String value) {
        this.podmiot = value;
    }

    /**
     * Gets the value of the adresSkrytki property.
     * 
     * @return
     *     possible objects is
     *     {@link String }
     *     
     */
    public String getAdresSkrytki() {
        return adresSkrytki;
    }

    /**
     * Sets the value of the adresSkrytki property.
     * 
     * @param value
     *     allowed objects is
     *     {@link String }
     *     
     */
    public void setAdresSkrytki(String value) {
        this.adresSkrytki = value;
    }

    /**
     * Gets the value of the adresOdpowiedzi property.
     * 
     * @return
     *     possible objects is
     *     {@link String }
     *     
     */
    public String getAdresOdpowiedzi() {
        return adresOdpowiedzi;
    }

    /**
     * Sets the value of the adresOdpowiedzi property.
     * 
     * @param value
     *     allowed objects is
     *     {@link String }
     *     
     */
    public void setAdresOdpowiedzi(String value) {
        this.adresOdpowiedzi = value;
    }

    /**
     * Gets the value of the dokument property.
     * 
     * @return
     *     possible objects is
     *     {@link DokumentTyp }
     *     
     */
    public DokumentTyp getDokument() {
        return dokument;
    }

    /**
     * Sets the value of the dokument property.
     * 
     * @param value
     *     allowed objects is
     *     {@link DokumentTyp }
     *     
     */
    public void setDokument(DokumentTyp value) {
        this.dokument = value;
    }

}
