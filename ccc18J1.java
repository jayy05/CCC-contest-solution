import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     int digit1=in.nextInt();
     int digit2=in.nextInt();
     int digit3=in.nextInt();
     int digit4=in.nextInt();

     if ((digit1==8||digit1==9)&&(digit4==8||digit4==9)&&(digit2==digit3))
       System.out.println("ignore");
     else
       System.out.println("answer");

  }
}
