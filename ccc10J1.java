import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     int number = in.nextInt();
     int count =0;
     for (int i=0;i<6;i++){
       if (number-i<=5 &&i<=number-i){
         count++;
       }
     }
        
        System.out.println(count);
     
    


  }
}
