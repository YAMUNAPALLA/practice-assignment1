import java.util.Scanner;

public class patternSyntaxChecker
{
   public static void main(String[] args){
      try (Scanner in = new Scanner(System.in)) {
        int testCases = Integer.parseInt(in.nextLine());
          while(testCases>0){
             try{
                  System.out.println("Valid");
              }catch(Throwable t){
                  System.out.println("Invalid");
              }
              testCases--;
                 //Write your code
          }
    } catch (NumberFormatException e) {
        
        e.printStackTrace();
    }
   }
}