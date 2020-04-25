import io.github.cdimascio.dotenv.Dotenv;

public class LectorENV {
    Dotenv dotenv;

    public LectorENV(){
        dotenv = Dotenv.configure().load();
    }

    public String getTipoViewer(){
        return dotenv.get("viewer");
    }
}
