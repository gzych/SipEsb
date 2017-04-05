
package pl.gov.epuap.wsdl.obiekty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OdpowiedzPullPobierzTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OdpowiedzPullPobierzTyp">
 *   &lt;complexContent>
 *     &lt;extension base="{http://wsdl.epuap.gov.pl/obiekty/}OdpowiedzPullTyp">
 *       &lt;sequence>
 *         &lt;element name="danePodmiotu" type="{http://wsdl.epuap.gov.pl/obiekty/}DanePodmiotuTyp"/>
 *         &lt;element name="daneNadawcy" type="{http://wsdl.epuap.gov.pl/obiekty/}DaneNadawcyTyp"/>
 *         &lt;element name="dataNadania" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="nazwaSkrytki" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="adresSkrytki" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="adresOdpowiedzi" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="czyTestowe" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="daneDodatkowe" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="dokument" type="{http://wsdl.epuap.gov.pl/obiekty/}DokumentTyp"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OdpowiedzPullPobierzTyp", propOrder = {
    "danePodmiotu",
    "daneNadawcy",
    "dataNadania",
    "nazwaSkrytki",
    "adresSkrytki",
    "adresOdpowiedzi",
    "czyTestowe",
    "daneDodatkowe",
    "dokument"
})
public class OdpowiedzPullPobierzTyp
    extends OdpowiedzPullTyp
{

    @XmlElement(required = true)
    protected DanePodmiotuTyp danePodmiotu;
    @XmlElement(required = true)
    protected DaneNadawcyTyp daneNadawcy;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataNadania;
    @XmlElement(required = true)
    protected String nazwaSkrytki;
    @XmlElement(required = true)
    protected String adresSkrytki;
    @XmlElement(required = true, nillable = true)
    protected String adresOdpowiedzi;
    protected boolean czyTestowe;
    @XmlElement(required = true)
    protected byte[] daneDodatkowe;
    @XmlElement(required = true)
    protected DokumentTyp dokument;

    /**
     * Gets the value of the danePodmiotu property.
     * 
     * @return
     *     possible objects is
     *     {@link DanePodmiotuTyp }
     *     
     */
    public DanePodmiotuTyp getDanePodmiotu() {
        return danePodmiotu;
    }

    /**
     * Sets the value of the danePodmiotu property.
     * 
     * @param value
     *     allowed objects is
     *     {@link DanePodmiotuTyp }
     *     
     */
    public void setDanePodmiotu(DanePodmiotuTyp value) {
        this.danePodmiotu = value;
    }

    /**
     * Gets the value of the daneNadawcy property.
     * 
     * @return
     *     possible objects is
     *     {@link DaneNadawcyTyp }
     *     
     */
    public DaneNadawcyTyp getDaneNadawcy() {
        return daneNadawcy;
    }

    /**
     * Sets the value of the daneNadawcy property.
     * 
     * @param value
     *     allowed objects is
     *     {@link DaneNadawcyTyp }
     *     
     */
    public void setDaneNadawcy(DaneNadawcyTyp value) {
        this.daneNadawcy = value;
    }

    /**
     * Gets the value of the dataNadania property.
     * 
     * @return
     *     possible objects is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataNadania() {
        return dataNadania;
    }

    /**
     * Sets the value of the dataNadania property.
     * 
     * @param value
     *     allowed objects is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataNadania(XMLGregorianCalendar value) {
        this.dataNadania = value;
    }

    /**
     * Gets the value of the nazwaSkrytki property.
     * 
     * @return
     *     possible objects is
     *     {@link String }
     *     
     */
    public String getNazwaSkrytki() {
        return nazwaSkrytki;
    }

    /**
     * Sets the value of the nazwaSkrytki property.
     * 
     * @param value
     *     allowed objects is
     *     {@link String }
     *     
     */
    public void setNazwaSkrytki(String value) {
        this.nazwaSkrytki = value;
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
     * Gets the value of the czyTestowe property.
     * 
     */
    public boolean isCzyTestowe() {
        return czyTestowe;
    }

    /**
     * Sets the value of the czyTestowe property.
     * 
     */
    public void setCzyTestowe(boolean value) {
        this.czyTestowe = value;
    }

    /**
     * Gets the value of the daneDodatkowe property.
     * 
     * @return
     *     possible objects is
     *     byte[]
     */
    public byte[] getDaneDodatkowe() {
        return daneDodatkowe;
    }

    /**
     * Sets the value of the daneDodatkowe property.
     * 
     * @param value
     *     allowed objects is
     *     byte[]
     */
    public void setDaneDodatkowe(byte[] value) {
        this.daneDodatkowe = value;
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
