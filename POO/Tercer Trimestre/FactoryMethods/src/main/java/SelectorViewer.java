import javax.swing.text.html.HTML;

public class SelectorViewer {

    public Viewer asignarViewer (String viewer) {
        Viewer viewer1 = null;
        if (viewer.equals("html")) {
            viewer1 = new HTMLViewer();
        } else if (viewer.equals("text")) {
            viewer1 = new TextViewer();
        }
        return viewer1;
    }
}
