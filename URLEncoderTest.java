import java.net.URLEncoder;
import java.io.UnsupportedEncodingException;

public class URLEncoderTest{
    public static void main(String []args){
    try{
      System.out.println(URLEncoder.encode("This string has spaces","UTF-8"));
      System.out.println(URLEncoder.encode("This*string*has*asterisks","UTF-8"));
      System.out.println(URLEncoder.encode("This%string%has%percentage%signs","UTF-8"));
      System.out.println(URLEncoder.encode("This+string+has+pluses","UTF-8"));
      System.out.println(URLEncoder.encode("This/string/has/slashes","UTF-8"));
      System.out.println(URLEncoder.encode("This\"string\"has\" quotes\"maarks","UTF-8"));
      System.out.println(URLEncoder.encode("This:string:has:colons","UTF-8"));
      System.out.println(URLEncoder.encode("This~string~has~tildes","UTF-8"));
      System.out.println(URLEncoder.encode("This(string)has(parenthese)","UTF-8"));
      System.out.println(URLEncoder.encode("This.string.has.periods","UTF-8"));
      System.out.println(URLEncoder.encode("This=string=has=equal=signs","UTF-8"));
      System.out.println(URLEncoder.encode("This string has spaces","UTF-8"));
      System.out.println(URLEncoder.encode("This&string&has&ampersands","UTF-8"));
      System.out.println(URLEncoder.encode("Thiséstringéhasé non-ASCII characters", "UTF-8"));
      System.out.println(URLEncoder.encode("", "UTF-32"));

    }
    catch(UnsupportedEncodingException ex){
        throw new RuntimeException("Broken VM does not support UTF-8");

    }
}
}