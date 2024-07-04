import com.macfaq.net.*;
import java.net.*;
import java.io.*;
public class DMoz {
    public static void main(String[] args) {
        String target = "";
        for(int i=0; i<args.length;i++){
            target += args[i] + " ";
        }
        target = target.trim( );
        QueryString query = new QueryString("Search",target);
        try{
         URL u = new URL("http://search.dmoz.org/cgi/search?" +query);
         InputStream in = new BufferedInputStream(u.openStream( ));
         InputStreamReader theHTML = new InputStreamReader(in);
         int c;
         while ((c=theHTML.read( )) != -1) {
          System.out.println((char) c);            
         }
        }
        catch(MalformedURLException ex){
         System.err.println(ex);
        }
        catch(IOException ex){
            System.err.println(ex);
               }
 }
}