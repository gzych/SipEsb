
package pl.gov.epuap.wsdl.obiekty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DanePodmiotuTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DanePodmiotuTyp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identyfikator" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="typOsoby" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="imieSkrot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nazwiskoNazwa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pesel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zgoda" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DanePodmiotuTyp", propOrder = {
    "identyfikator",
    "typOsoby",
    "imieSkrot",
    "nazwiskoNazwa",
    "nip",
    "pesel",
    "regon",
    "zgoda"
})
public class DanePodmiotuTyp {

    @XmlElement(required = true)
    protected String identyfikator;
    @XmlElement(required = true)
    protected String typOsoby;
    protected String imieSkrot;
    protected String nazwiskoNazwa;
    protected String nip;
    protected String pesel;
    protected String regon;
    protected boolean zgoda;

    /**
     * Gets the value of the identyfikator property.
     * 
     * @return
     *     possible objects is
     *     {@link String }
     *     
     */
    public String getIdentyfikator() {
        return identyfikator;
    }

    /**
     * Sets the value of the identyfikator property.
     * 
     * @param value
     *     allowed objects is
     *     {@link String }
     *     
     */
    public void setIdentyfikator(String value) {
        this.identyfikator = value;
    }

    /**
     * Gets the value of the typOsoby property.
     * 
     * @return
     *     possible objects is
     *     {@link String }
     *     
     */
    public String getTypOsoby() {
        return typOsoby;
    }

    /**
     * Sets the value of the typOsoby property.
     * 
     * @param value
     *     allowed objects is
     *     {@link String }
     *     
     */
    public void setTypOsoby(String value) {
        this.typOsoby = value;
    }

    /**
     * Gets the value of the imieSkrot property.
     * 
     * @return
     *     possible objects is
     *     {@link String }
     *     
     */
    public String getImieSkrot() {
        return imieSkrot;
    }

    /**
     * Sets the value of the imieSkrot property.
     * 
     * @param value
     *     allowed objects is
     *     {@link String }
     *     
     */
    public void setImieSkrot(String value) {
        this.imieSkrot = value;
    }

    /**
     * Gets the value of the nazwiskoNazwa property.
     * 
     * @return
     *     possible objects is
     *     {@link String }
     *     
     */
    public String getNazwiskoNazwa() {
        return nazwiskoNazwa;
    }

    /**
     * Sets the value of the nazwiskoNazwa property.
     * 
     * @param value
     *     allowed objects is
     *     {@link String }
     *     
     */
    public void setNazwiskoNazwa(String value) {
        this.nazwiskoNazwa = value;
    }

    /**
     * Gets the value of the nip property.
     * 
     * @return
     *     possible objects is
     *     {@link String }
     *     
     */
    public String getNip() {
        return nip;
    }

    /**
     * Sets the value of the nip property.
     * 
     * @param value
     *     allowed objects is
     *     {@link String }
     *     
     */
    public void setNip(String value) {
        this.nip = value;
    }

    /**
     * Gets the value of the pesel property.
     * 
     * @return
     *     possible objects is
     *     {@link String }
     *     
     */
    public String getPesel() {
        return pesel;
    }

    /**
     * Sets the value of the pesel property.
     * 
     * @param value
     *     allowed objects is
     *     {@link String }
     *     
     */
    public void setPesel(String value) {
        this.pesel = value;
    }

    /**
     * Gets the value of the regon property.
     * 
     * @return
     *     possible objects is
     *     {@link String }
     *     
     */
    public String getRegon() {
        return regon;
    }

    /**
     * Sets the value of the regon property.
     * 
     * @param value
     *     allowed objects is
     *     {@link String }
     *     
     */
    public void setRegon(String value) {
        this.regon = value;
    }

    /**
     * Gets the value of the zgoda property.
     * 
     */
    public boolean isZgoda() {
        return zgoda;
    }

    /**
     * Sets the value of the zgoda property.
     * 
     */
    public void setZgoda(boolean value) {
        this.zgoda = value;
    }

}
