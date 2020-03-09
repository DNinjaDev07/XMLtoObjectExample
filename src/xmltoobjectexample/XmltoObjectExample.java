/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmltoobjectexample;

import java.io.StringReader;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import org.xml.sax.InputSource;

/**
 *
 * @author dogor-Igbosuah
 */
public class XmltoObjectExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            /*Sample XML. you will create your java model class with bind the xml
            In ParamClass.java you will see method to parse object to xml.
             */
            ParamClass p = new ParamClass();
            String sourcexml = "<XmlObjectClass id=\"100\">\n"
                    + "    <age>29</age>\n"
                    + "    <state>Lagos</state>\n"
                    + "    <name>SegunFatayo</name>\n"
                    + "</XmlObjectClass>";

            XmlObjectClass request = (XmlObjectClass) p.XMLToObject(sourcexml, new XmlObjectClass());

            System.out.println(request.toString());

        } catch (JAXBException e) {
            System.out.println(e.toString());
        }

    }

}
