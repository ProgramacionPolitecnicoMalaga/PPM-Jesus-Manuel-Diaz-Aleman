import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class LectorXML {

    private Document doc;
    public LectorXML(){
        try {
            File inputFile = new File("src/main/resources/poblacion.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Poblacion> getPoblaciones(){
        ArrayList<Poblacion> poblaciones = new ArrayList<Poblacion>();
        try {
            XPath xPath = XPathFactory.newInstance().newXPath();
            String xpathExpr = "/root/row";
            NodeList nodeList = (NodeList) xPath.compile(xpathExpr).evaluate(doc, XPathConstants.NODESET);
            for (int i=0; i<nodeList.getLength(); i++){
                Element elementoProducto = (Element) nodeList.item(i);
                Poblacion poblacion = getPoblacion(elementoProducto);
                poblaciones.add(poblacion);
            }
        } catch (XPathExpressionException e) {
            e.printStackTrace();
        }
        return poblaciones;
    }

    public Poblacion getPoblacion(Element elementoPoblacion) {
        int año = Integer.parseInt(elementoPoblacion.getAttribute("Año"));
        int numeroEmpadronado = Integer.parseInt(elementoPoblacion.getAttribute("Número_de_empadronados"));
        String nacionalidad = elementoPoblacion.getAttribute("Nacionalidad");
        return new Poblacion(año, numeroEmpadronado, nacionalidad);
    }

}