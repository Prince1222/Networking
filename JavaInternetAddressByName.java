import java.net.*;
public class JavaInternetAddressByName {
    public static void printIP(String hostname){
        try {
            InetAddress address = InetAddress.getByName(hostname);
            System.out.println(address);
        } catch (UnknownHostException ex) {
            System.out.println(ex.getMessage());
        }
    }
        
    
    public static void main(String[] args) {
        printIP("www.google.com");
        printIP("localhost");
        printIP("www.krishalbabu.com");

        
    }
}