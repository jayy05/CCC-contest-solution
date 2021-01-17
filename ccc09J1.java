import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     int a = in.nextInt();
     int b = in.nextInt();
     int c = in.nextInt();
     int sum;
     int add;
     int total;
  
     sum=(9*1)+(7*3)+(8*1)+(0*3)+(9*1)+(2*3)+(1*1)+(4*3)+(1*1)+(8*3);
     add=a*1+b*3+c*1;
     total=sum+add;
     System.out.println("The 1-3-sum is "+total);


  }
}
