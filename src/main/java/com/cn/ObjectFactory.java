
package com.cn;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.cn package. 
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

    private final static QName _SetHelloResponse_QNAME = new QName("http://cn.com/", "setHelloResponse");
    private final static QName _SetHello_QNAME = new QName("http://cn.com/", "setHello");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.cn
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SetHello }
     * 
     */
    public SetHello createSetHello() {
        return new SetHello();
    }

    /**
     * Create an instance of {@link SetHelloResponse }
     * 
     */
    public SetHelloResponse createSetHelloResponse() {
        return new SetHelloResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetHelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cn.com/", name = "setHelloResponse")
    public JAXBElement<SetHelloResponse> createSetHelloResponse(SetHelloResponse value) {
        return new JAXBElement<SetHelloResponse>(_SetHelloResponse_QNAME, SetHelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetHello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cn.com/", name = "setHello")
    public JAXBElement<SetHello> createSetHello(SetHello value) {
        return new JAXBElement<SetHello>(_SetHello_QNAME, SetHello.class, null, value);
    }

}
