
package pl.gov.epuap.wsdl.obiekty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZapytanieDajUppTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZapytanieDajUppTyp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="podmiot" type="{http://wsdl.epuap.gov.pl/obiekty/}IdentyfikatorPodmiotuTyp"/>
 *         &lt;element name="nadawca" type="{http://wsdl.epuap.gov.pl/obiekty/}UzytkownikTyp"/>
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
@XmlType(name = "ZapytanieDajUppTyp", propOrder = {
    "podmiot",
    "nadawca",
    "dokument"
})
public class ZapytanieDajUppTyp {

    @XmlElement(required = true)
    protected String podmiot;
    @XmlElement(required = true)
    protected UzytkownikTyp nadawca;
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
     * Gets the value of the nadawca property.
     * 
     * @return
     *     possible objects is
     *     {@link UzytkownikTyp }
     *     
     */
    public UzytkownikTyp getNadawca() {
        return nadawca;
    }

    /**
     * Sets the value of the nadawca property.
     * 
     * @param value
     *     allowed objects is
     *     {@link UzytkownikTyp }
     *     
     */
    public void setNadawca(UzytkownikTyp value) {
        this.nadawca = value;
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
