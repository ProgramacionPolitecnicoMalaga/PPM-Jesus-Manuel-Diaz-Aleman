import org.w3c.dom.*;
import org.w3c.dom.xpath.XPathEvaluator;
import org.xml.sax.SAXException;


import javax.imageio.metadata.IIOMetadataNode;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;


public class Aereopuestolist {

    public static void main(String[] args) {
        String aereopuerto = "aereopuertoxml";
    }

    private static void generate(String aereopuerto, ArrayList ciudad, ArrayList value) throws ParserConfigurationException, TransformerException {
        if (!ciudad.isEmpty() && !value.isEmpty() && ciudad.size() == value.size()) {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            DOMImplementation implementation = builder.getDOMImplementation();
            Document document = implementation.createDocument((String)null, aereopuerto, (DocumentType)null);
            document.setXmlVersion("1.0");
            Element raiz = document.getDocumentElement();

            for(int i = 0; i < ciudad.size(); ++i) {
                Element aereopuertoNode = document.createElement("Aereopuerto");
                Element ciudadNode = document.createElement("Ciudad");
                Text nodeCiudadValue = document.createTextNode((String)ciudad.get(i));
                ciudadNode.appendChild(nodeCiudadValue);
                Element paisNode = document.createElement("Pais");
                Text nodeValueValue = document.createTextNode((String)value.get(i));
                paisNode.appendChild(nodeValueValue);
                aereopuertoNode.appendChild(ciudadNode);
                aereopuertoNode.appendChild(paisNode);
                raiz.appendChild(aereopuertoNode);
                TransformerFactory transformerFactory = TransformerFactory.newInstance();
                Transformer transformer = transformerFactory.newTransformer();
                new DOMSource(document);
            }

            Source source = new DOMSource(document);
            Result result = new StreamResult(new File(aereopuerto + ".xml"));
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.transform(source, result);
        } else {
            System.out.println("Error Arraylist vacia");
        }
    }
}
