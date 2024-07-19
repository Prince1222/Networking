import java.io.*;
import java.net.*;

public class OpenConnection {
    public static void main(String[] args) {
        try {
            //URL u = new URL("http://www.oreilly.com");
            URL u = new URL("https://run.mocky.io/v3/e8ddc7d2-5d14-44e1-b839-54f1c177651b");
            URLConnection uc = u.openConnection();

            // Proceed with reading from the connection
            InputStream inputStream = uc.getInputStream();
            InputStreamReader reader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close(); // Close resources properly

        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
