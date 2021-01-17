import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     int num_votes = in.nextInt();
     String votes = in.nextLine();
     int A=0;
     votes = in.nextLine();
     int B=0;
     for (int i=0;i<num_votes;i++){
      if (votes.charAt(i)==('A')){A++;}
      
      else if (votes.charAt(i)==('B')){B++;}

     }
     if (A>B)
      System.out.println("A");
     else if (A<B)
      System.out.println("B");
     else if (A==B)
      System.out.println("Tie");

 }
}
