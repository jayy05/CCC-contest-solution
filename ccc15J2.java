import java.lang.*;
import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     int happy=0;
     int sad=0;
     String a = in.nextLine();
     char c;
     for(int i=0;i<a.length()-3;i++)
      {
       c=a.charAt(i);
       if (c==':')
        c=a.charAt(i+1);
       if (c=='-')
        c=a.charAt(i+2);
       if (c==')')
        happy+=1;
       else if (c=='(')
        sad++;
      }
  
     if (happy==0 && sad==0)
      System.out.println("none");
     else if (happy==sad)
      System.out.println("unsure");
     if (happy>sad)
      System.out.println("happy");
     if (happy<sad)
      System.out.println("sad");                                                                                                      
    }
  }
