import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
    int Repeats,linesOfInput;
    char symbol;
    
    linesOfInput =in.nextInt();
    
    for (int i=0; i<linesOfInput;i++){
      Repeats=in.nextInt();
      symbol=in.next().charAt(0);

    for (int j=0;j<Repeats;j++){
      System.out.print(symbol);

    }
    System.out.println("");

    }



   }
}
