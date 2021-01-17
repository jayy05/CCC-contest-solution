import java.util.*;
public class Main {
   public static void main(String[] args) {
     Scanner fc = new Scanner(System.in);
     String txtmsg= fc.nextLine();
     while (true){

     if (txtmsg.equals("CU"))
      System.out.println("see you");
     else if (txtmsg.equals(":-)"))    
      System.out.println("I'm happy");
     else if (txtmsg.equals(":-("))  
      System.out.println("I'm unhappy");
     else if (txtmsg.equals(";-)"))  
      System.out.println("wink");   
     else if (txtmsg.equals(":-P"))  
      System.out.println("stick out my tongue"); 
     else if (txtmsg.equals("(~.~)"))  
      System.out.println("sleepy"); 
     else if (txtmsg.equals("TA"))  
      System.out.println("totally awesome");   
     else if (txtmsg.equals("CCC"))  
      System.out.println("Canadian Computing Competition"); 
     else if (txtmsg.equals("CUZ"))  
      System.out.println("because"); 
     else if (txtmsg.equals("TY"))  
      System.out.println("thank-you"); 
     else if (txtmsg.equals("YW"))  
      System.out.println("you're welcome"); 
     
     else if (txtmsg.equals("TTYL")){    
      System.out.println("talk to you later");
      break;

      

     }
     else 
      System.out.println(txtmsg);
     
     txtmsg= fc.nextLine();

     }
  }
}
