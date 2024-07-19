import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;
public class URLConnectionDemo {
	public static void main(String[] args) throws Exception{
	
	int c;
	//URL hp = new URL ("https://www.w3schools.com/java/default.asp");
	URL hp = new URL("https://run.mocky.io/v3/6b730d7b-a680-48c4-bbfa-57a6bc4a1fe4");
	URLConnection hpCon = hp.openConnection();
	
	//get date
	long d = hpCon.getDate();
	if(d==0) {
		System.out.println("No date information.");
	}
	else
	{
		System.out.println("Date: "+new Date(d));
	}
	
	//get Content type
	System.out.println("Content-type: "+hpCon.getContentType());
	
	//get Expiration date
	d = hpCon.getExpiration();
	if(d==0) {
	System.out.println("No Expiration Information: ");
	
	}
	else {
		System.out.println("Expires:"+new Date(d));
	}
	
	d = hpCon.getLastModified();
	if(d==0) {
		System.out.println("No Last-modified Information. ");
		
	}
	else {
		System.out.println("Last modified:"+new Date(d));
	}

	int len = hpCon.getContentLength();
	if(len ==-1) {
		System.out.println("Content Length Unavailable.");
	}
	else {
		System.out.println("Content-Length "+len);
	}
	
	if(len>=0) {
		System.out.println("=== Content ===");
		InputStream input = hpCon.getInputStream();
		int i= len;
		
		while(((c = input.read())!= -1)) { // && (--i>0)){
			System.out.print((char)c);
		}
		input.close();
	}
	else {
		System.out.print("NO Content Available.");
	}
	
	}
}