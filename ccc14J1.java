import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     int one=in.nextInt();
     int two=in.nextInt();
     int three=in.nextInt();

     if (one+two+three==180 && one!=three && one!=two && two!=three)
      System.out.println("Scalene");
     
     else if (one==two && two==three && three==60)
      System.out.println("Equilateral");
     
     else if (one+two+three!=180)
      System.out.println("Error");
    
     else if (one+two+three==180 && (one==two||one==three||two==three))
      System.out.println("Isosceles");






  }
}
