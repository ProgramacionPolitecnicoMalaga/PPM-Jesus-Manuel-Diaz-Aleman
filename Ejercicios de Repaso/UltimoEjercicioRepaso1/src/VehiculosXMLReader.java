import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class VehiculosXMLReader{
    private Document doc;
    public VehiculosXMLReader(){
        try {
            File inputFile = new File("Vehiculo.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            var dBuilder = dbFactory.newDocumentBuilder();
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

    private NodeList xpath() throws XPathExpressionException {
        XPath xPath = XPathFactory.newInstance().newXPath();
        String xpathExpr = "/vehiculos/vehiculo";
        return  (NodeList) xPath.compile(xpathExpr).evaluate(doc, XPathConstants.NODESET);
    }

    public void getVehiculos(ParqueVehiculos parqueVehiculos) throws XPathExpressionException {
        NodeList nodeList = xpath();
        for (int i=0; i<nodeList.getLength();i++){
            Element elementoVehiculo = (Element) nodeList.item(i);
            Vehiculo vehiculo = getVehiculo(elementoVehiculo);
            parqueVehiculos.getListaVehiculos().add(vehiculo);
        }
    }

    private Vehiculo getVehiculo(Element elementoVehiculo){
        String marca = elementoVehiculo.getAttribute("marca");
        String modelo = elementoVehiculo.getAttribute("modelo");
        int kilometros = Integer.parseInt(elementoVehiculo.getAttribute("kilometros"));
        String combustible = elementoVehiculo.getAttribute("combustible");
        double precio = Double.parseDouble(elementoVehiculo.getAttribute("precio"));
        int unidades = Integer.parseInt(elementoVehiculo.getAttribute("unidades"));
        return new Vehiculo(marca,modelo,combustible,kilometros,precio,unidades);
    }

}
