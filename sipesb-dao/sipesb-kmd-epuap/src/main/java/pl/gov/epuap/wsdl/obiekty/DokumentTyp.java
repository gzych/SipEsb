
package pl.gov.epuap.wsdl.obiekty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DokumentTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DokumentTyp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nazwaPliku" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="typPliku" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zawartosc" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DokumentTyp", propOrder = {
    "nazwaPliku",
    "typPliku",
    "zawartosc"
})
public class DokumentTyp {

    @XmlElement(required = true)
    protected String nazwaPliku;
    protected String typPliku;
    @XmlElement(required = true)
    protected byte[] zawartosc;

    /**
     * Gets the value of the nazwaPliku property.
     * 
     * @return
     *     possible objects is
     *     {@link String }
     *     
     */
    public String getNazwaPliku() {
        return nazwaPliku;
    }

    /**
     * Sets the value of the nazwaPliku property.
     * 
     * @param value
     *     allowed objects is
     *     {@link String }
     *     
     */
    public void setNazwaPliku(String value) {
        this.nazwaPliku = value;
    }

    /**
     * Gets the value of the typPliku property.
     * 
     * @return
     *     possible objects is
     *     {@link String }
     *     
     */
    public String getTypPliku() {
        return typPliku;
    }

    /**
     * Sets the value of the typPliku property.
     * 
     * @param value
     *     allowed objects is
     *     {@link String }
     *     
     */
    public void setTypPliku(String value) {
        this.typPliku = value;
    }

    /**
     * Gets the value of the zawartosc property.
     * 
     * @return
     *     possible objects is
     *     byte[]
     */
    public byte[] getZawartosc() {
        return zawartosc;
    }

    /**
     * Sets the value of the zawartosc property.
     * 
     * @param value
     *     allowed objects is
     *     byte[]
     */
    public void setZawartosc(byte[] value) {
        this.zawartosc = value;
    }

}
