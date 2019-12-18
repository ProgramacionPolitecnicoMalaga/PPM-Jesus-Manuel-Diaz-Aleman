import org.w3c.dom.NodeList;

import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

public class Inventario {

    ArrayList<Componente> existencias;

    public Inventario() {
        existencias = new ArrayList<>();
    }


    public void add(Componente existencia, int cantidadInicial){
        //TODO Comprobar que no existe ya
        existencia.setCantidad(cantidadInicial);
        existencias.add(existencia);
    }

    public void reponer(String id, int cantidad){
        Iterator<Componente> itExistencia = existencias.iterator();
        while (itExistencia.hasNext()){
            Componente existencia = itExistencia.next();
            if (existencia.getId().equals(id)){
                existencia.setCantidad(existencia.getCantidad() + cantidad);
            }
        }
    }

    public void contabilizaProducto(Producto producto) {
        Iterator<Componente> itEspecificaciones = producto.getEspecificaciones().iterator();

        while (itEspecificaciones.hasNext()) {
            Componente especificaciones = itEspecificaciones.next();
            Iterator<Componente> itExistencias = existencias.iterator();
            boolean encontrado = false;
            while ((itExistencias.hasNext()) && (!encontrado)) {
                Componente existencia = itExistencias.next();
                if (existencia.equals(especificaciones)) {
                    existencia.setCantidad(existencia.getCantidad() - especificaciones.getCantidad());
                    encontrado = true;
                }
            }
        }
    }

    public ArrayList<Componente> minimaExistencia(Producto producto) {
        ArrayList<Componente> escasos = new ArrayList<Componente>();
        Iterator<Componente> itEspecificaciones = producto.getEspecificaciones().iterator();

        while (itEspecificaciones.hasNext()) {
            Componente especificaciones = itEspecificaciones.next();
            Iterator<Componente> itExistencias = existencias.iterator();
            boolean encontrado = false;
            while ((itExistencias.hasNext()) && (!encontrado)) {
                Componente existencia = itExistencias.next();
                if (existencia.equals(especificaciones)) {
                    if (existencia.getCantidad() - especificaciones.getCantidad() * 10 < 0) ;
                    escasos.add(existencia);
                    encontrado = true;

                }
            }
        }
        return escasos;
    }

    @Override
    public String toString() {
        //TODO mejorar presentacion
        return "Inventario{" +
                "existencias=" + existencias +
                '}';
    }
    public void leerXML(String nombreArchivo){
        String dir = System.getProperty("user.dir");
        System.out.println(dir);
        try{
            File inputFile = new File();
            DocumentBuilderFactory;
            DocumentBuilder;
            Document;
            doc.getDocumenteElement().normalize();

            xPath xPath = xPathFactory.newInstance().newXPath();
            String xparthExpr = "/inventario/componente";
            NodeList nodeList = (NodeList) xPath.compile(xparthExpr).evaluate(doc, XPathConstants, NODESET);

            for (int i=0; i<nodeList.getLength(); i++){
                Element elementExistencia = (Element) nodeList.item(i);

            }
        }
    }
}