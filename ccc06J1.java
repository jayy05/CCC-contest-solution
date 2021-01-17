import java.util.*;
public class Main {
   public static void main(String[] args) {
     Scanner fc = new Scanner(System.in);
     int burger= fc.nextInt();
     int side= fc.nextInt();
     int drink= fc.nextInt();
     int dessert= fc.nextInt();
     int calburger=0;
     int calside=0;
     int caldrink=0;
     int caldessert=0;
     int calories;
      
     if (burger==1)
      calburger=461;
     else if (burger==2)
      calburger=431;
     else if (burger==3)
      calburger=420;
     else if (burger==4)
      calburger=0;
     

     if (side==1)
      calside=100;
     else if (side==2)
      calside=57;
     else if (side==3)
      calside=70;
     else if (side==4)
      calside=0;

     if (drink==1)
      caldrink=130;
     else if (drink==2)
      caldrink=160;
     else if (drink==3)
      caldrink=118;
     else if (drink==4)
      caldrink=0;

     if (dessert==1)
      caldessert=167;
     else if (dessert==2)
      caldessert=266;
     else if (dessert==3)
      caldessert=75;
     else if (dessert==4)
      caldessert=0;
     
     calories=calburger+calside+caldrink+caldessert;
     System.out.println("Your total Calorie count is "+calories+".");

     
         



     
  }
}
