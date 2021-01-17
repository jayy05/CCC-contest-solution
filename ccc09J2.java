import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     int troutPoints=in.nextInt();
     int pikePoints=in.nextInt();
     int pickerelPoints=in.nextInt();
     int totalPoint=in.nextInt();
     int counter=0;

     for (int i=0;i<=totalPoint/troutPoints;i++){      
     for (int j=0;j<=totalPoint/pikePoints;j++){       
     for (int k=0;k<=totalPoint/pickerelPoints;k++){      
       if (i==0 && j==0 && k==0)
        continue;
       if ((i*troutPoints)+(j*pikePoints)+(k*pickerelPoints)<=totalPoint){
        System.out.println(i+" Brown Trout, "+j+ " Northern Pike, "+k+ " Yellow Pickerel");
        counter++;

       }
     }
     }
     }
    System.out.println("Number of ways to catch fish: "+counter); 



  }
}
