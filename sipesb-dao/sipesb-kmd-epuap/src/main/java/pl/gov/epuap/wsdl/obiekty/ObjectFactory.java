
package pl.gov.epuap.wsdl.obiekty;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import javax.xml.transform.Source;


/**
 * This objects contains factory methods for each
 * Java content interface and Java element interface 
 * generated in the pl.gov.epuap.wsdl.obiekty package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _TerminDoreczenia_QNAME = new QName("http://wsdl.epuap.gov.pl/obiekty/", "TerminDoreczenia");
    private final static QName _AdresSkrytkiAny_QNAME = new QName("http://wsdl.epuap.gov.pl/obiekty/", "AdresSkrytkiAny");
    private final static QName _OdpowiedzDoreczyciela_QNAME = new QName("http://wsdl.epuap.gov.pl/obiekty/", "OdpowiedzDoreczyciela");
    private final static QName _SkrotDokumentu_QNAME = new QName("http://wsdl.epuap.gov.pl/obiekty/", "SkrotDokumentu");
    private final static QName _CzyTestowe_QNAME = new QName("http://wsdl.epuap.gov.pl/obiekty/", "CzyTestowe");
    private final static QName _DaneNadawcyAny_QNAME = new QName("http://wsdl.epuap.gov.pl/obiekty/", "DaneNadawcyAny");
    private final static QName _Wyjatek_QNAME = new QName("http://wsdl.epuap.gov.pl/obiekty/", "Wyjatek");
    private final static QName _IdentyfikatorPodmiotu_QNAME = new QName("http://wsdl.epuap.gov.pl/obiekty/", "IdentyfikatorPodmiotu");
    private final static QName _PodmiotOdbierajacy_QNAME = new QName("http://wsdl.epuap.gov.pl/obiekty/", "PodmiotOdbierajacy");
    private final static QName _ZapytaniePullPobierz_QNAME = new QName("http://wsdl.epuap.gov.pl/obiekty/", "ZapytaniePullPobierz");
    private final static QName _StatusSkrytki_QNAME = new QName("http://wsdl.epuap.gov.pl/obiekty/", "StatusSkrytki");
    private final static QName _OdpowiedzOdbiorcy_QNAME = new QName("http://wsdl.epuap.gov.pl/obiekty/", "OdpowiedzOdbiorcy");
    private final static QName _StatusDoreczyciela_QNAME = new QName("http://wsdl.epuap.gov.pl/obiekty/", "StatusDoreczyciela");
    private final static QName _OdpowiedzSkrytki_QNAME = new QName("http://wsdl.epuap.gov.pl/obiekty/", "OdpowiedzSkrytki");
    private final static QName _Dokument_QNAME = new QName("http://wsdl.epuap.gov.pl/obiekty/", "Dokument");
    private final static QName _DataNadania_QNAME = new QName("http://wsdl.epuap.gov.pl/obiekty/", "DataNadania");
    private final static QName _OdpowiedzPullPotwierdz_QNAME = new QName("http://wsdl.epuap.gov.pl/obiekty/", "OdpowiedzPullPotwierdz");
    private final static QName _ZapytanieDajUpp_QNAME = new QName("http://wsdl.epuap.gov.pl/obiekty/", "ZapytanieDajUpp");
    private final static QName _DaneDodatkoweAny_QNAME = new QName("http://wsdl.epuap.gov.pl/obiekty/", "DaneDodatkoweAny");
    private final static QName _CzynnoscPull_QNAME = new QName("http://wsdl.epuap.gov.pl/obiekty/", "CzynnoscPull");
    private final static QName _CzyTestoweAny_QNAME = new QName("http://wsdl.epuap.gov.pl/obiekty/", "CzyTestoweAny");
    private final static QName _NazwaSkrytki_QNAME = new QName("http://wsdl.epuap.gov.pl/obiekty/", "NazwaSkrytki");
    private final static QName _ZapytanieDajUppPrzeslij_QNAME = new QName("http://wsdl.epuap.gov.pl/obiekty/", "ZapytanieDajUppPrzeslij");
    private final static QName _CzyProbne_QNAME = new QName("http://wsdl.epuap.gov.pl/obiekty/", "CzyProbne");
    private final static QName _DaneNadawcy_QNAME = new QName("http://wsdl.epuap.gov.pl/obiekty/", "DaneNadawcy");
    private final static QName _OdpowiedzPullOczekujace_QNAME = new QName("http://wsdl.epuap.gov.pl/obiekty/", "OdpowiedzPullOczekujace");
    private final static QName _IdentyfikatorDokumentu_QNAME = new QName("http://wsdl.epuap.gov.pl/obiekty/", "IdentyfikatorDokumentu");
    private final static QName _OdpowiedzPullPobierz_QNAME = new QName("http://wsdl.epuap.gov.pl/obiekty/", "OdpowiedzPullPobierz");
    private final static QName _TGSID_QNAME = new QName("http://wsdl.epuap.gov.pl/obiekty/", "TGSID");
    private final static QName _AdresOdpowiedzi_QNAME = new QName("http://wsdl.epuap.gov.pl/obiekty/", "AdresOdpowiedzi");
    private final static QName _DanePodmiotuAny_QNAME = new QName("http://wsdl.epuap.gov.pl/obiekty/", "DanePodmiotuAny");
    private final static QName _DaneDodatkowe_QNAME = new QName("http://wsdl.epuap.gov.pl/obiekty/", "DaneDodatkowe");
    private final static QName _OdpowiedzDajUpp_QNAME = new QName("http://wsdl.epuap.gov.pl/obiekty/", "OdpowiedzDajUpp");
    private final static QName _NazwaSkrytkiAny_QNAME = new QName("http://wsdl.epuap.gov.pl/obiekty/", "NazwaSkrytkiAny");
    private final static QName _AdresSkrytki_QNAME = new QName("http://wsdl.epuap.gov.pl/obiekty/", "AdresSkrytki");
    private final static QName _NazwaPlikuAny_QNAME = new QName("http://wsdl.epuap.gov.pl/obiekty/", "NazwaPlikuAny");
    private final static QName _ZapytaniePullPotwierdz_QNAME = new QName("http://wsdl.epuap.gov.pl/obiekty/", "ZapytaniePullPotwierdz");
    private final static QName _ZapytaniePullOczekujace_QNAME = new QName("http://wsdl.epuap.gov.pl/obiekty/", "ZapytaniePullOczekujace");
    private final static QName _UPD_QNAME = new QName("http://wsdl.epuap.gov.pl/obiekty/", "UPD");
    private final static QName _AdresOdpowiedziAny_QNAME = new QName("http://wsdl.epuap.gov.pl/obiekty/", "AdresOdpowiedziAny");
    private final static QName _StatusOdbiorcy_QNAME = new QName("http://wsdl.epuap.gov.pl/obiekty/", "StatusOdbiorcy");
    private final static QName _DanePodmiotu_QNAME = new QName("http://wsdl.epuap.gov.pl/obiekty/", "DanePodmiotu");
    private final static QName _IdentyfikatorSprawy_QNAME = new QName("http://wsdl.epuap.gov.pl/obiekty/", "IdentyfikatorSprawy");
    private final static QName _DataNadaniaAny_QNAME = new QName("http://wsdl.epuap.gov.pl/obiekty/", "DataNadaniaAny");
    private final static QName _DokumentAny_QNAME = new QName("http://wsdl.epuap.gov.pl/obiekty/", "DokumentAny");
    private final static QName _NazwaPliku_QNAME = new QName("http://wsdl.epuap.gov.pl/obiekty/", "NazwaPliku");
    private final static QName _IdentyfikatorUpp_QNAME = new QName("http://wsdl.epuap.gov.pl/obiekty/", "IdentyfikatorUpp");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pl.gov.epuap.wsdl.obiekty
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DokumentTyp }
     * 
     */
    public DokumentTyp createDokumentTyp() {
        return new DokumentTyp();
    }

    /**
     * Create an instance of {@link ZapytaniePullOczekujaceTyp }
     * 
     */
    public ZapytaniePullOczekujaceTyp createZapytaniePullOczekujaceTyp() {
        return new ZapytaniePullOczekujaceTyp();
    }

    /**
     * Create an instance of {@link StatusTyp }
     * 
     */
    public StatusTyp createStatusTyp() {
        return new StatusTyp();
    }

    /**
     * Create an instance of {@link DanePodmiotuTyp }
     * 
     */
    public DanePodmiotuTyp createDanePodmiotuTyp() {
        return new DanePodmiotuTyp();
    }

    /**
     * Create an instance of {@link ZapytaniePullPotwierdzTyp }
     * 
     */
    public ZapytaniePullPotwierdzTyp createZapytaniePullPotwierdzTyp() {
        return new ZapytaniePullPotwierdzTyp();
    }

    /**
     * Create an instance of {@link OdpowiedzPullPobierzTyp }
     * 
     */
    public OdpowiedzPullPobierzTyp createOdpowiedzPullPobierzTyp() {
        return new OdpowiedzPullPobierzTyp();
    }

    /**
     * Create an instance of {@link OdpowiedzDajUppTyp }
     * 
     */
    public OdpowiedzDajUppTyp createOdpowiedzDajUppTyp() {
        return new OdpowiedzDajUppTyp();
    }

    /**
     * Create an instance of {@link ZapytanieDajUppTyp }
     * 
     */
    public ZapytanieDajUppTyp createZapytanieDajUppTyp() {
        return new ZapytanieDajUppTyp();
    }

    /**
     * Create an instance of {@link OdpowiedzPullOczekujaceTyp }
     * 
     */
    public OdpowiedzPullOczekujaceTyp createOdpowiedzPullOczekujaceTyp() {
        return new OdpowiedzPullOczekujaceTyp();
    }

    /**
     * Create an instance of {@link DaneNadawcyTyp }
     * 
     */
    public DaneNadawcyTyp createDaneNadawcyTyp() {
        return new DaneNadawcyTyp();
    }

    /**
     * Create an instance of {@link ZapytanieDajUppPrzeslijTyp }
     * 
     */
    public ZapytanieDajUppPrzeslijTyp createZapytanieDajUppPrzeslijTyp() {
        return new ZapytanieDajUppPrzeslijTyp();
    }

    /**
     * Create an instance of {@link OdpowiedzPullPotwierdzTyp }
     * 
     */
    public OdpowiedzPullPotwierdzTyp createOdpowiedzPullPotwierdzTyp() {
        return new OdpowiedzPullPotwierdzTyp();
    }

    /**
     * Create an instance of {@link OdpowiedzSkrytkiTyp }
     * 
     */
    public OdpowiedzSkrytkiTyp createOdpowiedzSkrytkiTyp() {
        return new OdpowiedzSkrytkiTyp();
    }

    /**
     * Create an instance of {@link ZapytaniePullPobierzTyp }
     * 
     */
    public ZapytaniePullPobierzTyp createZapytaniePullPobierzTyp() {
        return new ZapytaniePullPobierzTyp();
    }

    /**
     * Create an instance of {@link OdpowiedzOdbiorcyTyp }
     * 
     */
    public OdpowiedzOdbiorcyTyp createOdpowiedzOdbiorcyTyp() {
        return new OdpowiedzOdbiorcyTyp();
    }

    /**
     * Create an instance of {@link OdpowiedzDoreczycielaTyp }
     * 
     */
    public OdpowiedzDoreczycielaTyp createOdpowiedzDoreczycielaTyp() {
        return new OdpowiedzDoreczycielaTyp();
    }

    /**
     * Create an instance of {@link WyjatekTyp }
     * 
     */
    public WyjatekTyp createWyjatekTyp() {
        return new WyjatekTyp();
    }

    /**
     * Create an instance of {@link ZapytaniePullTyp }
     * 
     */
    public ZapytaniePullTyp createZapytaniePullTyp() {
        return new ZapytaniePullTyp();
    }

    /**
     * Create an instance of {@link OdpowiedzPullTyp }
     * 
     */
    public OdpowiedzPullTyp createOdpowiedzPullTyp() {
        return new OdpowiedzPullTyp();
    }

    /**
     * Create an instance of {@link UzytkownikTyp }
     * 
     */
    public UzytkownikTyp createUzytkownikTyp() {
        return new UzytkownikTyp();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.epuap.gov.pl/obiekty/", name = "TerminDoreczenia")
    public JAXBElement<XMLGregorianCalendar> createTerminDoreczenia(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TerminDoreczenia_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.epuap.gov.pl/obiekty/", name = "AdresSkrytkiAny")
    public JAXBElement<String> createAdresSkrytkiAny(String value) {
        return new JAXBElement<String>(_AdresSkrytkiAny_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OdpowiedzDoreczycielaTyp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.epuap.gov.pl/obiekty/", name = "OdpowiedzDoreczyciela")
    public JAXBElement<OdpowiedzDoreczycielaTyp> createOdpowiedzDoreczyciela(OdpowiedzDoreczycielaTyp value) {
        return new JAXBElement<OdpowiedzDoreczycielaTyp>(_OdpowiedzDoreczyciela_QNAME, OdpowiedzDoreczycielaTyp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.epuap.gov.pl/obiekty/", name = "SkrotDokumentu")
    public JAXBElement<String> createSkrotDokumentu(String value) {
        return new JAXBElement<String>(_SkrotDokumentu_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.epuap.gov.pl/obiekty/", name = "CzyTestowe")
    public JAXBElement<Boolean> createCzyTestowe(Boolean value) {
        return new JAXBElement<Boolean>(_CzyTestowe_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DaneNadawcyTyp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.epuap.gov.pl/obiekty/", name = "DaneNadawcyAny")
    public JAXBElement<DaneNadawcyTyp> createDaneNadawcyAny(DaneNadawcyTyp value) {
        return new JAXBElement<DaneNadawcyTyp>(_DaneNadawcyAny_QNAME, DaneNadawcyTyp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WyjatekTyp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.epuap.gov.pl/obiekty/", name = "Wyjatek")
    public JAXBElement<WyjatekTyp> createWyjatek(WyjatekTyp value) {
        return new JAXBElement<WyjatekTyp>(_Wyjatek_QNAME, WyjatekTyp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.epuap.gov.pl/obiekty/", name = "IdentyfikatorPodmiotu")
    public JAXBElement<String> createIdentyfikatorPodmiotu(String value) {
        return new JAXBElement<String>(_IdentyfikatorPodmiotu_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.epuap.gov.pl/obiekty/", name = "PodmiotOdbierajacy")
    public JAXBElement<String> createPodmiotOdbierajacy(String value) {
        return new JAXBElement<String>(_PodmiotOdbierajacy_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZapytaniePullPobierzTyp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.epuap.gov.pl/obiekty/", name = "ZapytaniePullPobierz")
    public JAXBElement<ZapytaniePullPobierzTyp> createZapytaniePullPobierz(ZapytaniePullPobierzTyp value) {
        return new JAXBElement<ZapytaniePullPobierzTyp>(_ZapytaniePullPobierz_QNAME, ZapytaniePullPobierzTyp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusTyp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.epuap.gov.pl/obiekty/", name = "StatusSkrytki")
    public JAXBElement<StatusTyp> createStatusSkrytki(StatusTyp value) {
        return new JAXBElement<StatusTyp>(_StatusSkrytki_QNAME, StatusTyp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OdpowiedzOdbiorcyTyp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.epuap.gov.pl/obiekty/", name = "OdpowiedzOdbiorcy")
    public JAXBElement<OdpowiedzOdbiorcyTyp> createOdpowiedzOdbiorcy(OdpowiedzOdbiorcyTyp value) {
        return new JAXBElement<OdpowiedzOdbiorcyTyp>(_OdpowiedzOdbiorcy_QNAME, OdpowiedzOdbiorcyTyp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusTyp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.epuap.gov.pl/obiekty/", name = "StatusDoreczyciela")
    public JAXBElement<StatusTyp> createStatusDoreczyciela(StatusTyp value) {
        return new JAXBElement<StatusTyp>(_StatusDoreczyciela_QNAME, StatusTyp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OdpowiedzSkrytkiTyp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.epuap.gov.pl/obiekty/", name = "OdpowiedzSkrytki")
    public JAXBElement<OdpowiedzSkrytkiTyp> createOdpowiedzSkrytki(OdpowiedzSkrytkiTyp value) {
        return new JAXBElement<OdpowiedzSkrytkiTyp>(_OdpowiedzSkrytki_QNAME, OdpowiedzSkrytkiTyp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DokumentTyp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.epuap.gov.pl/obiekty/", name = "Dokument")
    public JAXBElement<DokumentTyp> createDokument(DokumentTyp value) {
        return new JAXBElement<DokumentTyp>(_Dokument_QNAME, DokumentTyp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.epuap.gov.pl/obiekty/", name = "DataNadania")
    public JAXBElement<XMLGregorianCalendar> createDataNadania(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DataNadania_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OdpowiedzPullPotwierdzTyp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.epuap.gov.pl/obiekty/", name = "OdpowiedzPullPotwierdz")
    public JAXBElement<OdpowiedzPullPotwierdzTyp> createOdpowiedzPullPotwierdz(OdpowiedzPullPotwierdzTyp value) {
        return new JAXBElement<OdpowiedzPullPotwierdzTyp>(_OdpowiedzPullPotwierdz_QNAME, OdpowiedzPullPotwierdzTyp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZapytanieDajUppTyp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.epuap.gov.pl/obiekty/", name = "ZapytanieDajUpp")
    public JAXBElement<ZapytanieDajUppTyp> createZapytanieDajUpp(ZapytanieDajUppTyp value) {
        return new JAXBElement<ZapytanieDajUppTyp>(_ZapytanieDajUpp_QNAME, ZapytanieDajUppTyp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Source }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.epuap.gov.pl/obiekty/", name = "DaneDodatkoweAny")
    @XmlMimeType("text/xml")
    public JAXBElement<Source> createDaneDodatkoweAny(Source value) {
        return new JAXBElement<Source>(_DaneDodatkoweAny_QNAME, Source.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.epuap.gov.pl/obiekty/", name = "CzynnoscPull")
    public JAXBElement<Short> createCzynnoscPull(Short value) {
        return new JAXBElement<Short>(_CzynnoscPull_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.epuap.gov.pl/obiekty/", name = "CzyTestoweAny")
    public JAXBElement<Boolean> createCzyTestoweAny(Boolean value) {
        return new JAXBElement<Boolean>(_CzyTestoweAny_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.epuap.gov.pl/obiekty/", name = "NazwaSkrytki")
    public JAXBElement<String> createNazwaSkrytki(String value) {
        return new JAXBElement<String>(_NazwaSkrytki_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZapytanieDajUppPrzeslijTyp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.epuap.gov.pl/obiekty/", name = "ZapytanieDajUppPrzeslij")
    public JAXBElement<ZapytanieDajUppPrzeslijTyp> createZapytanieDajUppPrzeslij(ZapytanieDajUppPrzeslijTyp value) {
        return new JAXBElement<ZapytanieDajUppPrzeslijTyp>(_ZapytanieDajUppPrzeslij_QNAME, ZapytanieDajUppPrzeslijTyp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.epuap.gov.pl/obiekty/", name = "CzyProbne")
    public JAXBElement<Boolean> createCzyProbne(Boolean value) {
        return new JAXBElement<Boolean>(_CzyProbne_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DaneNadawcyTyp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.epuap.gov.pl/obiekty/", name = "DaneNadawcy")
    public JAXBElement<DaneNadawcyTyp> createDaneNadawcy(DaneNadawcyTyp value) {
        return new JAXBElement<DaneNadawcyTyp>(_DaneNadawcy_QNAME, DaneNadawcyTyp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OdpowiedzPullOczekujaceTyp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.epuap.gov.pl/obiekty/", name = "OdpowiedzPullOczekujace")
    public JAXBElement<OdpowiedzPullOczekujaceTyp> createOdpowiedzPullOczekujace(OdpowiedzPullOczekujaceTyp value) {
        return new JAXBElement<OdpowiedzPullOczekujaceTyp>(_OdpowiedzPullOczekujace_QNAME, OdpowiedzPullOczekujaceTyp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.epuap.gov.pl/obiekty/", name = "IdentyfikatorDokumentu")
    public JAXBElement<String> createIdentyfikatorDokumentu(String value) {
        return new JAXBElement<String>(_IdentyfikatorDokumentu_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OdpowiedzPullPobierzTyp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.epuap.gov.pl/obiekty/", name = "OdpowiedzPullPobierz")
    public JAXBElement<OdpowiedzPullPobierzTyp> createOdpowiedzPullPobierz(OdpowiedzPullPobierzTyp value) {
        return new JAXBElement<OdpowiedzPullPobierzTyp>(_OdpowiedzPullPobierz_QNAME, OdpowiedzPullPobierzTyp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.epuap.gov.pl/obiekty/", name = "TGSID")
    public JAXBElement<String> createTGSID(String value) {
        return new JAXBElement<String>(_TGSID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.epuap.gov.pl/obiekty/", name = "AdresOdpowiedzi")
    public JAXBElement<String> createAdresOdpowiedzi(String value) {
        return new JAXBElement<String>(_AdresOdpowiedzi_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DanePodmiotuTyp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.epuap.gov.pl/obiekty/", name = "DanePodmiotuAny")
    public JAXBElement<DanePodmiotuTyp> createDanePodmiotuAny(DanePodmiotuTyp value) {
        return new JAXBElement<DanePodmiotuTyp>(_DanePodmiotuAny_QNAME, DanePodmiotuTyp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Source }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.epuap.gov.pl/obiekty/", name = "DaneDodatkowe")
    @XmlMimeType("text/xml")
    public JAXBElement<Source> createDaneDodatkowe(Source value) {
        return new JAXBElement<Source>(_DaneDodatkowe_QNAME, Source.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OdpowiedzDajUppTyp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.epuap.gov.pl/obiekty/", name = "OdpowiedzDajUpp")
    public JAXBElement<OdpowiedzDajUppTyp> createOdpowiedzDajUpp(OdpowiedzDajUppTyp value) {
        return new JAXBElement<OdpowiedzDajUppTyp>(_OdpowiedzDajUpp_QNAME, OdpowiedzDajUppTyp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.epuap.gov.pl/obiekty/", name = "NazwaSkrytkiAny")
    public JAXBElement<String> createNazwaSkrytkiAny(String value) {
        return new JAXBElement<String>(_NazwaSkrytkiAny_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.epuap.gov.pl/obiekty/", name = "AdresSkrytki")
    public JAXBElement<String> createAdresSkrytki(String value) {
        return new JAXBElement<String>(_AdresSkrytki_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.epuap.gov.pl/obiekty/", name = "NazwaPlikuAny")
    public JAXBElement<String> createNazwaPlikuAny(String value) {
        return new JAXBElement<String>(_NazwaPlikuAny_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZapytaniePullPotwierdzTyp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.epuap.gov.pl/obiekty/", name = "ZapytaniePullPotwierdz")
    public JAXBElement<ZapytaniePullPotwierdzTyp> createZapytaniePullPotwierdz(ZapytaniePullPotwierdzTyp value) {
        return new JAXBElement<ZapytaniePullPotwierdzTyp>(_ZapytaniePullPotwierdz_QNAME, ZapytaniePullPotwierdzTyp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZapytaniePullOczekujaceTyp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.epuap.gov.pl/obiekty/", name = "ZapytaniePullOczekujace")
    public JAXBElement<ZapytaniePullOczekujaceTyp> createZapytaniePullOczekujace(ZapytaniePullOczekujaceTyp value) {
        return new JAXBElement<ZapytaniePullOczekujaceTyp>(_ZapytaniePullOczekujace_QNAME, ZapytaniePullOczekujaceTyp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DokumentTyp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.epuap.gov.pl/obiekty/", name = "UPD")
    public JAXBElement<DokumentTyp> createUPD(DokumentTyp value) {
        return new JAXBElement<DokumentTyp>(_UPD_QNAME, DokumentTyp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.epuap.gov.pl/obiekty/", name = "AdresOdpowiedziAny")
    public JAXBElement<String> createAdresOdpowiedziAny(String value) {
        return new JAXBElement<String>(_AdresOdpowiedziAny_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusTyp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.epuap.gov.pl/obiekty/", name = "StatusOdbiorcy")
    public JAXBElement<StatusTyp> createStatusOdbiorcy(StatusTyp value) {
        return new JAXBElement<StatusTyp>(_StatusOdbiorcy_QNAME, StatusTyp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DanePodmiotuTyp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.epuap.gov.pl/obiekty/", name = "DanePodmiotu")
    public JAXBElement<DanePodmiotuTyp> createDanePodmiotu(DanePodmiotuTyp value) {
        return new JAXBElement<DanePodmiotuTyp>(_DanePodmiotu_QNAME, DanePodmiotuTyp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.epuap.gov.pl/obiekty/", name = "IdentyfikatorSprawy")
    public JAXBElement<String> createIdentyfikatorSprawy(String value) {
        return new JAXBElement<String>(_IdentyfikatorSprawy_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.epuap.gov.pl/obiekty/", name = "DataNadaniaAny")
    public JAXBElement<XMLGregorianCalendar> createDataNadaniaAny(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DataNadaniaAny_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.epuap.gov.pl/obiekty/", name = "DokumentAny")
    public JAXBElement<Object> createDokumentAny(Object value) {
        return new JAXBElement<Object>(_DokumentAny_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.epuap.gov.pl/obiekty/", name = "NazwaPliku")
    public JAXBElement<String> createNazwaPliku(String value) {
        return new JAXBElement<String>(_NazwaPliku_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.epuap.gov.pl/obiekty/", name = "IdentyfikatorUpp")
    public JAXBElement<String> createIdentyfikatorUpp(String value) {
        return new JAXBElement<String>(_IdentyfikatorUpp_QNAME, String.class, null, value);
    }

}
