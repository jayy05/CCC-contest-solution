import java.lang.Math;
import java.util.*;
public class Main {
   public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     int daytime=in.nextInt();
     int evening=in.nextInt();
     int weekend=in.nextInt();
     double PlanA;
     double PlanB;

     PlanA=(0.25*(daytime-100))+(evening*0.15)+(weekend*0.20);
     PlanB=(0.45*(daytime-250))+(evening*0.35)+(weekend*0.25);
     if (daytime<100){
       PlanA=(0.25*0)+(evening*0.15)+(weekend*0.20);
     }
     if (daytime<250){
      PlanB=(evening*0.35)+(weekend*0.25);
     }
     
     PlanA = Math.round(PlanA * 100.0) / 100.0;
     PlanB = Math.round(PlanB * 100.0) / 100.0;

     if (PlanA<PlanB){
      System.out.println("Plan A costs "+PlanA);
      System.out.println("Plan B costs "+PlanB);
      System.out.println("Plan A is cheapest.");
     }
     else if (PlanB<PlanA){
      System.out.println("Plan A costs "+PlanA);
      System.out.println("Plan B costs "+PlanB);
      System.out.println("Plan B is cheapest.");
     }
     else if (PlanA==PlanB){
      System.out.println("Plan A costs "+PlanA);
      System.out.println("Plan B costs "+PlanB);
      System.out.println("Plan A and B are the same price.");     
     }
  }
}
