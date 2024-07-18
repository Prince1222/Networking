import java.io.*;
import java.net.*;

public class SourceViewer2 {
    public static void main(String[] args) {
        if (args.length > 0) {
            try {
                // Open the URLConnection for reading
                URL u = new URL(args[0]); // Use the provided URL from command line
                URLConnection uc = u.openConnection();
                InputStream raw = uc.getInputStream();
                InputStream buffer = new BufferedInputStream(raw);

                // Chain the InputStream to a reader
                Reader r = new InputStreamReader(buffer);
                int c;
                while ((c = r.read()) != -1) {
                    System.out.print((char) c); // Use print instead of println for continuous output
                }
                System.out.println(); // Add a newline at the end

            } catch (MalformedURLException e) {
                System.err.println(args[0] + " is not a parseable URL");
            } catch (IOException e) {
                System.err.println(e);
            }
        }//end if
    }//end main
}//end SourceViewer2
