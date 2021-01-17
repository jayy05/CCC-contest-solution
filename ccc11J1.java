import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     int antenna = in.nextInt();
     int eye = in.nextInt();
     if (antenna >=3 && eye<=4)
      System.out.println("TroyMartian");
     if (antenna <=6 && eye>=2)
      System.out.println("VladSaturnian");
     if (antenna <=2 && eye<=3)
      System.out.println("GraemeMercurian");

  }
}
