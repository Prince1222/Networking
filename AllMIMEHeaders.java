import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;

public class AllMIMEHeaders {

	public static void main(String[] args) {
		try {
			//URL u = new URL("https://run.mocky.io/v3/d97d5760-a430-4262-aa70-08e5d4c29015");
            URL u = new URL("https://run.mocky.io/v3/e8ddc7d2-5d14-44e1-b839-54f1c177651b");
			URLConnection uc = u.openConnection();
			
			for (int i = 0; ; i++) {
				String header = uc.getHeaderField(i);
				if(header == null) {
					break;
				}
				System.out.println(uc.getHeaderFieldKey(i) + " : " + header); 
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}