import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
     Scanner in = new Scanner(System.in);

    int sum = 0;
    int n = in.nextInt();
    int k = in.nextInt();
    for (int i=0;i<=k;i++){
      sum = n+sum;
      n=n*10;
    }
    System.out.println(sum);




 }
}
