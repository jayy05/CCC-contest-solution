import java.util.*;
public class Main {
   public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     int diem= in.nextInt();
     int dien= in.nextInt();
     int counter=0;
     for (int m=1;m<=diem;m++){
     for (int n=1;n<=dien;n++){
      if (m+n==10)
        counter+=1;

     }
     }
     if (counter ==1)
      System.out.println("There is 1 way to get the sum 10.");
     else 
      System.out.println("There are " + counter+ " ways to get the sum 10.");
  }
}
