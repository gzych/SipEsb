
package pl.gov.epuap.wsdl.obiekty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         		Ogolny, abstrakcyjny typ zapytania metod PULL
 *         		Poszczegolne zapytania metod PULL dziedzicza z tego typu.
 *         	
 * 
 * <p>Java class for ZapytaniePullTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZapytaniePullTyp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="podmiot" type="{http://wsdl.epuap.gov.pl/obiekty/}IdentyfikatorPodmiotuTyp"/>
 *         &lt;element name="nazwaSkrytki" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="adresSkrytki" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZapytaniePullTyp", propOrder = {
    "podmiot",
    "nazwaSkrytki",
    "adresSkrytki"
})
@XmlSeeAlso({
    ZapytaniePullOczekujaceTyp.class,
    ZapytaniePullPotwierdzTyp.class,
    ZapytaniePullPobierzTyp.class
})
public class ZapytaniePullTyp {

    @XmlElement(required = true)
    protected String podmiot;
    @XmlElement(required = true)
    protected String nazwaSkrytki;
    @XmlElement(required = true)
    protected String adresSkrytki;

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

}
