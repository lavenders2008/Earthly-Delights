import java.io.File;
import java.awt.Desktop;

public class Earthly_Delights{
    public static void main(String[] args)throws Exception {
    String URL = "Main.html";
    File file =  new File(URL);
    Desktop.getDesktop().browse(file.toURI());   


    }
}