public class Main {
    public static void main(String[] args) {
        SelectorViewer viewerFactory = new SelectorViewer();

        LectorENV lectorENV = new LectorENV();
        String tipoViewer = lectorENV.getTipoViewer();
        Viewer viewer = viewerFactory.asignarViewer(tipoViewer);

        LectorXML lectorXML = new LectorXML();
        System.out.println(viewer.mostratDatos(lectorXML.getPoblaciones()));





    }
}
