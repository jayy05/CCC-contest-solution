import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     int month = in.nextInt();
     int day = in.nextInt();
     if (month==2 && day==18)
      System.out.println("Special");
     if (month==2 && day>18)
      System.out.println("After");
     if (month>2)
      System.out.println("After");
     if (month==2 && day<18)
      System.out.println("Before");
     if (month<2)
      System.out.println("Before");
  }
}
