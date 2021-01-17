import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     int one = in.nextInt();
     int two = in.nextInt(); 
     int three = in.nextInt();
     int four = in.nextInt();
     if (one<two && two<three && three<four)
      System.out.println("Fish Rising");
     else if (one>two && two>three && three>four)
      System.out.println("Fish Diving");
     else if (one==two && two==three && three==four)
      System.out.println("Fish At Constant Depth");
     else 
      System.out.println("No Fish");





  }
}
