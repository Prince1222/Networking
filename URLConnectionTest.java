import java.io.*;
import java.net.*;
public class URLConnectionTest {
    public static void main(String[] args) throws Exception {
        try {
            //URL u = new URL("https://www.javatpoint.com/java-networking");
            URL u = new URL("https://run.mocky.io/v3/de4cf633-758f-45e8-abbe-507d1c8efdd4");
            URLConnection uc = u.openConnection();
            System.out.println("Content-Type: " +uc.getContentType());
        }
            catch(MalformedURLException e){
                System.out.println(e);
            }
            
        catch (IOException e) {
            System.err.println(e);
        }
    }
}