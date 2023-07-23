import java.util.*;
import java.util.regex.*;

public class TagContentExtractor {
    
   public static void main(String[] args){
      try (Scanner in = new Scanner(System.in)) {
        int t = Integer.parseInt(in.nextLine());
          
          while(t-->0){
              String line = in.nextLine();
             
              Matcher m = Pattern.compile("<(.+)>(([^<>]+))</\\1>").matcher(line);
              
              if (!m.find()) {
                  System.out.println("None");
                  continue;
              }
              
              m.reset();
              while (m.find()){
                  System.out.println(m.group(2));
              }
           }
    } catch (NumberFormatException e) {
       
        e.printStackTrace();
    }
    }
 }