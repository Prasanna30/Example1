
public class App 
{
    public static void main( String[] args )
    {
       String x = "abc";
       String y = "bdea";
       
       for(int i=0; i< x.length(); i++ ) {
          if(y.indexOf(x.charAt(i))!= -1) {
           System.out.println(x.charAt(i)+" : "+i+","+y.indexOf(x.charAt(i)));
           }
       }
    }
    
    
}