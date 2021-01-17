import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     int P,N,R;
     P = in.nextInt();
     N = in.nextInt();
     R = in.nextInt();
     int total = N;
     int day = 0;
     
     while(total<=P){
      N = R*N;
      total = total + N;
      day=day+1;
    
     }
     System.out.println(day);
    
  }
}
