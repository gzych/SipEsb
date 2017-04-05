
package pl.gov.epuap.wsdl.obiekty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OdpowiedzSkrytkiTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OdpowiedzSkrytkiTyp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="status" type="{http://wsdl.epuap.gov.pl/obiekty/}StatusTyp"/>
 *         &lt;element name="identyfikatorDokumentu" type="{http://wsdl.epuap.gov.pl/obiekty/}IdentyfikatorDokumentuTyp"/>
 *         &lt;element name="identyfikatorUpp" type="{http://wsdl.epuap.gov.pl/obiekty/}IdentyfikatorDokumentuTyp" minOccurs="0"/>
 *         &lt;element name="statusOdbiorcy" type="{http://wsdl.epuap.gov.pl/obiekty/}StatusTyp" minOccurs="0"/>
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
@XmlType(name = "OdpowiedzSkrytkiTyp", propOrder = {
    "status",
    "identyfikatorDokumentu",
    "identyfikatorUpp",
    "statusOdbiorcy",
    "zalacznik"
})
public class OdpowiedzSkrytkiTyp {

    @XmlElement(required = true)
    protected StatusTyp status;
    @XmlElement(required = true)
    protected String identyfikatorDokumentu;
    protected String identyfikatorUpp;
    protected StatusTyp statusOdbiorcy;
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
     * Gets the value of the identyfikatorUpp property.
     * 
     * @return
     *     possible objects is
     *     {@link String }
     *     
     */
    public String getIdentyfikatorUpp() {
        return identyfikatorUpp;
    }

    /**
     * Sets the value of the identyfikatorUpp property.
     * 
     * @param value
     *     allowed objects is
     *     {@link String }
     *     
     */
    public void setIdentyfikatorUpp(String value) {
        this.identyfikatorUpp = value;
    }

    /**
     * Gets the value of the statusOdbiorcy property.
     * 
     * @return
     *     possible objects is
     *     {@link StatusTyp }
     *     
     */
    public StatusTyp getStatusOdbiorcy() {
        return statusOdbiorcy;
    }

    /**
     * Sets the value of the statusOdbiorcy property.
     * 
     * @param value
     *     allowed objects is
     *     {@link StatusTyp }
     *     
     */
    public void setStatusOdbiorcy(StatusTyp value) {
        this.statusOdbiorcy = value;
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
