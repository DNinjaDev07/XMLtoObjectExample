/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmltoobjectexample;

import java.io.StringReader;
import java.io.StringWriter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import org.xml.sax.InputSource;

/**
 *
 * @author dogor-Igbosuah
 */
public class ParamClass {

    public String ObjectToXML(Object object) throws JAXBException {
        try {
            JAXBContext jcontext = JAXBContext.newInstance(object.getClass());
            Marshaller m = jcontext.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            StringWriter sw = new StringWriter();

            m.marshal(object, sw);

            return sw.toString();
        } catch (JAXBException y) {
//            getServiceLogger("XMLConversion").LogError(y.getMessage(), y, Level.FATAL);
            throw (y);
        }

    }

    public Object XMLToObject(String xml, Object object) throws JAXBException {
        try {

            JAXBContext jaxbContext = JAXBContext.newInstance(XmlObjectClass.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            InputSource source = new InputSource(new StringReader(xml));
            XmlObjectClass xmlobject = (XmlObjectClass) jaxbUnmarshaller.unmarshal(source);
            return xmlobject;

        } catch (JAXBException e) {
           throw (e);
        }

    }

}
