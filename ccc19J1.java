import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     
    //declaration
    int A,B,A1,A2,A3,B1,B2,B3;
    

    //get the input from the user
    A3=in.nextInt();
    A2=in.nextInt();
    A1=in.nextInt();
    B3=in.nextInt();
    B2=in.nextInt();
    B1=in.nextInt();

    //you use those variables
    A=A3*3+A2*2+A1;
    B=B3*3+B2*2+B1;
    if (A>B)
      System.out.println("A");
    if (B>A)
      System.out.println("B");
    if (A==B)
      System.out.println("T");



   }
}
