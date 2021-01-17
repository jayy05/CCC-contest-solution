import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     int a=in.nextInt();
     int b=in.nextInt();
     for(int i=a;i<=b;i+=60){
      System.out.println("All positions change in year "+ i);   
     }
  }
}

// OR:

import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     int a=in.nextInt();
     int b=in.nextInt();
     int x = 0;

     for (int i = a; i<= b; i++){
      if (x%4==0 && x%2==0 && x%5==0 && x%3==0){
      System.out.println("All positions change in year "+ i);
      }
      x++;
     }
     
  }
}
