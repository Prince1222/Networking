import java.net.*;

public class URISplitter{
    public static void main(String[] args) {
    
        for(int i = 0;i<args.length;i++){
            try{
                URI u = new URI(args[i]);
                System.out.println("The URI is "+u);
                if(u.isOpaque( )){
                    System.out.println("The  is  an opaque URI");
                    System.out.println("The scheme is "+u.getScheme( ));
                    System.out.println("The fragment is "+u.getFragment( ));}
                    else{
                      System.out.println("This is a hiearachical URI.");
                      System.out.println("The scheme is "+u.getScheme( ));
                      try{
                        u = u.parseServerAuthority( );
                        System.out.println("The host is "+u.getUserInfo( ));
                        System.out.println("The port is "+u.getPort( ));
                      }
                      catch(URISyntaxException ex){
                        //Must be a registry based authority
                        System.out.println("The authority is"+u.getAuthority( ) );


                    }
                    System.out.println("The path is " +u.getPath( ));
                    System.out.println("The Fragment is "+u.getFragment( ));   
            }//end else
        }//end try
    catch(URISyntaxException ex){
        System.err.println(args[i]+ "does not seem to be a URI.");
    }
    System.out.println( );
    }//endfor
}//endmain
}//end URISplitter