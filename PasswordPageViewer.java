import java.io.*;
import java.net.*;

 class passwordedPageViewer{
    public static void main(String[] args){
        for (int i = 0; i<args.length; i++){
            try{
                URL u = new URL(args[i]);
                URLConnection uc = u.openConnection();
                uc.setAllowUserInteraction(true);

                InputStream in = uc.getInputStream();
                Reader r = new InputStreamReader(in);
                int c;

            while ((c= r.read() )!=-1){
                System.out.println((char) c);
                
            }
            System.out.println();
            }
            catch(IOException e){
                System.err.println(e);
            }
            
        }
    }
}