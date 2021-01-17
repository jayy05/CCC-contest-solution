import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     int N = in.nextInt();
     in.nextLine();
     String yesterday = in.nextLine();
     String today = in.nextLine();
     int counter = 0;

    for (int i=0; i<N;i++){
      if (yesterday.charAt(i)==today.charAt(i)&&today.charAt(i)=='C'){
        counter++;
      }
    }
    System.out.println(counter);

  }
}
