import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     /*System.out.println("enter the speed limit");*/
     int SpeedLimit=in.nextInt();
     /*System.out.println("enter the recorded speed of the car");*/
     int CarSpeed=in.nextInt();
     int speeding = CarSpeed-SpeedLimit;
     if (speeding <=0)
      System.out.println("Congratulations, you are within the speed limit!");
     else if (speeding <=20)
      System.out.println("You are speeding and your fine is $100.");
     else if (speeding <=30)
      System.out.println("You are speeding and your fine is $270.");
     else if (speeding>=31)
      System.out.println("You are speeding and your fine is $500.");


    



  }
}
