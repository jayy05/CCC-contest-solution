import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     int wins=0;
     int loss=0;
     char symbol;
     for (int i=0;i<6;i++){
     symbol=in.next().charAt(0);

      if (symbol=='W')
        wins++;
      else if (symbol=='L')
        loss++;
     }
     if (wins==5||wins==6)
      System.out.println(1);
     else if (wins==3||wins==4)
      System.out.println(2);
     else if (wins==2||wins==1)
      System.out.println(3);
     else if (wins==0)
      System.out.println(-1);
  }
}
