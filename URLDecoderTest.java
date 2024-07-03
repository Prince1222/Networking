import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class URLDecoderTest {
    public static void main(String[] args) {
        try {
            String encodedUrl = "https://www.google.com/search?q=freepik&sca_esv=012f470da02fcbcc&sca_upv=1&sxsrf=ADLYWIKSkrVVeEf3GgI_KJ9kuD6zYg1rWw%3A1719973641697&ei=CbeEZqeeKuHQhbIP3O-0mAs&ved=0ahUKEwjnxr6P6YmHAxVhaEEAHdw3DbMQ4dUDCA8&uact=5&oq=freepik&gs_lp=Egxnd3Mtd2l6LXNlcnAaAhgDIgdmcmVlcGlrMgoQIxiABBgnGIoFMhYQLhiABBixAxjRAxhDGIMBGMcBGIoFMgoQABiABBhDGIoFMgUQABiABDIIEAAYgAQYiwMyCBAAGIAEGIsDMgUQABiABDIIEAAYgAQYiwMyCBAAGIAEGIsDMggQABiABBiLAzIlEC4YgAQYsQMY0QMYQxiDARjHARiKBRiXBRjcBBjeBBjgBNgBAkiAGVCNDFjIFXADeAGQAQCYAawEoAG-F6oBBTQtMy4zuAEDyAEA-AEBmAIJoAL-F8ICChAAGLADGNYEGEfCAg0QABiABBiwAxhDGIoFwgIZEC4YgAQYsAMY0QMYQxjHARjIAxiKBdgBAcICEBAAGIAEGLEDGEMYgwEYigXCAgwQABiABBhDGIoFGArCAhEQLhiABBixAxjRAxiDARjHAcICCBAuGIAEGLEDwgINEAAYgAQYsQMYFBiHAsICDhAAGIAEGLEDGIMBGIoFwgIREC4YgAQYsQMYqAMYmQMYiwPCAg0QABiABBgUGIcCGIsDwgIEEAAYA8ICCBAAGIAEGLEDwgIKEAAYgAQYChiLA5gDAOIDBRIBMSBAiAYBkAYNugYECAEYCLoGBggCEAEYFJIHBTMuNC02oAe1QQ&sclient=gws-wiz-serp";
            String decodedUrl = URLDecoder.decode(encodedUrl, "UTF-8");
            System.out.println("Encoded URL: " + encodedUrl);
            System.out.println("Decoded URL: " + decodedUrl);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}