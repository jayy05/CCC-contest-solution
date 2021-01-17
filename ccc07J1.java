import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     int weightA= in.nextInt();
     int weightB= in.nextInt();
     int weightC= in.nextInt();
     if (weightA>weightB && weightA<weightC)
      System.out.println(weightA);
     if (weightA<weightB && weightA>weightC)
      System.out.println(weightA);
     if (weightB<weightA && weightB>weightC)
      System.out.println(weightB);
     if (weightB>weightA && weightB<weightC)
      System.out.println(weightB);
     if (weightC<weightA && weightC>weightB)
      System.out.println(weightC);
     if (weightC>weightA && weightC<weightB)
      System.out.println(weightC);
     
  }
}
