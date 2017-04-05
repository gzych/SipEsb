
package pl.gov.epuap.wsdl.obiekty.ext;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This objects contains factory methods for each
 * Java content interface and Java element interface 
 * generated in the pl.gov.epuap.wsdl.obiekty.ext package. 
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

    private final static QName _Dokument_QNAME = new QName("http://wsdl.epuap.gov.pl/obiekty/ext/", "Dokument");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pl.gov.epuap.wsdl.obiekty.ext
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.epuap.gov.pl/obiekty/ext/", name = "Dokument")
    public JAXBElement<Object> createDokument(Object value) {
        return new JAXBElement<Object>(_Dokument_QNAME, Object.class, null, value);
    }

}
